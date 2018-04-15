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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estudiante obtenerEstudiantePorId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estudiante guardarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarEstudiante(String id) {
		// TODO Auto-generated method stub
		
	}

}
