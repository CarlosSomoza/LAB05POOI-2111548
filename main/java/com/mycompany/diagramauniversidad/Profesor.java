/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagramauniversidad;

/**
 *
 * @author carlo
 */
import java.util.ArrayList;
import java.util.List;

public class Profesor extends Personas {
    private double sueldo;
    private Departamento departamento; 
    private List<Curso> cursosDictados; 

    public Profesor(String nombre, String dni, String correo, double sueldo) {
        super(nombre, dni, correo);
        this.sueldo = sueldo;
        this.cursosDictados = new ArrayList<>();
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void agregarCursoDictado(Curso curso) {
        cursosDictados.add(curso);
    }

    public List<Curso> obtenerCursosDictados() {
        return cursosDictados;
    }
}