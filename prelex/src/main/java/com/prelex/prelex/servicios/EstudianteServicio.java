package com.prelex.prelex.servicios;

import com.prelex.prelex.entidades.Estudiante;

/**
 * @author Angey
 *
 */
public interface EstudianteServicio {
	Iterable<Estudiante> listaEstudiantes();
	Estudiante obtenerEstudiantePorId(String id);
	Estudiante guardarEstudiante(Estudiante estudiante);
	void eliminarEstudiante(String id);
}
