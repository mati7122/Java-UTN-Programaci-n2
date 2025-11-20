/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico7utn;

/**
 *
 * @author Matias
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        System.out.println("El area del rectangulo " + nombre + " es: " + (base * altura));
    }
}
