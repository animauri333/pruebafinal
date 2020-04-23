package com.company;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    List<Profesor> listaProfesor;
    List<Alumno> listaAlumno;
    List<Curso> listaCurso;
    List<Inscripcion> listaInscripcion;

    DigitalHouseManager() {
        this.listaAlumno = new ArrayList<>();
        this.listaCurso = new ArrayList<>();
        this.listaInscripcion = new ArrayList<>();
        this.listaProfesor = new ArrayList<>();
    }

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos) {
        Curso unCurso = new Curso(nombre, codigoCurso, cupoMaximoDealumnos);
        listaCurso.add(unCurso);
        System.out.println("Se a agregador a la lista de curso el curso codigo" + codigoCurso);
    }

    public void bajaCurso(Integer codigoCurso) {
        listaCurso.remove(codigoCurso);
        System.out.println("Se a dado el curso codigo: " + codigoCurso);
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {
        Profesor unProfesor = new ProfesorAdjunto(nombre, apellido, 0, codigoProfesor, cantidadDeHoras);
        listaProfesor.add(unProfesor);
        System.out.println("Se a agregado a la lista de profesores el profesor codigo" + codigoProfesor);
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
        Profesor unProfesor = new ProfesorTitular(nombre, apellido, 0, codigoProfesor, especialidad);
        listaProfesor.add(unProfesor);
        System.out.println("Se a agregado a la lista de profesores el profesor codigo" + codigoProfesor);
    }

    public void bajaProfesor(Integer codigoProfesor) {
        listaProfesor.remove(codigoProfesor);
        System.out.println("Se a dado de baja el profesor codigo: " + codigoProfesor);
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno) {
        Alumno unAlumno = new Alumno(nombre, apellido, codigoAlumno);
        listaAlumno.add(unAlumno);
        System.out.println("Se a dado de alta al alumno codigo: " + codigoAlumno);
    }

    private Curso buscarCurso(Integer codigo){
        Curso cursoAInscribir = null;
        for (Curso curso : listaCurso) {
            if (curso.getCodigoDeCurso().equals(codigo)) {
                cursoAInscribir = (Curso) curso;
                break;
            }
        }
        return cursoAInscribir;
    }


    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {
      
        Curso cursoAInscribir = buscarCurso(codigoCurso);
       
        Alumno alumnoAInscribir = null;
        for (Alumno alumno : listaAlumno)
            if (alumno.getCodigoDeAlumno().equals(codigoAlumno)) {
                alumnoAInscribir = alumno;
                break;
            }
        
        try {
            if (cursoAInscribir.agregarUnAlumno(alumnoAInscribir)) {
                Inscripcion unaInscripcion = new Inscripcion(alumnoAInscribir, cursoAInscribir);
                listaInscripcion.add(unaInscripcion);
                cursoAInscribir.agregarUnAlumno(alumnoAInscribir);
            }else{
                System.out.println("no hay cupo disponible para inscribir al alumno en el curso");
            }
        } catch (NullPointerException e) {
            System.out.println("No es posible inscribir al Alumno " + codigoAlumno + " en el curso" + codigoCurso);
        }
    }

    private Profesor buscarProfesor(Integer codigo){
        Profesor unProfesor = null;
        for (Profesor profesor : listaProfesor) {
            if (profesor.equals(codigo)){
                unProfesor = profesor;
            }
        }
        return unProfesor;
    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto){
        //buscar al profesor titular en la lista de profesores
        Profesor unProfesorTitular = buscarProfesor(codigoProfesorTitular);
        //buscar el profesor adjunto en la lista de profesores
        Profesor unProfesorAdjunto = buscarProfesor(codigoProfesorAdjunto);
        //busco el curso

        try{
            Curso cursoAAsignarProfesor = buscarCurso(codigoCurso);
            cursoAAsignarProfesor.setProfesorAdjunto(unProfesorAdjunto);
            cursoAAsignarProfesor.setProfesorTitular(unProfesorTitular);
        } catch (NullPointerException e){
            System.out.println("No es posible asignar los profesores");
        }
    }


}


