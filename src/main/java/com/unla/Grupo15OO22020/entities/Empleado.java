package com.unla.Grupo15OO22020.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Empleado extends Persona {



	@Column(name = "franjaHoraria")
	private String franjaHoraria;

	@Column(name = "tipoEmpleado")
	private boolean tipoEmpleado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLocal")
	private Local local;

	public Empleado() {

	}

	public Empleado(long idPersona, String nombre, String apellido, Date fechaNacimiento, long dni, String franjaHoraria,
			boolean tipoEmpleado, Local local) {
		super(idPersona, nombre, apellido, fechaNacimiento, dni);
		this.franjaHoraria = franjaHoraria;
		this.tipoEmpleado = tipoEmpleado;
	}



	public String getFranjaHoraria() {
		return franjaHoraria;
	}

	public void setFranjaHoraria(String franjaHoraria) {
		this.franjaHoraria = franjaHoraria;
	}

	public boolean isTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(boolean tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	
	
}
