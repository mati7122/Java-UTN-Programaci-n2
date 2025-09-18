/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package costodeenvio;
import java.util.Scanner;
/**
 *
 * @author Matias
 */
public class CostoDeEnvio {
    
    static double precioProducto = 0;
    static String zona;
    static double peso;
    static double costoEnvio = 0;
    static double total = 0;
    
    public static double calcularCostoEnvio(double peso, String zona) {
        if(zona.equalsIgnoreCase("Nacional")){
            return peso * 5;
        }
        else if(zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        }
        return 0;
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        precioProducto = input.nextDouble();
        input.nextLine();
        
        System.out.println("Ingrese el peso del paquete: ");
        peso = input.nextDouble();
        input.nextLine();
          
        System.out.println("Ingrese la zona de envío(Nacional/Internacional): ");
        zona = input.nextLine();
        
        if(!zona.equalsIgnoreCase("Nacional") && !zona.equalsIgnoreCase("Internacional")) {
        
            do{
            System.out.println("Ingrese una zona válida: ");
            zona = input.nextLine();
            
        } while(!zona.equalsIgnoreCase("Nacional") && !zona.equalsIgnoreCase("Internacional"));
        }
        
        
        costoEnvio = calcularCostoEnvio(peso, zona);
        
        total = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es " + total);
    }
    
}
