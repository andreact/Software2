package com.prelex.prelex.controladoras;

import com.prelex.prelex.entidades.Estudiante;
import com.prelex.prelex.servicios.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Angey
*
*/
@Controller
public class EstudianteControladora {
	
	@Autowired
	private EstudianteServicio estudianteServicio;
	
	@RequestMapping(value = "/estudiantes", method = RequestMethod.GET)
    public String lista(Model model) {
		model.addAttribute("estudiantes", estudianteServicio.listaEstudiantes());
		return "estudiantes";
	}
	
	@RequestMapping("estudiante/{id}")
	public String mostrarEstudiante(@PathVariable String id, Model model){
		model.addAttribute("estudiante", estudianteServicio.obtenerEstudiantePorId(id));
		return "mostrarEstudiantes";
	}
	 
	@RequestMapping("estudiante/editar/{id}")
	public String editarEstudiante(@PathVariable String id, Model model) {
		model.addAttribute("estudiante", estudianteServicio.obtenerEstudiantePorId(id));
		return "formularioEstudiantes";
	}

    @RequestMapping("estudiante/nuevo")
    public String nuevoEstudiante(Model model)
    {
        model.addAttribute("estudiante", new Estudiante());
        return "formularioEstudiante";
    }

    @RequestMapping(value = "estudiante", method = RequestMethod.POST)
    public String guardarEstudiante(Estudiante estudiante)
    {
        estudianteServicio.guardarEstudiante(estudiante);
        return "redirect:/estudiante/"+ estudiante.getNumeroDocumento();
    }

    @RequestMapping("estudiante/eliminar/{id}")
    public String eliminarEstudiante(@PathVariable String id)
    {
        estudianteServicio.eliminarEstudiante(id);
        return "redirect:/estudiantes";
    }
}
