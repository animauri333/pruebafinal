package com.prueba;

public class ProfesorAdjunto extends Profesor {
    private Integer cantidadDeHoras;

    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor, Integer cantidadDeHorasDedicadas) {
        super(nombre, apellido, antiguedad, codigoDeProfesor);
        this.cantidadDeHoras = cantidadDeHoras;
    }
}
