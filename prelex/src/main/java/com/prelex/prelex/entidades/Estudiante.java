package com.prelex.prelex.entidades;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Esta clase simboliza la informacion contenida en la tabla 'Estudiantes'
 * @author Angey
 * @version 1.0
 */

@Entity
@Table(name = "Estudiantes")

public class Estudiante {

	@NotNull
	private String tipoId;
	
	@Id
	@NotNull
	private String numeroDocumento;
	
	@NotNull
	private String nombres;
	
	@NotNull
	private String apellidos;
	
	@NotNull
	private Date fechaNacimiento;
	
	@NotNull
	private String regimenSalud;
	
	@NotNull
	private String telefono;
	
	@NotNull
	private String email;
	
	@NotNull
	private long tarifa;
	
	@NotNull
	private String estadoActual;
	
	@NotNull
	private Date fechaIngreso;
	
	@NotNull
	private String eps;

	public String getTipoId() {
		return tipoId;
	}

	public void setTipoId(String tipoId) {
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRegimenSalud() {
		return regimenSalud;
	}

	public void setRegimenSalud(String regimenSalud) {
		this.regimenSalud = regimenSalud;
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

	public long getTarifa() {
		return tarifa;
	}

	public void setTarifa(long tarifa) {
		this.tarifa = tarifa;
	}

	public String getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(String estadoActual) {
		this.estadoActual = estadoActual;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getEps() {
		return eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}


}