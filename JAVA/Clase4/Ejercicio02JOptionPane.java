import javax.swing.JOptionPane;
public class Ejercicio02JOptionPane {
    public static void main(String[] args) {
        int numero;
        int suma = 0;
        int contador = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número positivo (negativo para salir):"));
            if (numero >= 0) {
                suma += numero;
                contador++;
            }
        } while (numero >= 0);

        if (contador > 0) {
            double media = (double) suma / contador;
            JOptionPane.showMessageDialog(null, "La media de los números es: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron números positivos.");
        }
    }
}
