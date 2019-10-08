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
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Polinomio {
    
    private ArrayList <Monomio> coeficiente = new ArrayList<>();

    /**
     *
     * @param opcion
     */
    public void establecerCoeficientes(int opcion){
        Random r = new Random();
        int grado;
        if(opcion == 3){
            grado = (r.nextInt(3)) + 1;
        }
        else{
            grado = (r.nextInt(6)) + 1;
        }
        if(opcion==9||opcion==8){
            grado = (r.nextInt(3)) + 1;
            if(grado==3) {
            	grado--;
            }
        }
        
        for(int i=0; i<=grado; i++){
        	if(grado==2) {
                coeficiente.add(new Monomio(new Racional(r.nextInt(10),r.nextInt(9)+1),i,'x'));    		
        	}
        	else {
                coeficiente.add(new Monomio(new Racional(r.nextInt(10),r.nextInt(9)+1),i,'x'));
        	}
        }

        if(coeficiente.get(grado).obtenerCoef().obtenerNum() == 0){
            coeficiente.remove(grado);
            coeficiente.add(new Monomio(new Racional(r.nextInt(9)+1,r.nextInt(9)+1),grado,'x'));
        }
    }
    
    /**
     *
     * @param pol
     */
    /*public void establecerCoeficientes(String pol){
    	String[] p = pol.split("x");
    	int x = 0;
    	ArrayList <Integer> num = new ArrayList <>();
    	ArrayList <Integer> exp = new ArrayList <>();
    	
    	for(int i = 0; i<p.length;i++) {
    		if(i==0) {
    			num.add(Integer.parseInt(p[i]));
    		}
    		else {
    			if(p[i].length() >= 4){
    				num.add(Integer.parseInt(p[i].substring(2,p[i].length())));
                        }
    			exp.add(Integer.parseInt(String.valueOf(p[i].charAt(1))));
    		}
    	}
    	
    	if(exp.size() < num.size())
    		exp.add(0);
    	
    	for(int c = num.size()-1;c>=0;c--) {
    		this.coeficiente.add(num.get(c));
    	}
    	
    	for(int j = 0; j<= exp.get(0);j++) {
    		for(int z=exp.size()-1;z >=0 ;z--){
    			if(j == exp.get(z))
    				x++;
    		}
    		
    		if(x == 0)
    			this.coeficiente.add(j,0);
    		
    		x = 0;
    	}
    }
    
    /**
     *
     * @param A
     * @param B
     */
    
    public void suma(Polinomio A,Polinomio B){
        Monomio m = new Monomio();
        if(A.coeficiente.size() >=  B.coeficiente.size()){
            for(int i =0; i<B.coeficiente.size();i++){
                m = B.coeficiente.get(i).sumarMonomios(A.coeficiente.get(i));
                this.coeficiente.add(m);
            }
            for(int j = B.coeficiente.size();j<A.coeficiente.size();j++){
                this.coeficiente.add(A.coeficiente.get(j));
            }
        }
        else{
            for(int i =0; i<A.coeficiente.size();i++){
                m = A.coeficiente.get(i).sumarMonomios(B.coeficiente.get(i));
                this.coeficiente.add(m);
            }
            for(int j = A.coeficiente.size();j<B.coeficiente.size();j++){
                this.coeficiente.add(B.coeficiente.get(j));
            }
        }
        
    }
    
    /**
     *
     * @param A
     * @param B
     */
    
    public void resta(Polinomio A,Polinomio B){
        Monomio m = new Monomio();
        if(A.coeficiente.size() >=  B.coeficiente.size()){
            for(int i =0; i<B.coeficiente.size();i++){
                m = A.coeficiente.get(i).restarMonomios(B.coeficiente.get(i));
                this.coeficiente.add(m);
            }
            for(int j = B.coeficiente.size();j<A.coeficiente.size();j++){
                this.coeficiente.add(A.coeficiente.get(j));
            }
        }
        else{
            for(int i =0; i<A.coeficiente.size();i++){
                m = A.coeficiente.get(i).restarMonomios(B.coeficiente.get(i));
                this.coeficiente.add(m);
            }
            for(int j = A.coeficiente.size();j<B.coeficiente.size();j++){
                this.coeficiente.add(new Monomio(new Racional(0 - B.coeficiente.get(j).obtenerCoef().obtenerNum(),B.coeficiente.get(j).obtenerCoef().obtenerDen()),j,'x'));
            }
        }
    }
    
    /**
     *
     * @param A
     * @param B
     */
    /*
    public void multiplicacion(Polinomio A,Polinomio B){
        int sumaProductos = 0;
        int productoExponentes = 0;
        for(int z = 0; z<=(A.coeficiente.size() + B.coeficiente.size())-2; z++){
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
    
    /**
     *
     * @param A
     * @param B
     */
    /*
    public void division(Polinomio A,Polinomio B){
        ArrayList <Integer> cocientes = new ArrayList<>();
        int cont = 0;
        int contR = 0;
        if(A.coeficiente.size() >= B.coeficiente.size()){
         for(int i = 0;i<=(A.coeficiente.size() - B.coeficiente.size());i++){
            cocientes.add(A.coeficiente.get(((A.coeficiente.size()-1))-cont) / B.coeficiente.get(B.coeficiente.size()-1));
            for(int j=B.coeficiente.size()-1;j>=0;j--){
                A.coeficiente.set((A.coeficiente.size()-1)-cont-contR,(A.coeficiente.get((A.coeficiente.size()-1)-cont-contR)) + (B.coeficiente.get(j)*cocientes.get(i)*(-1)));
                contR++;
            }
            
            cont++;
            contR=0;
         }
        }
        else{
            if(B.coeficiente.size() > A.coeficiente.size()){
                for(int i = 0;i<=(B.coeficiente.size() - A.coeficiente.size());i++){
                    cocientes.add((B.coeficiente.get((B.coeficiente.size()-1))-cont) / A.coeficiente.get(A.coeficiente.size()-1));
                    for(int j=A.coeficiente.size()-1;j>=0;j--){
                        B.coeficiente.set((B.coeficiente.size()-1)-cont-contR,(B.coeficiente.get((B.coeficiente.size()-1)-cont-contR)) + (A.coeficiente.get(j)*cocientes.get(i)*(-1)));
                        contR++;
                    }

                    cont++;
                    contR=0;
                }
            }
        }
        
        for(int z=cocientes.size()-1;z>=0;z--){
            this.coeficiente.add(cocientes.get(z));
        }
    }
    
    /**
     *
     * @param A
     */
    /*
    public void derivada(Polinomio A){
    	for(int i=1;i<A.coeficiente.size();i++) {
    		this.coeficiente.add(A.coeficiente.get(i) * i);
    	}
    }
    
    /**
     *
     * @param A
     * @param num
     * @param r
     */
    /*
    public void integral(Polinomio A, int num,float r) {
    	
    	float eval=0;
    	this.coeficiente.add(0);
    	for(int i=0;i<A.coeficiente.size();i++) {
    		this.coeficiente.add(A.coeficiente.get(i));
    		eval=eval+(float)(A.coeficiente.get(i)*(int)Math.pow(num,i+1))/(i+1);
    	}
    	if(r==eval) System.out.println("Respuesta CORRECTA");
    	else System.out.println("Respuesta INCORRECTA");
    	System.out.println("El resultado de la integral definida es: "+ eval);
    }
    
    /**
     *
     * @param A
     */
    /*
    public void resuelveEc(Polinomio A){
        double solucion=0;
        switch(A.coeficiente.size()-1){
            case 1:
                solucion = (float)-(A.coeficiente.get(0))/(A.coeficiente.get(1));
                System.out.println("Raiz: "+ solucion);
                break;
            case 2:
                Double discriminante = Math.pow(A.coeficiente.get(1), 2) - 4*A.coeficiente.get(0)*A.coeficiente.get(2);
                if(discriminante >= 0){
                    solucion=  (double)(((-A.coeficiente.get(1))+(double)Math.sqrt(discriminante))/(2*A.coeficiente.get(0)));
                    System.out.println("Raiz 1: "+ solucion);
                    solucion= (double)((-A.coeficiente.get(1))-(double)Math.sqrt(discriminante))/(2*A.coeficiente.get(0));
                    System.out.println("Raiz 2: "+ solucion);
                }else{
                    solucion =  (double)(-A.coeficiente.get(1)/(2*A.coeficiente.get(0)));
                    System.out.println("Raiz 1: "+ solucion + "+" + (double)Math.sqrt(-discriminante)/(2*A.coeficiente.get(1))+"i");
                    solucion =  (double)(-A.coeficiente.get(1)/(2*A.coeficiente.get(0)));
                    System.out.println("Raiz 1: "+ solucion + "-"+(double)(Math.sqrt(-discriminante)/(2*A.coeficiente.get(1)))+"i");
                }
                break;
        }

    }
    
    /**
     *
     * @param opcion
     */
    public void reducir(){
        for(int i=0;i<coeficiente.size();i++){
            coeficiente.get(i).obtenerCoef().simplificar();
        }
    }
    
    public void imprimirPolinomio(){
        int cont = 0;
        for(int j = 0; j<coeficiente.size() && coeficiente.get(j).obtenerCoef().obtenerNum() == 0; j++){
            cont++;
        }
        for(int i = coeficiente.size()-1;i>=0;i--){
            if(!(coeficiente.get(i).obtenerCoef().obtenerNum() == 0)){
                //coeficiente.get(i).obtenerCoef().simplificar();
                if(i == 0)
                    System.out.print(coeficiente.get(i).obtenerCoef().toString());
                else
                    System.out.print(coeficiente.get(i).obtenerCoef().toString()+"x^"+i);
                if(i > cont){
                    System.out.print("+");    
                }
            }
            
        }
        System.out.print("=0");
        System.out.print("\n");
    }
    
    /**
     *
     * @param B
     */
    public void comparar(Polinomio B) {
    	boolean x = true;
        if(this.coeficiente.size() == B.coeficiente.size()){
    		for(int i =0; i<B.coeficiente.size(); i++) {
    			if(!(this.coeficiente.get(i) == B.coeficiente.get(i))) {
   
    				x = false; 
    				break;
    			}
    		}
    		
    		if(x == true)
    			System.out.println("El resultado es CORRECTO");
    		else
    			System.out.println("El resultado es INCORRECTO");
        }
        else{
            System.out.println("El resultado es INCORRECTO");
        }
    	
    }

}
