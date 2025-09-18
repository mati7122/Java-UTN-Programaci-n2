/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verify_anio_bi;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class Verify_anio_bi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int anioBisiesto = 0;
        System.out.println("Ingrese un año: ");
        anioBisiesto = input.nextInt();
        
        if( anioBisiesto % 4 == 0  && ( !(anioBisiesto % 100 == 0) || anioBisiesto % 400 == 0 ) ) {
           System.out.println("El año ingresado es bisiesto."); 
        }
        else{
            System.out.println("El año ingresado no es bisiesto.");
        }
    }
    
}
