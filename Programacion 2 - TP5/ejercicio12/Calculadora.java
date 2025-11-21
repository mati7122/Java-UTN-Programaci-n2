/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Matias
 */
public class Calculadora {

    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto para "
                + impuesto.getContribuyente().getNombre()
                + " por un monto de $" + impuesto.getMonto());
    }
}
