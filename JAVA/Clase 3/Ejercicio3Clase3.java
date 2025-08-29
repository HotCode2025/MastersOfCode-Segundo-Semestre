import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio3Clase3 {
    public static void main(String[] args) {
        // ----------- PRIMERA PARTE CON SCANNER -----------
        /*Scanner entrada = new Scanner(System.in);
        int numeroAleatorio = (int)(Math.random() * 101); // número entre 0 y 100
        int intento;
        int contador = 0;

        System.out.println("=== Juego con Scanner ===");

        do {
            System.out.print("Adivina el número (0-100): ");
            intento = entrada.nextInt();
            contador++;

            if (intento < numeroAleatorio) {
                System.out.println("El número es MAYOR.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es MENOR.");
            } else {
                System.out.println("¡Correcto! Has adivinado en " + contador + " intentos.");
            }

        } while (intento != numeroAleatorio);*/


        //SEGUNDA PARTE CON JOPTIONPANE
        int numeroAleatorio2 = (int)(Math.random() * 101);
        int intento2;
        int contador2 = 0;

        JOptionPane.showMessageDialog(null, "=== Juego con JOptionPane ===");

        do {
            String input = JOptionPane.showInputDialog("Adivina el número (0-100):");

            if (input == null) {
                JOptionPane.showMessageDialog(null, "Juego cancelado.");
                return;
            }

            intento2 = Integer.parseInt(input);
            contador2++;

            if (intento2 < numeroAleatorio2) {
                JOptionPane.showMessageDialog(null, "El número es MAYOR.");
            } else if (intento2 > numeroAleatorio2) {
                JOptionPane.showMessageDialog(null, "El número es MENOR.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "¡Correcto! Has adivinado en " + contador2 + " intentos.");
            }

        } while (intento2 != numeroAleatorio2);

        System.out.println("Juego terminado.");
    }
}
