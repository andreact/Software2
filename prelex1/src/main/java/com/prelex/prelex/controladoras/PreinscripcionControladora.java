package com.prelex.prelex.controladoras;

import com.prelex.prelex.entidades.Preinscripciones;
import com.prelex.prelex.servicios.PreinscripcionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.LinkedList;

/**
 * Created by andrea
 */
@Controller
public class PreinscripcionControladora
{
    @Autowired
    private PreinscripcionServicio preinscripcionServicio;

    @RequestMapping(value = "/preinscripciones", method = RequestMethod.GET)
    public String lista(Model model)
    {
        LinkedList<Preinscripciones> preinscripciones = preinscripcionServicio.listaPreinscripciones();
        for (Preinscripciones preins:
             preinscripciones) {
            System.out.println(preins.getNumeroDocumento());
        }

        model.addAttribute("preinscripciones", preinscripciones);
        return "preinscripciones";
    }

    @RequestMapping("preinscripcion/{id}")
    public String mostrarPreinscripcion(@PathVariable String id, Model model)
    {   LinkedList<Preinscripciones> preinscripciones = new LinkedList<>();
        Preinscripciones preinscripcion = preinscripcionServicio.obtenerPreinscripcion(id);

        if (preinscripcion !=null)
        {
            preinscripciones.add(preinscripcion);
        }
        model.addAttribute("preinscripciones", preinscripciones);

        return "preinscripciones";
    }

    @RequestMapping("preinscripcion/editar/{id}")
    public String editar(@PathVariable String id, Model model)
    {
        model.addAttribute("preinscripcion", preinscripcionServicio.obtenerPreinscripcion(id));
        return "formularioPreinscripcion";
    }

    @RequestMapping("preinscripcion/nuevo")
    public String nuevaPreinscripcion(Model model)
    {
        //model.addAttribute("preinscripcion", new Preinscripciones());
        return "formularioPreinscripcion";
    }


    @PostMapping("/preinscripcion")
    // Con @valid nos aseguramos que el contenido de la peticion sea valido
    public String guardarPreinscripcion(@Valid @RequestBody Preinscripciones p)
    {
        preinscripcionServicio.guardarPreinscripcion(p);
        return "redirect:/preinscripcion/"+ p.getNumeroDocumento();
    }

    @RequestMapping("preinscripcion/eliminar/{id}")
    public String eliminar(@PathVariable String id)
    {
        preinscripcionServicio.eliminarPreinscripcion(id);
        return "redirect:/preinscripciones";
    }



}
