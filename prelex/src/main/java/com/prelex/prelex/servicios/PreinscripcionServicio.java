/**
 * 
 */
package com.prelex.prelex.servicios;

import com.prelex.prelex.entidades.Preinscripciones;

import java.util.LinkedList;

/**Interface para implementar los metodos de los CRUD
 * @author andrea
 * @version 1.0
 */
public interface PreinscripcionServicio {
	LinkedList<Preinscripciones> listaPreinscripciones();

	/**Permite obtener una preinscripcion dado un id
	 * @param id id de la preinscipcion a consultar
	 * @return la preinscripcion buscada
	 */
	Preinscripciones obtenerPreinscripcion(String id);

	/**Guarda una preinscripcion
	 * @param p preinscripcion que se desea guardar
	 * @return la preinscripcion que se adiciono
	 */
	Preinscripciones guardarPreinscripcion(Preinscripciones p);

	/**Elimina una preincripcion dado un id
	 * @param id id de la preinscipcion que se desea eliminar
	 * @return void
	 */
	void eliminarPreinscripcion(String id);

}
