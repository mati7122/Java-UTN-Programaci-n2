/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package determinarmayor;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class DeterminarMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // Determinar el mayor de tres números
        
        int[] numeros = new int[3];
        
        System.out.println("Ingrese el primer número: ");
        numeros[0] = input.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        numeros[1] = input.nextInt();
        
        System.out.println("Ingrese el tercer número: ");
        numeros[2] = input.nextInt();
        
        if( numeros[0] > numeros[1] && numeros[0] > numeros[2] ) {
            System.out.println("El primer número es el mayor.");
        }
        else if ( numeros[1] > numeros[0] && numeros[1] > numeros[2] ) {
            System.out.println("El segundo número es el mayor.");
        }
        else if ( numeros[2] > numeros[0] && numeros[2] > numeros[1] ) {
            System.out.println("El tercer número es el mayor.");
        }
        else {
            System.out.println("No es posible determinar cual es el mayor porque existen tres números iguales.");
        }
        
    }
    
}
