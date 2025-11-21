/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico5utn;

/**
 *
 * @author Matias
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;             // Composición
    private Titular titular;       // Asociación

    public Pasaporte(String numero, String fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
    }

    // Getters y setters
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(String fechaEmision) { this.fechaEmision = fechaEmision; }

    public Foto getFoto() { return foto; }
    public void setFoto(Foto foto) { this.foto = foto; }

    public Titular getTitular() { return titular; }
    
    public void setTitular(Titular titular) {
        this.titular = titular;

        // Mantener la relación bidireccional
        if (titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
}

