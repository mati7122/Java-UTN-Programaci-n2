/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculopreciofinal;
import java.util.Scanner;
/**
 *
 * @author Matias
 */


public class CalculoPrecioFinal {
    
    public static double calcularPrecioFinal(double precioBase ,double impuesto, double descuento) {
        return precioBase + ( precioBase * impuesto ) - ( precioBase * descuento );
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double precioBase = 0;
        double impuesto = 0;
        double descuento = 0;
        double precioFinal = 0;
        
        System.out.println("Ingrese el precio base del producto: ");
        precioBase = input.nextDouble();
        input.nextLine();
        
        System.out.println("Ingrese el impuesto en porcentaje: ");
        impuesto = input.nextDouble() / 100;
        input.nextLine();
        
        System.out.println("Ingrese el descuento en porcentaje: ");
        descuento = input.nextDouble() / 100;
        input.nextLine();
        
        precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es: " + precioFinal);
        
    }
    
}
