package com.prelex.prelex.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prelex.prelex.entidades.Estudiante;
import com.prelex.prelex.repositorios.EstudianteRepositorio;

/**
 * @author Angey
*
*/
@Service
public class EstudianteServicioImpl implements EstudianteServicio{

	@Autowired
	private EstudianteRepositorio estudianteRepositorio;
	
	@Override
	public Iterable<Estudiante> listaEstudiantes() {
		return estudianteRepositorio.findAll();
	}

	@Override
	public Estudiante obtenerEstudiantePorId(String id) {
		return estudianteRepositorio.findOne(id);
	}

	@Override
	public Estudiante guardarEstudiante(Estudiante estudiante) {
		return estudianteRepositorio.save(estudiante);
	}

	@Override
	public void eliminarEstudiante(String id) {
		estudianteRepositorio.delete(id);
	}

}
