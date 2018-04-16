/**
 * 
 */
package com.prelex.prelex.entidades;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/** Esta clase, es una entidad qu respresenta la tabla 
 * Preinscripciones de la base de datos
 * @author andrea
 * @version 1.0
 */
@Entity
public class Preinscripciones
{

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private String numeroDocumento;

	@NotNull
	private String tipoId;
	
	@NotNull
	private String nombres;
	
	@NotNull
	private String apellidos;
	
	private String telefono;

	

	public String getTipoId()
	{
		return tipoId;
	}

	public void setTipoId(String tipoId)
	{
		this.tipoId = tipoId;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
