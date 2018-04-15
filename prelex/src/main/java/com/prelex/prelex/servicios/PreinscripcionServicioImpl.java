/**
 * 
 */
package com.prelex.prelex.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prelex.prelex.entidades.Preinscripcion;
import com.prelex.prelex.repositorios.PreinscripcionRepositorio;

/**
 * @author cvem8165
 *
 */

@Service
public class PreinscripcionServicioImpl implements PreinscripcionServicio {

	@Autowired
	private PreinscripcionRepositorio preinscripcionRepositorio;

	@Override
	public Iterable<Preinscripcion> listaPreinscripciones() {
		return preinscripcionRepositorio.findAll();
	}

	@Override
	public Preinscripcion obtenerPreinscripcion(String id) {
		return preinscripcionRepositorio.findOne(id);
	}

	@Override
	public Preinscripcion guardarPreinscripcion(Preinscripcion p) {
		return preinscripcionRepositorio.save(p);
	}

	@Override
	public void eliminarPreinscripcion(String id) {
		preinscripcionRepositorio.delete(id);
		
	}
	
	
	
}
