package com.prelex.prelex.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prelex.prelex.entidades.Profesores;
import com.prelex.prelex.repositorios.ProfesoresRepositorio;

/**
 * @author Deivid
*
*/
@Service
public class ProfesoresServicioImpl implements ProfesoresServicio{

	@Autowired
	private ProfesoresRepositorio profesoresRepositorio;

	@Override
	public Iterable<Profesores> listaProfesores() {
		// TODO Auto-generated method stub
		return profesoresRepositorio.findAll();
	}

	@Override
	public Profesores obtenerProfesores(String id) {
		// TODO Auto-generated method stub
		return profesoresRepositorio.findOne(id);
	}

	@Override
	public Profesores guardarProfesores(Profesores profesor) {
		return profesoresRepositorio.save(profesor);
	}

	@Override
	public void eliminarProfesores(String id) {
		profesoresRepositorio.delete(id);		
	}
	
	

}