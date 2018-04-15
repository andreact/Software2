package com.prelex.prelex.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import com.prelex.prelex.entidades.Estudiante;

/**
 * @author Angey
 *
 */

@Transactional
public interface EstudianteRepositorio extends CrudRepository<Estudiante, String>{

}