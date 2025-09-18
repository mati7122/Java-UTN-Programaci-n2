/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadornegpos;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class ContadorNegPos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Escribe un programa que pida al usuario ingresar 10 números enteros y
        // cuente cuántos son positivos, negativos y cuántos son ceros.

     Scanner input = new Scanner(System.in);
        
     int usuarioEntrada = 0;
     int contador = 10;
     int positivos = 0;
     int negativos = 0;
     int ceros = 0;
     
     for(int i = 1; i <= contador; i++) {
         System.out.println("Ingrese un número: ");
         usuarioEntrada = input.nextInt();
         
         if(usuarioEntrada > 0){
            positivos += 1;
         }
         else if(usuarioEntrada < 0){
            negativos += 1;
         }
         else if(usuarioEntrada == 0){
            ceros += 1;
         }
     }
     
        System.out.println("Resultados: ");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
    
}
