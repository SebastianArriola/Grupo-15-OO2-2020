package com.unla.Grupo15OO22020.models;

import java.time.LocalDate;

import java.util.HashSet;

import java.util.Set;

public class LocalModel {

	private long idLocal;
	private String direccion;
	private double latitud;
	private double longitud;
	private String telefono;
	private StockModel stock;
	private Set<ClienteModel> listaClientes = new HashSet<ClienteModel>();
	private Set<EmpleadoModel> listaEmpleados = new HashSet<EmpleadoModel>();
	private Set<FacturaModel> listaFacturas = new HashSet<FacturaModel>();
	private Set<SolicitudStockModel> listaSolicitudesStock = new HashSet<SolicitudStockModel>();
	
	public LocalModel() {
	}
	
	public LocalModel(String direccion, double latitud, double longitud, String telefono, EmpleadoModel gerente) {
		super();
		this.direccion = direccion;
		this.latitud = latitud;
		this.longitud = longitud;
		this.telefono = telefono;
		this.stock = new StockModel();
	}

	public long getIdLocal() {
		return idLocal;
	}

	protected void setIdLocal(long idLocal) {
		this.idLocal = idLocal;
	}

	public StockModel getStock() {
		return stock;
	}

	public void setStock(StockModel stock) {
		this.stock = stock;
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

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Set<FacturaModel> getListaFacturas() {
		return listaFacturas;
	}

	public void setListaFacturas(Set<FacturaModel> listaFacturas) {
		this.listaFacturas = listaFacturas;
	}

	public Set<SolicitudStockModel> getListaSolicitudesStock() {
		return listaSolicitudesStock;
	}

	public void setListaSolicitudesStock(Set<SolicitudStockModel> listaSolicitudesStock) {
		this.listaSolicitudesStock = listaSolicitudesStock;
	}

	
	


	/**********************************************************************************************************************************************/
	/*public boolean altaEmpleado(String nombre, String apellido, LocalDate fechaNacimiento, long dni,
			String franjaHoraria, boolean tipoEmpleado) throws Exception {
		if (traerEmpleado(dni) != null)
			throw new Exception("ERROR: El empleado ya existe");*/ //ERROR: obviamente tiene que retornar y el return esta comentado xD
		//return listaEmpleados.add(new Empleado(nombre, apellido, fechaNacimiento, dni, franjaHoraria, tipoEmpleado,this)); ERROR: justamente se agrega en la lista que ya no esta
	//}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocalModel other = (LocalModel) obj;
		if (idLocal != other.idLocal)
			return false;
		return true;
	}

	/**********************************************************************************************************************************************/
	/*public void modificarEmpleado(String nombre, String apellido, LocalDate fechaNacimiento, long dni,
			String franjaHoraria, boolean tipoEmpleado) throws Exception {
		if (traerEmpleado(dni) == null)
			throw new Exception("ERROR: No se encontro al empleado");
		Empleado e = traerEmpleado(dni);
		e.setApellido(apellido);
		e.setDni(dni);
		e.setFechaNacimiento(fechaNacimiento);
		e.setFranjaHoraria(franjaHoraria);
		e.setNombre(nombre);
		e.setTipoEmpleado(tipoEmpleado);
	}*///ERROR: obviamente el traer esta comentado y tira error.
	/**********************************************************************************************************************************************/
	/*public boolean bajaEmpleado(long dni) throws Exception {
		if (traerEmpleado(dni) == null)
			throw new Exception("ERROR: El DNI ingresado no pertenece a ningun empleado");
		return listaEmpleados.remove(traerEmpleado(dni));
	}*/ //modificar todo este caso de uso

