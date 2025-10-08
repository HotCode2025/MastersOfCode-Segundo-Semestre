
package caja;

public class Caja {
        // Atributos (características)
    int ancho;
    int alto;
    int profundo;

    // Métodos y constructores (acciones)
    public Caja() { // Constructor 1 = vacío
    }

    // Constructor con parámetros
    public Caja(int ancho, int alto, int profundo) { // Constructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    // Método para calcular el volumen
    public int calcularVolumen() {
        return ancho * alto * profundo;
    }
}
