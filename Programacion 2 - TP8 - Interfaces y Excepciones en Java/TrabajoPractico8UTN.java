/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajopractico8utn;

/**
 *
 * @author Matias
 */
public class TrabajoPractico8UTN {

     public static void main(String[] args) {
        Cliente c = new Cliente("Matías");
        Pedido pedido = new Pedido(c);

        Producto p1 = new Producto("Mouse", 5000);
        Producto p2 = new Producto("Teclado", 12000);

        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        pedido.cambiarEstado("Listo para enviar");

        Pago medioPago = new TarjetaCredito(); // permite descuento
        double total = pedido.calcularTotal();

        if (medioPago instanceof PagoConDescuento) {
            total = ((PagoConDescuento) medioPago).aplicarDescuento(total);
            System.out.println("Total con descuento: $" + total);
        }

        medioPago.procesarPago(total);
    }
}
