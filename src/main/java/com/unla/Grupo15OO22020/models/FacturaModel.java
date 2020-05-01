package com.unla.Grupo15OO22020.models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class FacturaModel {
    private long idFactura;
    private LocalDate fecha;
    private double total;
    private ClienteModel cliente;
    private Set<PedidoModel> listaPedidos = new HashSet<PedidoModel>();

    public FacturaModel() {
    	
    }
    
    public FacturaModel(LocalDate fecha, double total, ClienteModel cliente) {
        super();
        
        this.fecha = fecha;
        this.total = total;
        this.cliente = cliente;
    }
    public long getIdFactura() {
        return idFactura;
    }
    protected void setIdFactura(long idFactura) {
        this.idFactura = idFactura;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public ClienteModel getCliente() {
        return cliente;
    }
    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }
    public Set<PedidoModel> getListaPedidos() {
        return listaPedidos;
    }
    public void setListaPedidos(Set<PedidoModel> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

 





}