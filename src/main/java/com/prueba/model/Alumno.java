package com.prueba;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer codigoDeAlumno;

    public Alumno(String nombre, String apellido, Integer codigoDeAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoDeAlumno = codigoDeAlumno;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(codigoDeAlumno, alumno.codigoDeAlumno);
    }


    
    @Override
    public int hashCode() {
        return Objects.hash(codigoDeAlumno);
    }

    public Integer getCodigoDeAlumno() {
        return codigoDeAlumno;
    }
}
