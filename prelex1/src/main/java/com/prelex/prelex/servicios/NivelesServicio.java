package com.prelex.prelex.servicios;

import com.prelex.prelex.entidades.Niveles;

import java.util.LinkedList;

/** Clase de interfaz donde se
 *  consumiran los metodos en
 *  NivelesServicioImplementacion
 * @author Sebas
 * @version 1.0
 * @Nota no comento los metodos por
 * que se comentara en su cuerpo.
 */
public interface NivelesServicio {
    LinkedList<Niveles> listaNiveles();

    Niveles obtenerNivel(String codigo);

    Niveles guardarNivel(Niveles n);

    void eliminarNivel(String codigo);
}
