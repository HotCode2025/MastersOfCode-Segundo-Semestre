import javax.swing.JOptionPane;

public class Ejercicio01JOptionPane {
    public static void main(String[] args) {
        int numero;
        int suma = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número (0 para salir):"));
            suma += numero;
        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "La suma de los números es: " + suma);
    }
}
