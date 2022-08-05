package com.user.domain;

public class Gerente extends Empleado {
     private String area; //Gerente general, area.
    private String estudios; // Universitarios, terciarios
//    private Agencia nombreAgencia;

    public Gerente() {
        super();
    }

    public Gerente(String area, String estudios, Agencia agencia) {
        this.area = area;
        this.estudios = estudios;
//        this.nombreAgencia = nombreAgencia;
    }

    public Gerente(String area, String estudios, String nombre, String apellido, int dni, int edad) {
        super(nombre, apellido, dni, edad);
        this.area = area;
        this.estudios = estudios;
    }

    public Gerente(String area, String estudios, Agencia nombreAgencia, String nombre, String apellido, int dni, int edad) {
        super(nombre, apellido, dni, edad);
        this.area = area;
        this.estudios = estudios;
//        this.nombreAgencia = nombreAgencia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    @Override
    public String toString() {
        return "Gerente | Area: " + area + " | Estudios: " + estudios + super.toString();
    }
}
