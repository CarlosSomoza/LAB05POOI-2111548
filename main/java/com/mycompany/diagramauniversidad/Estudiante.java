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
public class Estudiante extends Personas {
    private String codigo;
    private List<Curso> cursosInscritos;

    public Estudiante(String nombre, String dni, String correo, String codigo) {
        super(nombre, dni, correo);
        this.codigo = codigo;
        this.cursosInscritos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void inscribirseEnCurso(Curso curso) {
        cursosInscritos.add(curso);
    }

    public List<Curso> obtenerCursosInscritos() {
        return cursosInscritos;
    }
}
