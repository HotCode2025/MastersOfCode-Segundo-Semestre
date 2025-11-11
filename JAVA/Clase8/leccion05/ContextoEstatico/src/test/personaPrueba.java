
package test;

import Domain.Persona;

public class personaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Joaquin");
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("emi");
        System.out.println("persona1 = " + persona1);
        imprimir(persona1);
        imprimir(persona2);
    }
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
}
