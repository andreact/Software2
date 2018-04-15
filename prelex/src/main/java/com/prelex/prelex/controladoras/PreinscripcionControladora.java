package com.prelex.prelex.controladoras;

import com.prelex.prelex.entidades.Preinscripcion;
import com.prelex.prelex.servicios.PreinscripcionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cvem8165 on 14/04/18.
 */
public class PreinscripcionControladora
{
    @Autowired
    private PreinscripcionServicio preinscripcionServicio;

    @RequestMapping(value = "/preinscripciones", method = RequestMethod.GET)
    public String lista(Model model)
    {
        model.addAttribute("preinscripciones", preinscripcionServicio.listaPreinscripciones());
        return "preinscripciones";
    }

    @RequestMapping("preinscripcion/{id}")
    public String mostrarPreinscripcion(@PathVariable String id, Model model)
    {
        model.addAttribute("preinscripcion", preinscripcionServicio.obtenerPreinscripcion(id));
        return "mostrarPreinscripcion";
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
        model.addAttribute("preinscripcion", new Preinscripcion());
        return "formularioPreinscripcion";
    }

    @RequestMapping(value = "/preinscripcion", method = RequestMethod.POST)
    public String guardarPreinscripcion(Preinscripcion p)
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
