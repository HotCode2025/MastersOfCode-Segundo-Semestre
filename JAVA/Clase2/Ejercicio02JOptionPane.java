import javax.swing.JOptionPane;

public class Ejercicio02JOptionPane {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        while (numero != 0) {
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es POSITIVO");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es NEGATIVO");
            }

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }

        JOptionPane.showMessageDialog(null, "El número " + numero + " finaliza el programa");
    }
}