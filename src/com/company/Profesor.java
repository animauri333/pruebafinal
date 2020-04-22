package com.company;

import java.util.Objects;

public class Profesor {
    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigoDeProfesor;

    public Profesor(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
        this.codigoDeProfesor = codigoDeProfesor;
    }

    //getter and setter de los atributos nombre, apellido, antiguedad y codigoDeProfesor
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Integer getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }
    public Integer getCodigoDeProfesor() {
        return codigoDeProfesor;
    }
    public void setCodigoDeProfesor(Integer codigoDeProfesor) {
        this.codigoDeProfesor = codigoDeProfesor;
    }

  
