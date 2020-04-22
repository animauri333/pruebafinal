package com.company;

public class ProfesorAdjunto extends Profesor {
    private Integer cantidadDeHorasDedicadas;

    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor, Integer cantidadDeHorasDedicadas) {
        super(nombre, apellido, antiguedad, codigoDeProfesor);
        this.cantidadDeHorasDedicadas = cantidadDeHorasDedicadas;
    }
}