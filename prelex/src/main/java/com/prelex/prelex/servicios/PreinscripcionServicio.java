/**
 * 
 */
package com.prelex.prelex.servicios;

import com.prelex.prelex.entidades.Preinscripcion;

/**
 * @author andrea
 *
 */
public interface PreinscripcionServicio {
	Iterable<Preinscripcion> listaPreinscripciones();
	
	Preinscripcion obtenerPreinscripcion(String id);
	
	Preinscripcion guardarPreinscripcion(Preinscripcion p);
	
	void eliminarPreinscripcion(String id);

}
