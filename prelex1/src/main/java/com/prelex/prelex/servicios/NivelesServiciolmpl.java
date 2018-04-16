package com.prelex.prelex.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prelex.prelex.entidades.Niveles;
import com.prelex.prelex.repositorios.NivelesRepositorio;

import java.util.LinkedList;

/** Clase de implementacion de
 *  servicios donde se encuentra
 *  el cuerpo de los metodos en la
 *  interfaz de servicios
 * @author Sebas
 * @version  1.0
 */
@Service
public class NivelesServiciolmpl implements NivelesServicio{

    @Autowired
    private NivelesRepositorio nivelRepositorio;

    /** obtiene una lista de todos
     *  los niveles que hay en la bd
     * @return lista de niveles en la bd
     */
    @Override
    public  LinkedList<Niveles> listaNiveles() {
        LinkedList<Niveles> niveles = new LinkedList<>();
        nivelRepositorio.findAll().iterator().forEachRemaining(niveles::add);
        return niveles;
    }

    /** obtener el nivel por que busca
     * por codigo de nivel
     * @param codigo
     * @return el objeto que se buscaba de tipo niveles
     */
    @Override
    public Niveles obtenerNivel(String codigo) {

        return nivelRepositorio.findOne(codigo);
    }

    /** guarda los niveles en
     * el repositorio
     * @param n que es el nivel que se va a guardar
     */

    @Override
    public Niveles guardarNivel(Niveles n) {

        return nivelRepositorio.save(n);
    }

    /** meotodo encargado de eliminar un nivel
     * por su codigo unico
     * @param codigo codigo del nivel
     */
    @Override
    public void eliminarNivel(String codigo) {

        nivelRepositorio.delete(codigo);
    }
}
