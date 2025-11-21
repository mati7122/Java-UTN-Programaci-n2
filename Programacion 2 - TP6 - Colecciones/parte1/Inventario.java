/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico6utn;

import com.mycompany.trabajopractico6utn.Producto.CategoriaProducto; //importar enum
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matias
 */
public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    ;
    
    public void listarProductos() {
        for (Producto p : this.productos) {
            p.mostrarInfo();
        }
    }

    ;
    
    public Producto buscarProductoPorId(String id) {
        for (Producto p : this.productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    ;
    
    public void eliminarProducto(String id) {
        for (Producto p : this.productos) {
            if (p.getId().equals(id)) {
                this.productos.remove(p);
            } else {
                System.out.println("false");
            }
        }
    }

    ;
    
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = this.buscarProductoPorId(id);
        p.setCantidad(nuevaCantidad);
    }

    ;
    
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
            }
        }
        return null;
    }

    ;
    
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    ;
    
    public Producto obtenerProductoConMayorStock() {
        Producto productoMaxStock = null;
        int maxStock = 0;

        for (Producto p : productos) {
            if (p.getCantidad() > maxStock) {
                maxStock = p.getCantidad();
                productoMaxStock = p;
            }
        }
        return productoMaxStock;
    }

    ;
    
    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
            }
        }
        return null;
    }

    ;
    
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria);
        }
    }
;
}
