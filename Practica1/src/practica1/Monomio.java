/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *                  (67/67)
 * @author Alumno  (345/56)x^2
 */
public class Monomio {
    private Racional coeficiente;
    private int grado;
    private char variable;
    
    public Monomio(){
    }
    
    public Monomio(String cad){
        String fraccion;
        String frac[];
        variable = 'x';
        if(cad.contains("x")){
            fraccion = cad.substring(1,cad.length()-4);
            frac = fraccion.split("/");
            grado = Integer.parseInt(cad.substring(cad.length()-1, cad.length()));
            
        }
        else{
            fraccion = cad.substring(1,cad.length()-1);
            frac = fraccion.split("/");
            grado = 0;
        }
        
        coeficiente = new Racional(Integer.parseInt(frac[0]),Integer.parseInt(frac[1]));
    }
    
    public Monomio(Racional coeficiente,int grado,char variable){
        this.coeficiente = coeficiente;
        this.grado = grado;
        this.variable = variable;
    }
    
    public Monomio sumarMonomios(Monomio mono){
        Monomio m = new Monomio();
        m.variable = mono.variable;
        m.grado = mono.grado;
        m.coeficiente = Racional.sumar(this.coeficiente, mono.coeficiente);
        return m;
    }
    
    public Monomio restarMonomios(Monomio mono){
        Monomio m = new Monomio();
        m.variable = mono.variable;
        m.grado = mono.grado;
        m.coeficiente = Racional.restar(this.coeficiente, mono.coeficiente);
        return m;
    }
    
    public Monomio multiMonomios(Monomio mono){
        Monomio m = new Monomio();
        m.variable = mono.variable;
        m.grado = mono.grado + this.grado;
        m.coeficiente = Racional.multi(this.coeficiente, mono.coeficiente);
        return m;
    }
    
    public Monomio dividirMonomios(Monomio mono){
        Monomio m = new Monomio();
        m.variable = mono.variable;
        m.grado = this.grado - mono.grado;
        m.coeficiente = Racional.dividir(this.coeficiente, mono.coeficiente);
        return m;
    }
    
    public Racional obtenerCoef(){
        return coeficiente;
    }
    public int obtenerGrado(){
        return grado;
    }
}
