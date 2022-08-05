package com.user.domain;

public class Vendedor extends Empleado {
    
    private String area; //Vehiculos, repuestos
    private String formacion; //Capacitacion
    private Agencia agencia;

    public Vendedor() {
    }

    public Vendedor(String area, String formacion, Agencia agencia) {
        this.area = area;
        this.formacion = formacion;
        this.agencia = agencia;
    }

    public Vendedor(String area, String formacion, String nombre, String apellido, int dni, int edad) {
        super(nombre, apellido, dni, edad);
        this.area = area;
        this.formacion = formacion;
    }
    
    public Vendedor(String area, String formacion, Agencia agencia, String nombre, String apellido, int dni, int edad) {
        super(nombre, apellido, dni, edad);
        this.area = area;
        this.formacion = formacion;
        this.agencia = agencia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Vendedor | Area: " + area + " | Formacion: " + formacion + super.toString();
    }
}
