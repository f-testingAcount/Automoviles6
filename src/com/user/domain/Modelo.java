package com.user.domain;

import java.util.ArrayList;

public class Modelo {
    
    private String nombreMarca;    
    private String denominacion;
    private String tipoVehiculo; //Auto, camioneta, SUV, Moto, camion
    private int cantidad;
    
    private ArrayList<CaracteristicasTec> caracteristicas = new ArrayList<>();

    public Modelo() {}

    public Modelo(String denominacion) {
        this.denominacion = denominacion;
    }
    
    public Modelo(String denominacion, int cantidad){
        this.denominacion = denominacion;
        this.cantidad = cantidad;
    }
    
    public Modelo(String denominacion, String tipoVehiculo){
        this.denominacion = denominacion;
        this.tipoVehiculo = tipoVehiculo;
    }

    public Modelo(String denominacion, String tipoVehiculo, int cantidad) {
        this.denominacion = denominacion;
        this.tipoVehiculo = tipoVehiculo;
        this.cantidad = cantidad;
    }

    public Modelo(String nombreMarca, String denominacion, String tipoVehiculo, int cantidad) {
        this.nombreMarca = nombreMarca;
        this.denominacion = denominacion;
        this.tipoVehiculo = tipoVehiculo;
        this.cantidad = cantidad;
    }
    
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public ArrayList<CaracteristicasTec> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<CaracteristicasTec> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    
    public void agregarCaracteristicaAModelo(CaracteristicasTec caracteristica){
        caracteristicas.add(caracteristica);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(nombreMarca);
        sb.append(" | Denominacion: ").append(denominacion);
        sb.append(" | Tipo de Vehiculo: ").append(tipoVehiculo);
        sb.append(" | Cantidad: ").append(cantidad);
        sb.append(" -");
        return sb.toString();
    }
}
