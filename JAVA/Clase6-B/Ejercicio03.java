import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio03 {
    public static void main(String[] args) {

        // Forma 1: Usando Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = entrada.nextInt();
        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

        //Forma 2: Usando JOptionPane
        String input = JOptionPane.showInputDialog("Ingrese un número para calcular su factorial:");
        int num2 = Integer.parseInt(input);
        long factorial2 = 1;

        for (int i = 1; i <= num2; i++) {
            factorial2 *= i;
        }

        JOptionPane.showMessageDialog(null, "El factorial de " + num2 + " es: " + factorial2);
    }
}