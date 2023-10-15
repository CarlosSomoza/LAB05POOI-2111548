/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagramauniversidad;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author carlo
 */
public class Curso {
    private String nombre;
    private int idCurso;
    private List<Estudiante> estudiantesInscritos;

    public Curso(String nombre, int idCurso) {
        this.profesoresDictantes = new ArrayList<>();
        this.nombre = nombre;
        this.idCurso = idCurso;
        this.estudiantesInscritos = new ArrayList<>();
    }

    public String getNombreCur() {
        return nombre;
    }

    public void setNombreCur(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantesInscritos.add(estudiante);
    }

    public List<Estudiante> obtenerEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    private List<Profesor> profesoresDictantes;

    public void agregarCursoDictado(Profesor profesor) {
        profesoresDictantes.add(profesor);
    }
}
