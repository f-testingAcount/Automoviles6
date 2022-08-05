package com.user.domain;

public class Mecanico extends Empleado {
    
    private String especialidad; //Autos, camiones, motos
    private String formacion; //Estudios, capacitacion
    private Agencia agencia;

    public Mecanico() {}

    public Mecanico(String especialidad, String formacion, Agencia agencia) {
        this.especialidad = especialidad;
        this.formacion = formacion;
        this.agencia = agencia;
    }

    public Mecanico(String especialidad, String formacion, String nombre, String apellido, int dni, int edad) {
        super(nombre, apellido, dni, edad);
        this.especialidad = especialidad;
        this.formacion = formacion;
    }
    
    public Mecanico(String especialidad, String formacion, Agencia agencia, String nombre, String apellido, int dni, int edad) {
        super(nombre, apellido, dni, edad);
        this.especialidad = especialidad;
        this.formacion = formacion;
        this.agencia = agencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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
        return "Mecanico | Especialidad: " + especialidad + " | Formacion: " + formacion + super.toString();
    }
}
