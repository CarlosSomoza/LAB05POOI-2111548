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

public class Programa {
    private String nombrePrograma;
    private String descripcion;
    private List<Curso> cursos; 

    public Programa(String nombrePrograma, String descripcion) {
        this.nombrePrograma = nombrePrograma;
        this.descripcion = descripcion;
        this.cursos = new ArrayList<>();
    }


    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public List<Curso> obtenerCursos() {
        return cursos;
    }
}
