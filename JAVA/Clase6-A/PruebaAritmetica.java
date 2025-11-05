
package Operaciones;


public class PruebaAritmetica {
    public static void main(String[] args) {
      
       Aritmetica aritmetica1 = new Aritmetica  ();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos = "+resultado);
        
        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica b: "+ aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5 , 8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
   
        Persona persona =new Persona("Emiliano", "Bogado");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre"+persona.nombre);
        System.out.println("Persona nombre"+persona.apellido);
    }
    
}

class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre,String apellido){
        super ( );
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Obejto persona usando this: " +this);
    }
    
class Imprimir{
    public Imprimir ( ){
        super ( );//constructor de la clase´padre para reservar memoria
    }
    public void imprimir (Persona persona){
        System.out.println("Persona desde la clase imprimir:  " + persona);
        System.out.println("Imppresion del objeto actual (this):  " +this);
    }
}   
}


