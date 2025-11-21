/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajopractico6_3_utn;

/**
 *
 * @author Matias
 */
public class TrabajoPractico6_3_UTN {

    public static void main(String[] args) {
        System.out.println("Ejercicio: Universidad, Profesor y curso (bidireccional 1 a N)");
     
        // 1. Crear al menos 3 profesores y 5 cursos
        
        Profesor profesor1 = new Profesor("1", "Carlos", "Matematica");
        Profesor profesor2 = new Profesor("2", "Ana", "Programación");
        Profesor profesor3 = new Profesor("3", "Julio", "Historia");
        
        Curso curso1 = new Curso("1", "Algebra");
        Curso curso2 = new Curso("2", "Calculo");
        Curso curso3 = new Curso("3", "POO");
        Curso curso4 = new Curso("4", "Base de datos");
        Curso curso5 = new Curso("5", "Historia Argentina");
        
        // 2. Agregar profesores y cursos a la universidad.
        
        Universidad uni = new Universidad("UTN");
        
        uni.agregarProfesor(profesor1);
        uni.agregarProfesor(profesor2);
        uni.agregarProfesor(profesor3);

        uni.agregarCurso(curso1);
        uni.agregarCurso(curso2);
        uni.agregarCurso(curso3);
        uni.agregarCurso(curso4);
        uni.agregarCurso(curso5);
        
        // 3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        
        uni.asignarProfesorACurso("1", "1"); // Álgebra → Carlos
        uni.asignarProfesorACurso("2", "1"); // Cálculo → Carlos
        uni.asignarProfesorACurso("3", "2"); // POO → Ana
        uni.asignarProfesorACurso("4", "2"); // Base de datos → Ana
        uni.asignarProfesorACurso("5", "3"); // Historia → Julio
        
        // 4. Listar cursos con su profesor y profesores con sus cursos.
        
        System.out.println("\nLista de cursos:");
        uni.listarCursos();
        
        // 5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        
        System.out.println("\nCambiando profesor de POO:");
        uni.asignarProfesorACurso("3", "1");
        
        System.out.println("\nCursos del profesor Carlos:");
        profesor1.listarCursos();

        System.out.println("\nProfesor del curso POO:");
        curso3.mostrarInfo();

        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        
        System.out.println("\nEliminando curso Base de datos (C004)");
        uni.eliminarCurso("4");

        System.out.println("\nCursos de Ana luego de eliminar Base de datos:");
        profesor2.listarCursos();

        // 7. Remover un profesor y dejar profesor = null
        
        System.out.println("\nEliminando profesor Carlos (profesor1)");
        uni.eliminarProfesor("1");

        System.out.println("\nCursos después de eliminar a Carlos:");
        uni.listarCursos();
        
        
        // 8. Mostrar un reporte: cantidad de cursos por profesor
        
        System.out.println("\nReporte: cursos por profesor:");
        System.out.println("Ana: " + profesor2.getCursos().size());
        System.out.println("Julia: " + profesor3.getCursos().size());
        System.out.println("Carlos (P1) ya fue eliminado.");
    }
}
