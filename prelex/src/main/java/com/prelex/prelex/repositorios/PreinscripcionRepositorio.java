/**
 * 
 */
package com.prelex.prelex.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.prelex.prelex.entidades.Preinscripciones;
/**
 * @author andrea
 *
 */

@Transactional
public interface PreinscripcionRepositorio extends CrudRepository<Preinscripciones, String>{

}
