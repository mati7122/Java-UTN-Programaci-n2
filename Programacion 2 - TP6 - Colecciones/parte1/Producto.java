/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico6utn;

/**
 *
 * @author Matias
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    };
    
    public enum CategoriaProducto { ALIMENTOS, ELECTRONICA, ROPA, HOGAR };
    
    public void mostrarInfo(){
        System.out.println("id: " + this.getId());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Precio: " + this.precio);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Cantidad: " + this.cantidad);
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public double getPrecio() {
        return this.precio;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }
    
    public CategoriaProducto getCategoria() {
        return this.categoria;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }
}
