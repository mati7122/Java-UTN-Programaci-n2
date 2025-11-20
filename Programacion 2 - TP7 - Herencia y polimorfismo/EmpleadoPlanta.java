/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico7utn;

/**
 *
 * @author Matias
 */
public class EmpleadoPlanta extends Empleado {
    
    private double sueldoBase;
    
    public EmpleadoPlanta(String nombre, double sueldoBase) {
        super(nombre);
        this.sueldoBase = sueldoBase;
    }
    
    @Override
    public double calcularSueldo() {
        return sueldoBase;
    }
    
}
