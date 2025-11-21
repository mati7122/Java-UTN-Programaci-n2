/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico8utn;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Matias
 */
public class Pedido implements Pagable {
    private List<Producto> productos = new ArrayList<>();
    private String estado;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estado = "Creado";
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El pedido cambió de estado a: " + nuevoEstado);
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
