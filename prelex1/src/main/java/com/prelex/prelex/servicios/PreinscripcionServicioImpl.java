/**
 *
 */
package com.prelex.prelex.servicios;

import com.prelex.prelex.entidades.Preinscripciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prelex.prelex.repositorios.PreinscripcionRepositorio;

import java.util.LinkedList;

/**
 * @author andrea
 */

@Service
public class PreinscripcionServicioImpl implements PreinscripcionServicio {

    @Autowired
    private PreinscripcionRepositorio preinscripcionRepositorio;

    @Override
    public LinkedList<Preinscripciones> listaPreinscripciones()
    {
        LinkedList<Preinscripciones> preinscripciones = new LinkedList<>();
        preinscripcionRepositorio.findAll().iterator().forEachRemaining(preinscripciones::add);
        return preinscripciones;
    }

    @Override
    public Preinscripciones obtenerPreinscripcion(String id) {
        return preinscripcionRepositorio.findOne(id);
    }

    @Override
    public Preinscripciones guardarPreinscripcion(Preinscripciones p) {
        return preinscripcionRepositorio.save(p);
    }

    @Override
    public void eliminarPreinscripcion(String id) {
        preinscripcionRepositorio.delete(id);

    }


}
