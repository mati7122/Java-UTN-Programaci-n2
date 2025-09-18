/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumanumerospares;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class SumaNumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int userInput = 0;
        int acumulador = 0;
        
        do{
            System.out.println("Ingrese un número(0 para terminar): ");
            userInput = input.nextInt();
            input.nextLine();
            
            if( userInput % 2 == 0 ){
                acumulador += userInput;
            }
            
        }while(userInput != 0);
        
        System.out.println("La suma de los números pares es: " + acumulador);
    }
    
}
