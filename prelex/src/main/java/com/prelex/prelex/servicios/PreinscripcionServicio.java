/**
 * 
 */
package com.prelex.prelex.servicios;

import com.prelex.prelex.entidades.Preinscripciones;

import java.util.LinkedList;

/**
 * @author andrea
 *
 */
public interface PreinscripcionServicio {
	LinkedList<Preinscripciones> listaPreinscripciones();
	
	Preinscripciones obtenerPreinscripcion(String id);
	
	Preinscripciones guardarPreinscripcion(Preinscripciones p);
	
	void eliminarPreinscripcion(String id);

}
