package com.prelex.prelex.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import com.prelex.prelex.entidades.Profesores;

/**
 * @author Deivid
 *
 */

@Transactional
public interface ProfesoresRepositorio extends CrudRepository<Profesores, String>{

}