/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Alumno
 */
import java.util.Scanner;
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pol;
    	char resp='s';
    	while(resp=='s' || resp == 'y') {
    	
        System.out.println("Álgebra de Polinomios\n");
        System.out.println("1-. Suma");
        System.out.println("2-. Resta");
        System.out.println("3-. Multiplicación");
        System.out.println("4-. División");
        System.out.println("5-. Derivada");
        System.out.println("6-. Integral");
        System.out.println("8-. Raices\n");
        System.out.println("Teclee la opción que desea elegir:");

        int opcion = teclado.nextInt();
        
        System.out.println("Generando polinomios...");
        
        Polinomio A = new Polinomio();
        Polinomio B = new Polinomio();
        Polinomio C = new Polinomio();
        Polinomio D = new Polinomio();
        
        A.establecerCoeficientes(opcion);
        B.establecerCoeficientes(opcion);
        
        System.out.println("Polinomio(s) generados: ");
       if(opcion==5||opcion==6||opcion==8) {
           A.imprimirPolinomio();
       }
       else { 
           A.imprimirPolinomio();B.imprimirPolinomio();
       }
        /*if(opcion!=6&&opcion!=8) {
        System.out.println("Ingrese su respuesta (Incluir el número 1): ");
        pol = teclado.next();
        D.establecerCoeficientes(pol);
        
        System.out.println("Respuesta:");
        }
        
        switch(opcion){
            case 1:
                C.suma(A, B);
                C.imprimirPolinomio(opcion);
                D.imprimirPolinomio(opcion);
                C.comparar(D);
                break;
            case 2:
                C.resta(A,B);
                C.imprimirPolinomio(opcion);
                D.imprimirPolinomio(opcion);
                C.comparar(D);
                break;
            case 3:
                C.multiplicacion(A,B);
                C.imprimirPolinomio(opcion);
                D.imprimirPolinomio(opcion);
                C.comparar(D);
                break;
            case 4:
                C.division(A,B);
                C.imprimirPolinomio(opcion);
                C.comparar(D);
                break;
            case 5:
            	C.derivada(A);
            	C.imprimirPolinomio(opcion);
            	C.comparar(D);
                break;
            case 6:
            	opcion=7;
            	System.out.print("Digite el valor de x a evaluar: ");
            	int num;
            	num=teclado.nextInt();
            	System.out.print("Digite su respuesta: ");
            	float r;
            	r=teclado.nextFloat();
            	C.integral(A,num,r);
            	C.imprimirPolinomio(opcion);
                break;
            case 8:
            	opcion=9;
            	C.resuelveEc(A);
                break;
            default:
                System.out.println("Opción NO válida");
        }
        System.out.println("¿Desea Realizar otra Operación?");
        resp=teclado.next().charAt(0);

*/        }
   }

    }
    

