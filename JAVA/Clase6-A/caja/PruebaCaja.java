
package caja;

public class PruebaCaja {
        public static void main(String args[]) {
        // Variables locales
        int medidaAncho = 3; // Valores ingresados en código duro
        int medidaAlto = 2;
        int medidaProf = 6;

        Caja caja1 = new Caja(); // Instanciamos el objeto, constructor vacío
        caja1.ancho = medidaAncho; // Le pasamos los valores al objeto
        caja1.alto = medidaAlto;
        caja1.profundo = medidaProf;

        int resultado = caja1.calcularVolumen(); // Llamamos al método
        // Primer resultado
        System.out.println("Resultado volumen de caja 1: " + resultado);

        Caja caja2 = new Caja(2, 4, 6); 
        // Llamamos con el nuevo objeto al método para un nuevo cálculo
        System.out.println("Resultado volumen de caja 2: " + caja2.calcularVolumen());
    }
}
