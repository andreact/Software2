package com.prelex.prelex.repositorios;

import com.prelex.prelex.entidades.Niveles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/** Clase donde se guarda todos los
 *  archivos de repositorio
 * @author Sebas
 * @version 1.0
 */
@Transactional
public interface NivelesRepositorio extends CrudRepository<Niveles, String> {

}
