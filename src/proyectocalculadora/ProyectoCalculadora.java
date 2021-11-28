/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocalculadora;

import Calculadora.ClaseCalculadora;
import java.util.Scanner;

/**
 *
 * @author mike_
 */
public class ProyectoCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        double val1=0, val2=0;
        
        char opcion = menu();
        
        while(opcion!='x'){
            val1 = pedir();
            val2 = pedir();
            ClaseCalculadora operacion = new ClaseCalculadora();
            
            switch (opcion){
                case 'a':
                    System.out.println("La respuesta es: "+operacion.suma(val1, val2));;
                    break;
                case 'b':
                    System.out.println("La respuesta es: "+operacion.resta(val1, val2));;
                    break;
                case 'c':
                    System.out.println("La respuesta es: "+operacion.division(val1, val2));;
                    break;
                case 'd':
                    System.out.println("La respuesta es: "+operacion.multiplicacion(val1, val2));;
                    break;
            }
            opcion = menu();
        }
    
    }

    private static char menu(){
        char opcion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("a) Sumar");
        System.out.println("b) Restar");
        System.out.println("c) Dividir");
        System.out.println("d) Multiplicar");
        System.out.println("x) Salir");
        opcion = scanner.nextLine().charAt(0);
        return opcion;
    }
    private static double pedir(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero");
        double num = scanner.nextDouble();
        return num;
    }
    
}
