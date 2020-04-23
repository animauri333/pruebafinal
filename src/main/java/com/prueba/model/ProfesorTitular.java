package com.prueba;

public class ProfesorTitular extends Profesor {
    private String especialidad;

    public ProfesorTitular(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor, String especialidad) {
        super(nombre, apellido, antiguedad, codigoDeProfesor);
        this.especialidad = especialidad;
    }

}