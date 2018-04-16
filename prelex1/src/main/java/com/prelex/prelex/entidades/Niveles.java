package com.prelex.prelex.entidades;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


/** Clase de tipo entidad donde estan
 * todos sus atributos y sus respectivos
 * gets y sets
 * @author Sebas
 * @version 1.0
 */
@Entity
@Table(name = "Niveles")
public class Niveles {
    @NotNull
    private String codigo;
    @NotNull
    private String nombre;

    @NotNull
    private String idioma;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
