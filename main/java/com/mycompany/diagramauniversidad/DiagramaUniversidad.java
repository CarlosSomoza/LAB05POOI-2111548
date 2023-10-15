/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diagramauniversidad;
import java.util.List;
/**
 *
 * @author carlo
 */
public class DiagramaUniversidad {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("San Ingnacio De Loyola", "La Molina", "Sector 2");

        Departamento departamento = new Departamento("Campus 2", "Departamento de Ingenieria");

        universidad.agregarDepartamento(departamento);

        Profesor profesor1 = new Profesor("GIANNY ALFARO", "123456789", "correo@ejemplo.com", 1500.0);

        profesor1.setDepartamento(departamento);

        Estudiante estudiante1 = new Estudiante("Oscar", "123456789", "correo@ejemplo.com", "123ABC");

        Estudiante estudiante2 = new Estudiante("Luciana", "123456789", "correo@ejemplo.com", "123ABC");

        Programa programa1 = new Programa("Programa A", "Descripción del Programa A");

        Curso curso1 = new Curso("Programacion Orientada a Objetos I", 101);

        curso1.inscribirEstudiante(estudiante1);
        curso1.inscribirEstudiante(estudiante2);

        curso1.agregarCursoDictado(profesor1);

        programa1.agregarCurso(curso1);

        List<Estudiante> estudiantesInscritos = curso1.obtenerEstudiantesInscritos();
        System.out.println("Estudiantes inscritos en el curso " + curso1.getNombreCur() + ":");
        for (Estudiante estudiante : estudiantesInscritos) {
            System.out.println(estudiante.getNombrePe());
        }

        List<Curso> cursosDictados = profesor1.obtenerCursosDictados();
        System.out.println("Cursos dictados por el Profesor " + profesor1.getNombrePe() + ":");
        for (Curso curso : cursosDictados) {
            System.out.println(curso.getNombreCur());
        }

        System.out.println("Información de la Universidad:");
        System.out.println("Nombre: " + universidad.getNombreUni());
        System.out.println("Ubicación: " + universidad.getUbicacion());
        System.out.println("Sector: " + universidad.getSector());

        System.out.println("Información del Departamento:");
        System.out.println("Nombre del Departamento: " + departamento.getNombreDep());
        System.out.println("Campus: " + departamento.getCampus());

        System.out.println("Información del Programa:");
        System.out.println("Nombre del Programa: " + programa1.getNombrePrograma());
        System.out.println("Descripción: " + programa1.getDescripcion());
    }
}
