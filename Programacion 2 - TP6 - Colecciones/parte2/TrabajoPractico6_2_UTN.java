/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajopractico6_2_utn;

/**
 *
 * @author Matias
 */
public class TrabajoPractico6_2_UTN {

    public static void main(String[] args) {
        System.out.println("Ejercicio propuesto 2: Biblioteca y libros");
        
        // 1. Creamos una biblioteca.
        
        Biblioteca biblioteca = new Biblioteca();
        
        // 2. Crear al menos tres autores
        
        Autor autor1 = new Autor("1", "Roberto", "Praga");
        Autor autor2 = new Autor("2", "Leticia", "Praga");
        Autor autor3 = new Autor("3", "Ismael", "Praga");
        
        // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        
        Libro libro1 = new Libro("123", "Blancanieves", 1920, autor1);
        Libro libro2 = new Libro("789", "Historia Argentia", 2010, autor2);
        Libro libro3 = new Libro("456", "Ciencia e historia", 2010, autor1);
        Libro libro4 = new Libro("111", "Matematicas avanzadas", 2006, autor3);
        Libro libro5 = new Libro("133", "It", 1996, autor3);
        
        // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);
                
        // 4. Listar todos los libros con su información y la del autor.
        
        //biblioteca.listarLibros();
        
        // 5. Buscar un libro por su ISBN y mostrar su información
        
        //Libro libroEncontrado = biblioteca.buscarLibroPorIsbn("123");
        //libroEncontrado.mostrarInfo();
        
        // 6. Filtrar y mostrar los libros publicados en un año específico.
        
        //biblioteca.filtrarLibrosPorAnio(2010);
        
        // 7. Eliminar un libro por su ISBN y listar los libros restantes.
        
        //biblioteca.eliminarLibro("123");
        
        //biblioteca.listarLibros();
        
        // 8. Mostrar la cantidad total de libros en la biblioteca
        
        //System.out.println("Existen en total " + biblioteca.obtenerCantidadLibros());
        
        // 9. Listar todos los autores de los libros disponibles en la biblioteca
        
        biblioteca.mostrarAutoresDisponibles();
        
        
    }
}
