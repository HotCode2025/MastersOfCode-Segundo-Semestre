import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Menú inicial
        String[] opciones = {"Scanner (Consola)", "JOptionPane (Ventana)"};
        int eleccion = JOptionPane.showOptionDialog(
                null,
                "¿Cómo desea ingresar la fecha?",
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

            System.out.print("Ingrese el día: ");
            int dia = entrada.nextInt();

            System.out.print("Ingrese el mes: ");
            int mes = entrada.nextInt();

            System.out.print("Ingrese el año: ");
            int anio = entrada.nextInt();

            if (fechaValida(dia, mes, anio)) {
                System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es válida.");
            } else {
                System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es inválida.");
            }

            entrada.close();
        }

        // Opción 1 = JOptionPane
        else if (eleccion == 1) {
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día:"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes:"));
            int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año:"));

            if (fechaValida(dia, mes, anio)) {
                JOptionPane.showMessageDialog(null, "La fecha " + dia + "/" + mes + "/" + anio + " es válida.");
            } else {
                JOptionPane.showMessageDialog(null, "La fecha " + dia + "/" + mes + "/" + anio + " es inválida.");
            }
        }

        // Si se cierra el menú
        else {
            JOptionPane.showMessageDialog(null, "No seleccionó ninguna opción. Programa terminado.");
        }
    }

    // metodo para validar la fecha
    public static boolean fechaValida(int dia, int mes, int anio) {
        return (dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12) && (anio > 0);
    }
}