/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagramauniversidad;

/**
 *
 * @author carlo
 */
public class Administrador extends Personas {
    private String rango;

    public Administrador(String nombre, String dni, String correo, String rango) {
        super(nombre, dni, correo);
        this.rango = rango;
    }


    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
}
