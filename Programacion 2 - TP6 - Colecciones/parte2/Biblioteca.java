/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico6_2_utn;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }
    
    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }
    
    public void listarLibros(){
        for(Libro libro : this.libros) {
            libro.mostrarInfo();
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        for(Libro libro : this.libros) {
            if(libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }
    
    public void eliminarLibro(String isbn) {
        Libro libroParaEliminar = this.buscarLibroPorIsbn(isbn);
        
        this.libros.remove(libroParaEliminar);
    }
    
    public int obtenerCantidadLibros() {
        return this.libros.size();
    }
    
    public void filtrarLibrosPorAnio(int anio) {
        for(Libro libro: this.libros) {
            if(libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
            }
        }
    }
    
    public void mostrarAutoresDisponibles() {
        for(Libro libro: this.libros) {
            libro.getAutor();
        }
    }
}
