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
public class Monomio {
    private Racional coeficiente;
    private int grado;
    private char variable;
    
    public Monomio(String cad){
        
    }
    
    public Monomio(Racional coeficiente,int grado,char variable){
        this.coeficiente = coeficiente;
        this.grado = grado;
        this.variable = variable;
    }
    
    public Racional obtenerCoef(){
        return coeficiente;
    }
}
