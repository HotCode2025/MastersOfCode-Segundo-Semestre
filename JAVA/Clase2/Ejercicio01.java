import javax.swing.JOptionPane;

public class Ejercicio01 {
    public static void main(String[] args) {
        int numero, cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        while (numero >= 0) { // Mientras el número sea igual a cero o positivo
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("El numero " + numero + " elevado al cuadrado es: " + cuadrado);

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }

        System.out.println("El programa ha finalizado por número negativo");
    }
}