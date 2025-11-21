/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico5utn.ejercicio13;

/**
 *
 * @author Matias
 */
public class GeneradorQR {

    public void generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario);
        System.out.println("QR generado para: " + usuario.getNombre()
                + " | Valor: " + codigo.getValor());
    }
}
