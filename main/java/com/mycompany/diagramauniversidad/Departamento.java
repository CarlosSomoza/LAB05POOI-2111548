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
public class Departamento {
    private String campus;
    private String nombre;
    private List<Personas> personas; // Lista de personas relacionadas al departamento
    private List<Programa> programas; // Lista de programas relacionados al departamento

    public Departamento(String campus, String nombre) {
        this.campus = campus;
        this.nombre = nombre;
        this.personas = new ArrayList<>();
        this.programas = new ArrayList<>();
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getNombreDep() {
        return nombre;
    }

    public void setNombreDep(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPersona(Personas persona) {
        personas.add(persona);
    }

    public List<Personas> obtenerPersonas() {
        return personas;
    }

    public void agregarPrograma(Programa programa) {
        programas.add(programa);
    }

    public List<Programa> obtenerProgramas() {
        return programas;
    }
}