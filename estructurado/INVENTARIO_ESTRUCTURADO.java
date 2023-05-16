
/**
 * Write a description of class INVENTARIO_ESTRUCTURADO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class INVENTARIO_ESTRUCTURADO
{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        String[] Nombres = new String[50];
        int[] Cantidad = new int[50];
        
        int numeroClientes;
        String nombre;
        int Cantidades;
        double promedio = 0;
        System.out.println("Digite la cantidad de Clientes; ");
        numeroClientes = sc.nextInt();
        for(int i = 0; i < numeroClientes; i++){
            System.out.println("Digite el nombre del cliente: ");
            nombre = sc.next();
            System.out.println("Digite la cantidad de perfumes en la compra: ");
            Cantidades = sc.nextInt();
            Nombres[i] = nombre;
            Cantidad[i] = Cantidades;
        }
        
        for (int i = 0; i < numeroClientes; i++){
            promedio = promedio + Cantidad[i] * numeroClientes;
        }
        System.out.println("El promedio de notas es: " + promedio);
        
        
        
    }
}
