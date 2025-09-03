import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;

        System.out.println("Ingrese números positivos (un número negativo para terminar):");

        do {
            numero = entrada.nextInt();
            if (numero >= 0) {
                suma += numero;
                contador++;
            }
        } while (numero >= 0);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }
    }
}
