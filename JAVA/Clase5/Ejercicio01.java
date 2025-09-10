import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Menú inicial
        String[] opciones = {"Scanner (Consola)", "JOptionPane (Ventana)"};
        int eleccion = JOptionPane.showOptionDialog(
                null,
                "¿Cómo desea ingresar el número N?",
                "Menú de opciones",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        // Opción 0 = Scanner
        if (eleccion == 0) {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese un número N: ");
            int N = entrada.nextInt();

            System.out.println("Números del 1 al " + N + ":");
            for (int i = 1; i <= N; i++) {
                System.out.println(i);
            }
            entrada.close();
        }

        // Opción 1 = JOptionPane
        else if (eleccion == 1) {
            String input = JOptionPane.showInputDialog("Ingrese un número N:");
            int N = Integer.parseInt(input);

            StringBuilder resultado = new StringBuilder("Números del 1 al " + N + ":\n");
            for (int i = 1; i <= N; i++) {
                resultado.append(i).append("\n");
            }

            JOptionPane.showMessageDialog(null, resultado.toString());
        }

        // Si se cierra el menú sin elegir nada
        else {
            JOptionPane.showMessageDialog(null, "No seleccionó ninguna opción. Programa terminado.");
        }
    }
}