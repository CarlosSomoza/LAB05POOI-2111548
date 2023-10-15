/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagramauniversidad;

/**
 *
 * @author carlo
 */
public class Personas {
    private String nombre;
    private String dni;
    private String correo;

    public Personas(String nombre, String dni, String correo) {
        this.nombre = nombre;
        this.dni = dni;
        this.correo = correo;
    }

    public String getNombrePe() {
        return nombre;
    }

    public void setNombrePe(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
