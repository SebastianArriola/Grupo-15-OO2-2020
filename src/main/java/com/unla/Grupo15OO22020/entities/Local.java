package com.unla.Grupo15OO22020.entities;


import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="tablaLocal")
public class Local {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idLocal;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="latitud")
	private double latitud;
	
	@Column(name="longitud")
	private double longitud;
	
	@Column(name="telefono")
	private String telefono;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "stock_id", referencedColumnName = "idStock")
    private Stock stock;
	
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy="tablaLocal")
//	private Set<Empleado> empleados = new HashSet<Empleado>();
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy="tablaLocal")
//	private Set<Factura> listaFacturas = new HashSet<Factura>();
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy="tablaLocal")
//	private Set<SolicitudStock> listaSolicitudesStock = new HashSet<SolicitudStock>();
	
	
	
	@Column(name="createdat")
	@CreationTimestamp
	private LocalTime createdAt;
	
	@Column(name="updatedat")
	@UpdateTimestamp
	private LocalTime updatedAt;

	public Local() {
		super();
	}

	public Local(String direccion, double latitud, double longitud, String telefono) {
		super();
		this.direccion = direccion;
		this.latitud = latitud;
		this.longitud = longitud;
		this.telefono = telefono;
	}

	public long getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(long idLocal) {
		this.idLocal = idLocal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

//	public Set<Empleado> getEmpleados() {
//		return empleados;
//	}

//	public void setEmpleados(Set<Empleado> empleados) {
//		this.empleados = empleados;
//	}

//	public Set<Factura> getListaFacturas() {
//		return listaFacturas;
//	}

//	public void setListaFacturas(Set<Factura> listaFacturas) {
//		this.listaFacturas = listaFacturas;
//	}

//	public Set<SolicitudStock> getListaSolicitudesStock() {
//		return listaSolicitudesStock;
//	}

//	public void setListaSolicitudesStock(Set<SolicitudStock> listaSolicitudesStock) {
//		this.listaSolicitudesStock = listaSolicitudesStock;
//	}

		
	
	
	
	
}

