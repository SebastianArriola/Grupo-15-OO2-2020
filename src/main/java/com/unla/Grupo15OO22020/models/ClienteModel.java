package com.unla.Grupo15OO22020.models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class ClienteModel extends PersonaModel {
	private String email;
	private long idCliente;
	private Set<LocalModel> listaLocales = new HashSet<LocalModel>();
	
	public ClienteModel() {
	}

	public ClienteModel(String nombre, String apellido, LocalDate fechaNacimiento, long dni, String email) {
		super(nombre, apellido, fechaNacimiento, dni);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getIdCliente() {
		return idCliente;
	}

	protected void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public boolean rechazarEspera() {
		return false;
	}

	public boolean aceptarEspera() {
		return true;
	}

	public Set<LocalModel> getListaLocales() {
		return listaLocales;
	}

	public void setListaLocales(Set<LocalModel> listaLocales) {
		this.listaLocales = listaLocales;
	}

}