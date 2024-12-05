/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.johannamorales2025;

import Clases.Calculadora;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class JohannaMorales2025 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora= new Calculadora();
         
        while (true) {
    
            System.out.println("Escoja una opcion");
            System.out.println("1.Sumar numeros");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("Resultado nuevo"+ calculadora.getResultado());
            System.out.println("4. Salir");
            
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el numero que desee ");
                    int numero = scanner.nextInt();
                    calculadora.sumar(numero);
                    break;

                case 2:
                    if (!calculadora.()) {
                        System.out.println("No existen datos");
                    }
                    break;

                case 3:
                    if (!calculadora.rehacer()) {
                        System.out.println("No existen datos");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo gracias por usar el programa");
                    scanner.close();
                    return;
                       
  
                default:
                    System.out.println("Opción inválida.");
        }
    
        }
    }
}
