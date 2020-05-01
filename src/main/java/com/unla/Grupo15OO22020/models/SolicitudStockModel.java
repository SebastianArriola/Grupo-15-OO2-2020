package com.unla.Grupo15OO22020.models;

import java.time.LocalDate;

public class SolicitudStockModel {
	private LocalDate fecha;
	private ProductoModel producto;
	private int cantidad;
	private EmpleadoModel vendedor;
	private EmpleadoModel colaborador;
	private boolean aceptado;
	private long idSolicitud;
	
	public SolicitudStockModel() {
		

	}
	
	public SolicitudStockModel(LocalDate fecha, ProductoModel producto, int cantidad, EmpleadoModel vendedor) {
		super();
		
		this.fecha = fecha;
		this.producto = producto;
		this.cantidad = cantidad;
		this.vendedor = vendedor;
		this.colaborador = null;
		this.aceptado = false;
	}

	
	public long getIdSolicitud() {
		return idSolicitud;
	}


	protected void setIdSolicitud(long idSolicitud) {
		this.idSolicitud = idSolicitud;
	}


	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public ProductoModel getProducto() {
		return producto;
	}

	public void setProducto(ProductoModel producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public EmpleadoModel getVendedor() {
		return vendedor;
	}

	public void setVendedor(EmpleadoModel vendedor) {
		this.vendedor = vendedor;
	}

	public EmpleadoModel getColaborador() {
		return colaborador;
	}

	public void setColaborador(EmpleadoModel colaborador) {
		this.colaborador = colaborador;
	}

	public boolean isAceptado() {
		return aceptado;
	}

	public void setAceptado(boolean aceptado) {
		this.aceptado = aceptado;
	}	
	
}