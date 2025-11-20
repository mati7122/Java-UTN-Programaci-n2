/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico7utn;

/**
 *
 * @author Matias
 */
public class Circulo extends Figura {
    private double radio;
    
    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public void calcularArea() {
        System.out.println("El area del circulo " + nombre + " es: " + (radio * 3.14));
    }
}
