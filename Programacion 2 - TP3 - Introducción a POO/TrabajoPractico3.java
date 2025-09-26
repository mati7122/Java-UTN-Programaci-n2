/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico3;
import java.util.Scanner;
/**
 *
 * @author Matias
 */

class Estudiante {
    
    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;
    
    Estudiante(String nombre, String apellido, String curso, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.setCalificacion(calificacion);
    }
    
    void mostrarInfo() {
        System.out.println("Información del alumno:");
        System.out.println("Nombre completo: " + getNombreCompleto());
        System.out.println("Curso: " + this.curso);
        System.out.println("Calificacion actual: " + this.calificacion);
    }
    
    String getNombreCompleto() {
        //return this.nombre + this.apellido;
        return String.format("%s %s", this.nombre, this.apellido);
    }
    
    void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    void subirCalificacion() {
        this.calificacion += 1;
        System.out.println(String.format("El alumno %s ha subido su calificacion un punto. Ahora es de %d", getNombreCompleto(), this.calificacion));
    }
    
    void bajarCalificacion() {
        this.calificacion -= 1;
         System.out.println(String.format("El alumno %s ha bajado su calificacion un punto. Ahora es de %d", getNombreCompleto(), this.calificacion));
    }
    
}

class Mascota {

    private String nombre;
    private String especie;
    private int edad;
    
    Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    void mostrarInfo() {
        System.out.println("Informacion de la mascota");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especie: " + this.especie);
        System.out.println("Edad en anios humanos: " + this.edad);
    }
    
    void SimularAnios(int anios) {
        this.edad += anios;
        System.out.println("Se simulan " + anios + " anios");
    }
    
    
}

class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    // Constructor
    
    Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        try{
            this.anioPublicacion = anioPublicacion;
        }
        catch (Error error){
            System.out.println(error);
        }
    }
    
    // Getters
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public String getAutor() {
        return this.autor;
    }
    
    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }
    
    // Setter anioPublicacion
    public void setAnioPublicacion(int anio) {
        if(anio > 2025 || anio < 500) {
            throw new Error("El año no es válido.");
        } 
        else {
            this.anioPublicacion = anio;
        }
    }
    
     public void mostrarInformacion() {
        System.out.println("Titulo del libro: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Anio publicacion:" + this.getAnioPublicacion());
    }
    
}

class Gallina {
    
    int idGallina;
    int edad;
    int huevosPuestos;
    
    Gallina(int idGallina, int edad, int huevosPuestos) {
    
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
        
    }
    
    int ponerHuevo(int cantidadDeHuevos) {
        System.out.println(String.format("Gallina %d ha puesto huevos!", this.idGallina));
        return this.huevosPuestos += cantidadDeHuevos;
    }
    
    int envejecer() {
        System.out.println(String.format("Gallina %d ha envejecido un anio...", this.idGallina));
        return this.edad++;
    }
    
    void mostrarEstado() {
        System.out.println("Estado gallina: " + this.idGallina);
        System.out.println("Esta gallina tiene el identificador(id) N" + this.idGallina);
        System.out.println("Actualmente tiene " + this.edad + " anios de edad,");
        System.out.println(String.format("y ah puesto %d huevos hasta el dia de hoy", this.huevosPuestos));
    }
}


class NaveEspacial {

    String nombre;
    double combustible;
    
    NaveEspacial(String nombre, double combustible) {
        this.nombre = nombre;
        this.combustible = setCombustible(combustible);
        System.out.println("La nave se ha creado.");
    }
    
    double setCombustible(double combustible) {
        if(combustible <= 0) {
            System.out.println("Debes cargar el combustible.");
            System.out.println("Nivel actual: " + this.combustible);
            return 0;
        }
        else if(combustible > 50) {
            System.out.println("No se puede sobrepasar el límite de carga.");
            return 0;
        }
        else {
            System.out.println("Se ha cargado " + combustible + " unidad/es de combustible");
            return this.combustible += combustible;
        }
    }
    
    void despegar() {
        if(this.combustible <= 0) {
            System.out.println("No es posible despegar sin combustible");
        }
        else {
            System.out.println("La nave ha despegado");
        }
    }
    
    void avanzar() {            
        if(this.combustible < 10) {
            System.out.println("No se puede avanzar sin combustible suficiente. Por favor, recargue el combustible");
            System.out.println("Combustible actual: " + this.combustible);
        }
        else {
            this.combustible -= 10;
            System.out.println("La nave avanza y se consumen 10 unidades de combustible");
        }
    }

    
    void recargarCombustible(double combustible) {
        if(this.combustible > 50) {
            System.out.println("No se puede sobrepasar el límite de carga");
        }
        else {
            this.combustible = setCombustible(combustible);
        }
        
    }
    
    void mostrarEstado() {
        System.out.println("Estado de la nave:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Combustible: " + this.combustible);
    }
    
}


public class TrabajoPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        
        // Punto 1
        // Instanciar estudiante
        /*Estudiante estudiante = new Estudiante("Matias", "Herrera", "A", 8);
        
        estudiante.mostrarInfo();
        estudiante.subirCalificacion();
        estudiante.mostrarInfo();*/
        
        // Punto 2
        // Instanciar mascota
        
        /*Mascota mascota = new Mascota("Lucho", "perro", 7);
        
        mascota.mostrarInfo();
        
        // Pasan cuatro años...
        mascota.SimularAnios(4);
        
        // Se muestra la informacíón de la mascota despúes de 5 años
        mascota.mostrarInfo();*/
        
        // Punto 3
        // Instanciar libro
        
        /*Libro libro = new Libro("Misery", "Stephen King", 1987);
        
        libro.setAnioPublicacion(2001);
        
        libro.mostrarInformacion();*/
        
        // Punto 4
        // Instanciar gallina
        
        // Instanciamos o creamos dos gallinas
        /*Gallina gallina1 = new Gallina(1, 2, 25);
        Gallina gallina2 = new Gallina(2, 1, 8);
        
        // Simulamos el paso de cuatro años
        for(int i = 0; i < 4; i++){
            gallina1.envejecer();
            gallina2.envejecer();
        }*/
        
        // Gallinas ponen huevos
        /*gallina1.ponerHuevo(23);
        gallina2.ponerHuevo(34)*/;
        
        // Luego de cuatro años, imprimimos el estado de ambas gallinas
        /*gallina1.mostrarEstado();
        gallina2.mostrarEstado();*/
        
        NaveEspacial romulus = new NaveEspacial("Romulus", 30);
        
        romulus.mostrarEstado();
        romulus.avanzar();
        romulus.avanzar();
        romulus.avanzar();
        romulus.avanzar();
        romulus.recargarCombustible(10);
        romulus.avanzar();
        romulus.mostrarEstado();
        
        romulus.recargarCombustible(10);
        romulus.recargarCombustible(10);
        romulus.recargarCombustible(10);
        romulus.recargarCombustible(10);
        romulus.recargarCombustible(10);
        romulus.recargarCombustible(10);
        romulus.recargarCombustible(10);

    }
    
}
