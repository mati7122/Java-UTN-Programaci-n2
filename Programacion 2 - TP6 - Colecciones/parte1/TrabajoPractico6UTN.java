/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.trabajopractico6utn;

import com.mycompany.trabajopractico6utn.Producto.CategoriaProducto;
import java.util.List;

/**
 *
 * @author Matias
 */
public class TrabajoPractico6UTN {

    public static void main(String[] args) {
        // Tarea 1 - Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.

        Inventario inventario = new Inventario();

        Producto p1 = new Producto("P01", "Arroz", 1200, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P02", "Notebook Lenovo", 450000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P03", "Remera", 8000, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P04", "Tostadora", 25000, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P05", "Fideos", 900, 80, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // Tarea 2 - Listar todos los productos mostrando su información y categoría. 
        // inventario.listarProductos();
        
        // Tarea 3 - Buscar un producto por ID y mostrar su información.
        /*Producto encontrado = inventario.buscarProductoPorId("P03");

        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado");
        }*/
        
        // Tarea 4 - Filtrar y mostrar productos que pertenezcan a una categoría específica. 
        /*List<Producto> alimentos = inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        for (Producto p : alimentos) {
            p.mostrarInfo();
        }*/
        
        // Tarea 5 - Eliminar un producto por su ID y listar los productos restantes.
        //inventario.eliminarProducto("P04"); // elimina la tostadora
        //inventario.listarProductos();
        
        // Tarea 6 - Actualizar el stock de un producto existente. 
        //inventario.actualizarStock("P01", 100); // ahora el stock del arroz es 100
        
        // Tarea 7 - Mostrar el total de stock disponible. 
        //int totalStock = inventario.obtenerTotalStock();
        //System.out.println("Stock total disponible: " + totalStock);
        
        // Tarea 8 - Obtener y mostrar el producto con mayor stock
        /*Producto mayorStock = inventario.obtenerProductoConMayorStock();

        if (mayorStock != null) {
            System.out.println("Producto con mayor stock:");
            mayorStock.mostrarInfo();
        }*/

        // Tarea 9 - Filtrar productos con precios entre $1000 y $3000. 
        /*List<Producto> rango = inventario.filtrarProductosPorPrecio(1000, 3000);

        for (Producto p : rango) {
            p.mostrarInfo();
        }*/

        // Tarea 10 - Mostrar las categorías disponibles con sus descripciones.
        
        inventario.mostrarCategoriasDisponibles();

    }
}
