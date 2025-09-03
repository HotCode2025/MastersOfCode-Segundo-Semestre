import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio1clase3 {
    public static void main(String[] args) {
        //PRIMERA PARTE CON SCANNER
       /* Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("=== Usando Scanner ===");
        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = entrada.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    System.out.println(numero + " es PAR");
                } else {
                    System.out.println(numero + " es IMPAR");
                }
            }
        } while (numero != 0);*/

       //SEGUNDA PARTE CON JOPTIONPANE
        int num;
        do {
            String input = JOptionPane.showInputDialog(null, "Introduce un número (0 para salir): ");

            if (input == null) {
                // Si cierran la ventana, salimos
                break;
            }

            num = Integer.parseInt(input);

            if (num != 0) {
                if (num % 2 == 0) {
                    JOptionPane.showMessageDialog(null, num + " es PAR");
                } else {
                    JOptionPane.showMessageDialog(null, num + " es IMPAR");
                }
            }
        } while (num != 0);

        System.out.println("Programa finalizado.");

    }
}
