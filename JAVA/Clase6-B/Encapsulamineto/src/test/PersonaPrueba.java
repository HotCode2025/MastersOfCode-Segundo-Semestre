
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("osvaldo",57.000,false);
        
        //Modificar a traves de los metodoss
        persona1.setNombre("Juan Carlos");
        //persona1.setNombre("Juan Carlos");YA NO SE PUEDE UTILIZAR
        //System.out.println("Nombre es: "+persona1.nombre);ERROR
        System.out.println("Persona1 con su nombre modificado: "+persona1.getNombre());
        System.out.println("Persona1 con el reusltado de sueldo: "+persona1.getSueldo());
        System.out.println("Persona1 para obtener su booleano: "+persona1.isEliminado());
        System.out.println("persona1 = " + persona1);
    }
}

//tarea- crear un objeto de tipo persona, asignar valores de manera inicial
//e imprimir, luego modificar sus valores y volver a imprimir


