/**
 * 
 */
package com.prelex.prelex.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.prelex.prelex.entidades.Preinscripciones;

/*Interface que extiende de la interface CrudRepository, la cual ofrece metodos como:
 * findOne (para mostrar todos los datos de una preinscripcion dado un id), findAll
 * (para consultar todas las preinscripciones), delete (para eliminar de la base de datos una
 * preinscripcion dado un id), y save (para adicionar una nueva preinscripcion a la base de datos
 * o actualizar una ya existente)
 *@author andrea
 *@version 1.0
 */

@Transactional
public interface PreinscripcionRepositorio extends CrudRepository<Preinscripciones, String>{

}
