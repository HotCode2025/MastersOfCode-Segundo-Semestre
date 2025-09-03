import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Ingrese números (0 para salir):");

        do {
            numero = entrada.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma de los números es: " + suma);
    }
}
