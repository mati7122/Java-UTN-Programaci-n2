/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico6_3_utn;

/**
 *
 * @author Matias
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return this.profesor;
    }

    public void setProfesor(Profesor nuevoProfesor) {
        if(this.getProfesor() != null) {
            this.profesor.getCursos().remove(this);
        }
        
        this.profesor = nuevoProfesor;
        
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.getCursos().add(this);
        }
    }
    
    public void mostrarInfo() {
        System.out.println("codigo: " + this.codigo);
        System.out.println("nombre: " + this.nombre);
        if(this.getProfesor() != null) {
            System.out.println("profesor: " + this.profesor);
        }
    }

    
    
}
