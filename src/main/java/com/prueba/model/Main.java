package com.company;

public class Main {

    public static void main(String[] args) {
       

        
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();
        // Dar de alta profesor titular y profesor adjunto
        digitalHouseManager.altaProfesorTitular("Analia","Moyano", 001, "Full Stack");
        digitalHouseManager.altaProfesorAdjunto("Mauricio","Aguilera", 002, 5);
        // Dar de alta al curso. Estan los datos
        digitalHouseManager.altaCurso("Full Stack", 20001,3);
        // Asignarle un profesor titular y un adjunto a al curso.
        digitalHouseManager.asignarProfesores(20001,001,3);
        digitalHouseManager.asignarProfesores(20001,002,6);
        //Dar de alta a alumnos
        digitalHouseManager.altaAlumno("Fabian","Lopez", 001);
        digitalHouseManager.altaAlumno("Tomas","Peres",002);
        
        //Inscribir a dos alumnos ne le curso de full stack
        digitalHouseManager.inscribirAlumno(001,20001);
        digitalHouseManager.inscribirAlumno(002,20001);
        
        // Dar de baja a un profesor
        digitalHouseManager.bajaProfesor(004);
        



        /**
         * ¿Cómo modificaría el diagrama de clases para que se le pueda consultar a un alumno a qué cursos está inscripto? 
         *
         * A la clase Alumno le implementaria un metodo consultarCursosInscriptos(), por otro lado en la clase
         * DigitalHouseManager implementaria un metodo que retorne una lista de cursos para un codigo de alumno determinado,
         * retorneListaCursos(codigoAlumno).
         * El metodo consultarCursosInscriptos invocaria al metodo retorneListaCursos(codigoAlumno) y esta retorna el listado
         * de los cursos donde esta inscripto el alumno
         *
         */

    }
}
