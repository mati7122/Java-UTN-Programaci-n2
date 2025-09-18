/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificacionedad;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class ClasificacionEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Escribe un programa en Java que solicite al usuario su edad y clasifique su
        // etapa de vida según la siguiente tabla:
        // Menor de 12 años: "Niño"
        // Entre 12 y 17 años: "Adolescente"
        // Entre 18 y 59 años: "Adulto"
        // 60 años o más: "Adulto mayor"
        
        Scanner input = new Scanner(System.in);
        int edad;
        
        System.out.println("Ingrese su edad actual: ");
        edad = input.nextInt();
        
        if(edad < 12 ){
            System.out.println("Eres un niño");
        }
        else if(edad >= 12 && edad <=17){
            System.out.println("Eres un adolescente");
        } 
        else if(edad >= 18 && edad <= 59){
            System.out.println("Eres un adulto");
        }
        else if(edad >= 60){
            System.out.println("Eres un adulto mayor.");
        }
        else{
             System.out.println("La edad ingresada no es válida.");
           }
    }
    
}
