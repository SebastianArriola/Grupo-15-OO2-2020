package com.unla.Grupo15OO22020.models;

import java.time.LocalDate;

public abstract class PersonaModel {

	protected long idPersona;
	protected String nombre;
	protected String apellido;
	protected LocalDate fechaNacimiento;
	protected long dni;

	public PersonaModel() {}
	
	public PersonaModel(String nombre, String apellido, LocalDate fechaNacimiento, long dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}
	

	public long getIdPersona() {
		return idPersona;
	}

	protected void setIdPersona(long idPersona) {
		this.idPersona = idPersona;
	}

}