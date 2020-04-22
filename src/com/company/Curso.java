package com.company;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String nombre;
    private Integer codigoDeCurso;
    private Profesor profesorTitular;
    private Profesor profesorAdjunto;
    private Integer cupoMaximoDeAlumnos;
    private List<Alumno> listadoDeAlumnos;

    public Curso(String nombre, Integer codigoDeCurso, Integer cupoMaximoDeAlumnos) {
        this.nombre = nombre;
        this.codigoDeCurso = codigoDeCurso;
        this.cupoMaximoDeAlumnos = cupoMaximoDeAlumnos;
        this.listadoDeAlumnos = new ArrayList<>();
    }

   