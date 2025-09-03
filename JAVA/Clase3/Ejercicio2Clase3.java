import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio2Clase3 {
    public static void main(String[] args) {
        //PRIMERA PARTE CON SCANNER
        /*Scanner entrada = new Scanner(System.in);
        int numero;
        int contador = 0;

        System.out.println("=== Usando Scanner ===");
        do {
            System.out.print("Introduce un número (negativo para salir): ");
            numero = entrada.nextInt();

            if (numero >= 0) {
                contador++;
            }
        } while (numero >= 0);

        System.out.println("Se introdujeron " + contador + " números.");*/


        //SEGUNDA PARTE CON JOPTIONPANE4
        int num;
        int contadorJOP = 0;

        do {
            String input = JOptionPane.showInputDialog(null,
                    "Introduce un número (negativo para salir): ");

            if (input == null) {
                // si el usuario cierra la ventana, terminamos
                break;
            }

            num = Integer.parseInt(input);

            if (num >= 0) {
                contadorJOP++;
            }
        } while (num >= 0);

        JOptionPane.showMessageDialog(null,
                "Se introdujeron " + contadorJOP + " números.");

        System.out.println("Programa finalizado.");
    }
}
