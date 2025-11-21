/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico8utn;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class ConversionNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            String texto = sc.nextLine();

            int numero = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número válido.");
        }
    }
}
