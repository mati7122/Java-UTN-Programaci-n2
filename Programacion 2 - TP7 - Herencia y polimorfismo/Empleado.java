/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico7utn;

/**
 *
 * @author Matias
 */
public abstract class Empleado {
    
    protected String nombre;
    
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    
    public abstract double calcularSueldo();
}
