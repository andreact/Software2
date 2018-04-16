package com.prelex.prelex.controladoras;

import com.prelex.prelex.entidades.Profesores;
import com.prelex.prelex.servicios.ProfesoresServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Deivid
*
*/
@Controller
public class ProfesoresControladora {
	
	@Autowired
	private ProfesoresServicio profesoresServicio;
	
	@RequestMapping(value = "/profesores", method = RequestMethod.GET)
    public String lista(Model model) {
		model.addAttribute("profesores", profesoresServicio.listaProfesores());
		return "profesores";
	}
	
	@RequestMapping("profesores/{id}")
	public String mostrarProfesores(@PathVariable String id, Model model){
		model.addAttribute("profesores", profesoresServicio.obtenerProfesores(id));
		return "mostrarProfesores";
	}
	 
	@RequestMapping("profesores/editar/{id}")
	public String editarProfesores(@PathVariable String id, Model model) {
		model.addAttribute("profesores", profesoresServicio.obtenerProfesores(id));
		return "formularioProfesores";
	}

    @RequestMapping("profesores/nuevo")
    public String nuevoProfesores(Model model)
    {
        model.addAttribute("profesores", new Profesores());
        return "formularioProfesores";
    }

    @RequestMapping(value = "profesores", method = RequestMethod.POST)
    public String guardarProfesores(Profesores profesores)
    {
    	profesoresServicio.guardarProfesores(profesores);
        return "redirect:/profesores/"+ profesores.getNumeroDocumento();
    }

    @RequestMapping("profesores/eliminar/{id}")
    public String eliminarProfesores(@PathVariable String id)
    {
    	profesoresServicio.eliminarProfesores(id);
        return "redirect:/profesores";
    }
}
