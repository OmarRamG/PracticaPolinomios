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
import java.util.Random;
import java.util.ArrayList;
public class Polinomio {
    
    private ArrayList<Integer> coeficiente = new ArrayList<>();
    
    
    
    public void establecerCoeficientes(int opcion){
        Random r = new Random();
        int grado;
        if(opcion == 3){
            grado = (r.nextInt(3)) + 1;
        }
        else{
            grado = (r.nextInt(6)) + 1;
        }
        
        for(int i=0; i<=grado; i++){
            coeficiente.add(r.nextInt(10));
        }
        
        if(coeficiente.get(grado) == 0 && grado==1){
           coeficiente.remove(grado);
           coeficiente.add(r.nextInt(9)+1);
        }
    }
    
    public void suma(Polinomio A,Polinomio B){
        if(A.coeficiente.size() >=  B.coeficiente.size()){
            for(int i =0; i<B.coeficiente.size();i++){
                this.coeficiente.add(A.coeficiente.get(i) + B.coeficiente.get(i));
            }
            for(int j = B.coeficiente.size();j<A.coeficiente.size();j++){
                this.coeficiente.add(A.coeficiente.get(j));
            }
        }
        else{
            for(int i =0; i<A.coeficiente.size();i++){
                this.coeficiente.add(A.coeficiente.get(i) + B.coeficiente.get(i));
            }
            for(int j = A.coeficiente.size();j<B.coeficiente.size();j++){
                this.coeficiente.add(B.coeficiente.get(j));
            }
        }
        
    }
    
    public void resta(Polinomio A,Polinomio B){
        if(A.coeficiente.size() >=  B.coeficiente.size()){
            for(int i =0; i<B.coeficiente.size();i++){
                this.coeficiente.add(A.coeficiente.get(i) - B.coeficiente.get(i));
            }
            for(int j = B.coeficiente.size();j<A.coeficiente.size();j++){
                this.coeficiente.add(A.coeficiente.get(j));
            }
        }
        else{
            for(int i =0; i<A.coeficiente.size();i++){
                this.coeficiente.add(A.coeficiente.get(i) - B.coeficiente.get(i));
            }
            for(int j = A.coeficiente.size();j<B.coeficiente.size();j++){
                this.coeficiente.add(B.coeficiente.get(j));
            }
        }
    }
    
    public void multiplicacion(Polinomio A,Polinomio B){
        int sumaProductos;
        int productoExponentes = 0;
        for(int z = 0; z<7; z++){
            sumaProductos = 0;
            for(int i =0; i< A.coeficiente.size(); i++){
                for(int j = 0; j < B.coeficiente.size();j++){
                    if((i+j) == productoExponentes){
                        sumaProductos = sumaProductos + (A.coeficiente.get(i) * B.coeficiente.get(j));
                    }
                }
            }
            
            productoExponentes++;
            this.coeficiente.add(sumaProductos);
        }
        
    }
    
    public void division(Polinomio A,Polinomio B){
        
    }
    
    public void imprimirPolinomio(){
        int cont = 0;
        for(int j = 0;this.coeficiente.get(j) == 0; j++){
            cont++;
        }
        for(int i=this.coeficiente.size()-1;i>=0;i--){
            if(!(this.coeficiente.get(i) == 0)){

                    
                if(i==0){
                 if(this.coeficiente.get(i) <0)
                    System.out.print("("+this.coeficiente.get(i)+")");
                 else
                    System.out.print(this.coeficiente.get(i)); 
                }
                else{
                 if(this.coeficiente.get(i) <0)
                    System.out.print("("+this.coeficiente.get(i)+")x^"+i);
                 else
                    System.out.print(this.coeficiente.get(i)+"x^"+i);
                 
                }
                if(i > cont)
                    System.out.print("+");
            }
            
        }
        System.out.print("=0");
        System.out.println("\n");
        
    }
}
