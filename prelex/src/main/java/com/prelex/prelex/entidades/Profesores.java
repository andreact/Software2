package com.prelex.prelex.entidades;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author Deivid
 * @version 1.0
 */

@Entity
@Table(name = "Profesores")

public class Profesores {
	
	@Id
	@NotNull
	private String numeroDocumento;
	
	@NotNull
	private String nombres;
	
	@NotNull
	private String apellidos;
	
	@NotNull
	private String telefono;
	
	@NotNull
	private String email;
	
	@NotNull
	private String direccion;
	
	@NotNull
	private String eps;
	
	@NotNull
	private String especialidad;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEps() {
		return eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
}