	/**********************************************************************************************************************************************/
	/*public Empleado traerEmpleado(long dni) {
		int i = 0;
		Empleado empleadoEncontrado = null;
		while (i < listaEmpleados.size() && empleadoEncontrado == null) {
			if (listaEmpleados.get(i).getDni() == dni) {
				empleadoEncontrado = listaEmpleados.get(i);
			}
			i++;
		}
		return empleadoEncontrado;
	}
	*/ //ERROR: el mismo error de gets
	/**********************************************************************************************************************************************/
	/*public SolicitudStock traerSolicitud(int idSolicitud) {
		SolicitudStock solicitudEncontrada = null;
		int i = 0;
		
		while(i<listaSolicitudesStock.size() && solicitudEncontrada==null) {
			if(listaSolicitudesStock.get(i).getIdSolicitud()==idSolicitud) {
				solicitudEncontrada = listaSolicitudesStock.get(i);
			}
			
			i++;
		}
		return solicitudEncontrada;
	}*/ //ERROR: de nuevo error del .get()
	
	/**********************************************************************************************************************************************/
	/*public boolean altaSolicitudStock(LocalDate fecha, Producto producto, int cantidad, Empleado vendedor) {
		//No hace falta lanzar excepcion porque de todas formas pueden existir dos solicitudes iguales. Solo estaran diferenciadas por la id
		int id = 1;
		if(!listaSolicitudesStock.isEmpty()) {
			id = listaSolicitudesStock.get(listaSolicitudesStock.size()-1).getIdSolicitud()+1;
		}
		
		return listaSolicitudesStock.add(new SolicitudStock(id,fecha,producto,cantidad,vendedor)); 

	}*/ //ERROR: de nuevo error del .get()
	
	/**********************************************************************************************************************************************/
	/*public void actualizarSolicitudStock(Carrito c,SolicitudStock s,long dni_Colaborador,Cliente cliente,boolean aceptado)throws Exception {
		s.setColaborador(this.traerEmpleado(dni_Colaborador)) ;
		s.setAceptado(aceptado);
		
		//SI FUE ACEPTADA LA SOLICITUD AGREGA AL CARRITO EL PEDIDO
		
		if(aceptado) {
			c.altaPedido(s.getProducto(), s.getCantidad(), this,cliente,s.getVendedor() , s.getColaborador());
			this.getStock().consumoStock(s.getProducto(), s.getCantidad());
		}
		
	}*/ //ERROR: tanto el altaPedido como el traerPedido estan comentados
	
	/**********************************************************************************************************************************************/
	/*public boolean bajaSolicitud(int idSolicitud) throws Exception{
		if(traerSolicitud(idSolicitud)==null) throw new Exception("ERROR: No se encontro la solicitud a eliminar");
		return listaSolicitudesStock.remove(traerSolicitud(idSolicitud));
	}*///ERROR: traerSolicitud esta comentado

	/**********************************************************************************************************************************************/
	/*public Factura traerFactura(int idFactura) {
		Factura facturaEncontrada = null;
		int i = 0;
		while(i<listaFacturas.size() && facturaEncontrada==null) {
			if(listaFacturas.get(i).getIdFactura()==idFactura) {
				facturaEncontrada = listaFacturas.get(i);
			}
			i++;
		}
		return facturaEncontrada;
	}*///ERROR: no funciona el .get()
	/**********************************************************************************************************************************************/
	/*public Factura generarFactura( Carrito carrito){
		int id = 1;
		if(!listaFacturas.isEmpty()) {
			id = listaFacturas.get(listaFacturas.size()-1).getIdFactura()+1;
		}
		

		List<String> listaPedido = new ArrayList<String>();
		int index = 1;
		
		
		for (Pedido p : carrito.getListaPedidos()) {
			listaPedido.add("(" + (index++) + ")" + p.getProducto().getNombre() + " X " + p.getCantidad() + "=" + "$"
					+ p.CalcularSubtotal() + "\n");
		}
		
		Cliente c = carrito.getListaPedidos().get(0).getCliente();
		
		Factura f = new Factura(id,("Fecha: " + carrito.getFecha() + "\n" + "\n" + "Cliente: "+ c +"\n" + listaPedido + "\n" + "Total: " + carrito.calcularTotal()));
		
		listaFacturas.add(f);	
		
		
		
		return f;
	}*///ERROR: de nuevo error del .get() y error en la generacion de Factura, cambio su constructor.

}