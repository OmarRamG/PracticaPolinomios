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
public class Racional {
    private int num;
    private int den;
	
        public Racional(){
            num = 1;
            den = 1;
        }
        
	public Racional(int num, int den) //Constructor con 2 parametros enteros.
	{
		//num=num; //Asi no se puede, nos da error.
		//den=den;
		if (den==0) //Protegemos informacion = Encapsulamiento.
		{
			this.den=1;
		}
		else
		{
			this.den=den; //This se refiere al objeto en el que estamos "jugando".
		}
		this.num=num; //Asi si puedo diferenciar, this.num me refiero al de la clase.
	}
	
	
        
        public static Racional sumar(Racional r1,Racional r2)
	{
		Racional R = new Racional((r1.num * r2.den)+(r2.num * r1.den),r1.den * r2.den);
		return R;
	}
	
	public static Racional restar(Racional r1,Racional r2)
	{
		Racional R = new Racional((r1.num * r2.den)-(r2.num * r1.den),r1.den * r2.den);
		return R;
	}
	
	public static Racional multi(Racional r1,Racional r2)
	{
		Racional R = new Racional(r1.num * r2.num,r1.den * r2.den);
		return R;
	}
        
        public static Racional dividir(Racional r1,Racional r2)
	{
		Racional R = new Racional(r1.num * r2.den,r1.den * r2.num);
		return R;
	}
	
        public int obtenerNum(){
            return num;
        }
        
        public int obtenerDen(){
            return den;
        }

	public void imprimir()
	{
		System.out.println("[" + num + ", " + den + "]");
	}
        
	public String toString() 
	{
		return "(" + num + "/" + den + ")";
	}
	
	
        public void simplificar(){
            int a=num, b=den;
           if(!(a == 0)){
            while(b>0){

            if(a>b){
                a = a - b;
            }
            else{
                b = b - a;
            }
          }
          num=num/a;
          den=den/a;
         }
        }

}
