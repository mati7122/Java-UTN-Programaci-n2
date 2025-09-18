/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modificararrayrecursivo;

/**
 *
 * @author Matias
 */
public class ModificarArrayRecursivo {
    
    static double[] preciosOriginales = {199.99, 299.5, 149.75, 399.0, 89.99};
    
    static void MostrarPrecios(double[]list, int i) {
        if(i == list.length){
            return;
        }
        else {
            System.out.println("Precio: $" + list[i]);
            MostrarPrecios(list, i + 1);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Impresion recursiva de arrays antes y despues de modificar un elemento
        
        System.out.println("Precios originales:");
        MostrarPrecios(preciosOriginales, 0);
        
        preciosOriginales[3] = 899.50;
        
        System.out.println("Precios modificados");
        MostrarPrecios(preciosOriginales, 0);
        
        
        
    }
    
}
