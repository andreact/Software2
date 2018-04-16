package com.prelex.prelex.servicios;

import com.prelex.prelex.entidades.Profesores;

/**
 * @author Deivid
 *
 */
public interface ProfesoresServicio {
	Iterable<Profesores> listaProfesores();
	Profesores obtenerProfesores(String id);
	Profesores guardarProfesores(Profesores profesor);
	void eliminarProfesores(String id);
}
