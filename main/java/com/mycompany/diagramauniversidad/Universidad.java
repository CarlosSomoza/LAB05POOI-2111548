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
public class Universidad {
    private String nombre;
    private String ubicacion;
    private String sector;

    public Universidad(String nombre, String ubicacion, String sector) {
        this.departamentos = new ArrayList<>();
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.sector = sector;
    }

    public String getNombreUni() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    private List<Departamento> departamentos;

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }
}
