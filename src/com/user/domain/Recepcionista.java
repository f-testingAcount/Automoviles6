package com.user.domain;

public class Recepcionista extends Empleado {
    
    private String formacion; //Estudios, capacitacion
    private Agencia agencia;

    public Recepcionista() {}

    public Recepcionista(String formacion, Agencia agencia) {
        this.formacion = formacion;
        this.agencia = agencia;
    }

    public Recepcionista(String formacion, String nombre, String apellido, int dni, int edad) {
        super(nombre, apellido, dni, edad);
        this.formacion = formacion;
    }

    public Recepcionista(String formacion, Agencia agencia, String nombre, String apellido, int dni, int edad) {
        super(nombre, apellido, dni, edad);
        this.formacion = formacion;
        this.agencia = agencia;
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
        return "Recepcionista | Formacion: " + formacion + super.toString();
    }
}
