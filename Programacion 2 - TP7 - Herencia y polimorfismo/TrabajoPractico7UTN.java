/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajopractico7utn;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Matias
 */
public class TrabajoPractico7UTN {

    public static void main(String[] args) {
        // 4. Animales y polimorfismo
        
        ArrayList<Animal> animales = new ArrayList<>();
        
        Perro perro = new Perro();
        Gato michi = new Gato();
        Vaca vaca = new Vaca();
        
        animales.add(perro);
        animales.add(michi);
        animales.add(vaca);
        
        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}
