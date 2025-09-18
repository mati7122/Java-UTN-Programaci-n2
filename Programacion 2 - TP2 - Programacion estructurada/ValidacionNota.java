/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validacionnota;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class ValidacionNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
        usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
        hasta que ingrese un valor válido.
        */
        
        Scanner input = new Scanner(System.in);
        
        int nota = 0;
        
        do{
            System.out.println("Ingrese una nota(0-10): ");
            nota = input.nextInt();
            
            if(nota < 0 || nota > 10){
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10");
            }
            
        }while(nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente");
    }
    
}
