/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Omar Ramirez
 */
import java.util.Scanner;
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Álgebra de Polinomios\n");
        System.out.println("1 Suma");
        System.out.println("2 Resta");
        System.out.println("3 Multiplicación");
        System.out.println("4 División");
        System.out.println("5 Teorema Fundamenttal del Álgebra\n");
        System.out.println("Teclee la opción que desea elegir:");

        int opcion = teclado.nextInt();
        
        System.out.println("Generando polinomios...");
        
        Polinomio A = new Polinomio();
        Polinomio B = new Polinomio();
        Polinomio C = new Polinomio();
        
        A.establecerCoeficientes(opcion);
        B.establecerCoeficientes(opcion);
        
        System.out.println("Polinomio(s) generados: ");
        A.imprimirPolinomio();
        B.imprimirPolinomio();
        
        System.out.println("Ingrese su respuesta: ");
            
        System.out.println("Polinomio resultante: ");
        
        
        switch(opcion){
            case 1:
                C.suma(A, B);
                C.imprimirPolinomio();
                break;
            case 2:
                C.resta(A,B);
                C.imprimirPolinomio();
                break;
            case 3:
                C.multiplicacion(A,B);
                C.imprimirPolinomio();
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Opción NO válida");
        }
    }
    
}
