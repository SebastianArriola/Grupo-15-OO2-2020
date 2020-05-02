package com.unla.Grupo15OO22020.models;

public class RankingProductoModel {
    private int idProducto;
    private String nombre;
    private int cantidadVendida;

    public RankingProductoModel() {
    	
    }
    
    public RankingProductoModel(String nombre, int cantidadVendida) {
        super();
        this.nombre = nombre;
        this.cantidadVendida = cantidadVendida;
    }

    public int getIdProducto() {
        return idProducto;
    }
    protected void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidadVendida() {
        return cantidadVendida;
    }
    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }


}
