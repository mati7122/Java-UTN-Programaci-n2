/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico8utn;

/**
 *
 * @author Matias
 */
public class TarjetaCredito implements Pago, PagoConDescuento {
    
     @Override
    public boolean procesarPago(double monto) {
        System.out.println("Pagando $" + monto + " con tarjeta de crédito...");
        return true; // simula éxito
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90; // 10% de descuento
    }
}
