package com.prueba;

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

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(codigoDeProfesor, profesor.codigoDeProfesor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(codigoDeProfesor);
    }

}
