import javax.swing.JOptionPane;
import java.util.Scanner;


public class PRINT3D {

public static void main(String[] args) {

        System.out.println("BIENVENIDOS AL MENU DE PAGO DE PRINT3D");



    //en esta matriz se encuentran los 18 departamentos de mendoza, ya que nuestra tienda realiza envios en mdza
        int[][] matriz = new int[6][3];

        matriz[0][0] = 5500;
        matriz[0][1] = 5501;
        matriz[0][2] = 5521;
        matriz[1][0] = 5539;
        matriz[1][1] = 5507;
        matriz[1][2] = 5515;
        matriz[2][0] = 5620;
        matriz[2][1] = 5570;
        matriz[2][2] = 5590;
        matriz[3][0] = 5531;
        matriz[3][1] = 5613;
        matriz[3][2] = 5577;
        matriz[4][0] = 5569;
        matriz[4][1] = 5570;
        matriz[4][2] = 5600;
        matriz[5][0] = 5560;
        matriz[5][1] = 5560;
        matriz[5][2] = 5561;

        int costoDeEnvio = elegirCodigoPostal(matriz);

        String[][] matrizProductos = new String[1][6];
        matrizProductos[0][0] = "1-Impresora 3D Ender 3 pro + 1KG de filamento $450.000";
        matrizProductos[0][1] = "2-Impresora 3D Ender 3 + 1KG de filamento $380.000";
        matrizProductos[0][2] = "3-Impresora 3D Bambulab A1 + 4KG de filamento $1.750.000";
        matrizProductos[0][3] = "4-Impresora 3D Bambulab H2d Ams doble extrusor + 4KG de filamento $6.300.000";
        matrizProductos[0][4] = "5-Impresora 3D Bambulab a1 mini + 1KG de filamento $600.000";
        matrizProductos[0][5] = "6-Filamento impresion 3d x 10KG $240.000";

        int precioDelProducto = agregarProducto(matrizProductos);

        validarTarjetaDebito(costoDeEnvio, precioDelProducto);

    }


    public static int elegirCodigoPostal(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        int costoDeEnvio = 0;
        boolean postal = false;
        String direc;

        // Inicializamos la matriz
        StringBuilder matrizTexto = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTexto.append(matriz[i][j]).append(" ");
            }
            matrizTexto.append("\n");
        }

        JOptionPane.showMessageDialog(null,
                "A continuación Ingrese un codigo postal de mendoza");




        //Aca solicitamos el codigo postal con un ciclo WHILE
        while (!postal) {
            String codigoStr = JOptionPane
                    .showInputDialog("Digite el código postal donde vive: ");
            int nuevoCosto = -1;
            if (codigoStr == null) {
                mostrarMensajeDespedida();
            }

            int codigo = Integer.parseInt(codigoStr);

            
            switch (codigo) {
                case 5500 -> {
                    nuevoCosto = 0;
                    System.out.println("Has ingresado el codigo postal de Capital");
                }
                case 5501 -> {
                    nuevoCosto = 4000;
                    System.out.println("Has ingresado el codigo postal de Godoy Cruz");

                }
                case 5521 -> {
                    nuevoCosto = 3000;
                    System.out.println("Has ingresado el codigo postal de Guaymallén");
                }
                case 5539 -> {
                    nuevoCosto = 3000;
                    System.out.println("Has ingresado el codigo postal de Las Heras");
                }
                case 5507 -> {
                    nuevoCosto = 4000;
                    System.out.println("Has ingresado el codigo postal de Luján de Cuyo");
                }
                case 5515 -> {
                    nuevoCosto = 4000;
                    System.out.println("Has ingresado el codigo postal de Maipú");
                }
                case 5620 -> {
                    System.out.println("Has ingresado el codigo postal de General Alvear");
                    nuevoCosto = 7000;
                }
                case  5570 -> {
                    System.out.println("Has ingresado el codigo postal de Junín");
                    nuevoCosto = 7000;
                }
                case  5590 -> {
                    System.out.println("Has ingresado el codigo postal de La Paz");
                    nuevoCosto = 7000;
                }
                case  5531 -> {
                    System.out.println("Has ingresado el codigo postal de Lavalle");
                    nuevoCosto = 5000;
                }
                case  5613 -> {
                    System.out.println("Has ingresado el codigo postal de Malargüe");
                    nuevoCosto = 9000;
                }
                case  5577 -> {
                    System.out.println("Has ingresado el codigo postal de Rivadavia");
                    nuevoCosto = 5000;
                }
                case  5569 -> {
                    System.out.println("Has ingresado el codigo postal de San Carlos");
                    nuevoCosto = 7000;
                }
                case  5571 -> {
                    System.out.println("Has ingresado el codigo postal de San Martin");
                    nuevoCosto = 7000;
                }
                case  5600 -> {
                    System.out.println("Has ingresado el codigo postal de San Rafael");
                    nuevoCosto = 8000;
                }
                case  5584 -> {
                    System.out.println("Has ingresado el codigo postal de Santa Rosa");
                    nuevoCosto = 8000;
                }
                case  5560 -> {
                    System.out.println("Has ingresado el codigo postal de Tunuyán");
                    nuevoCosto = 7000;
                }
                case  5561 -> {
                    System.out.println("Has ingresado el codigo postal de Tupungato");
                    nuevoCosto = 6500;
                }
            }

            if (nuevoCosto >= 0) {
                System.out.println("El costo de envío es de $" + nuevoCosto);
                costoDeEnvio = nuevoCosto;
                postal = true;
            } else {
                System.out.print("El código postal digitado no esta dentro de mendoza");
                System.out.print("\nDigite un codigo postal valido ");
                String respuesta = scanner.next();
                if (!respuesta.equalsIgnoreCase("S")) {
                    System.out.println(
                            "Lo esperamos en nuestra tienda fisica para poder realizar la compra");
                    break;
                }
            }
        }
        if (postal) {
            System.out.println(
                    "Genial!!, digite su calle, casa y detalles para poder hacerle llegar su envio");
            System.out.print("Digite una direccion: ");
            direc = scanner.nextLine();
            System.out.println("Ingresaste la direccion: " + direc);
            System.out.print("Sí se equivoco al ingresar hagalo nuevamente o presione enter");
            direc = scanner.nextLine();
        }

        return costoDeEnvio;
    }


    public static int agregarProducto(String[][] matrizProductos) {
        Scanner scanner = new Scanner(System.in);
        int precio = 0;
        boolean codigop = false;
        int precioProducto = -1;
        String nombre;

        StringBuilder matrizP = new StringBuilder();
        for (int i = 0; i < matrizProductos.length; i++) {
            for (int j = 0; j < matrizProductos[i].length; j++) {
                matrizP.append(matrizProductos[i][j]).append("\n ");
            }
            matrizP.append("\n");
        }

        // Solicitamos el producto mediante el ciclo while para asignar el precio al producto.

        while (!codigop) {

            String productoStr = JOptionPane
                    .showInputDialog("Digite el producto que quiere \n" + matrizP.toString());
            //por si se aprieta el boton de cancelar
            if (productoStr == null) {
                mostrarMensajeDespedida();
            }

            int producto = Integer.parseInt(productoStr);

            switch (producto) {
                case 1 -> {
                    precioProducto = 450000;
                    System.out.println("impresora 3D Ender 3 pro + 1kg de filamento");
                }
                case 2 -> {
                    precioProducto = 380000;
                    System.out.println("Impresora 3D Ender 3 + 1kg de filamento");
                }
                case 3 -> {
                    precioProducto = 1750000;
                    System.out.println("Impresora 3D Bambulab A1 + 4kg de filamento");
                }
                case 4 -> {
                    precioProducto = 6300000;
                    System.out.println("Impresora 3D Bambulab H2d AMS + 4kg de filamento");
                }
                case 5 -> {
                    precioProducto = 600000;
                    System.out.println("Impresora 3D Bambulab A1 mini + 1kg de filamento");
                }
                case 6 -> {
                    precioProducto = 240000;
                    System.out.println("Filamento de impresion 3d x 10kg");
                }
            }
      
            if (precioProducto >= 0) {
                System.out.println("El PRECIO del producto es de $" + precioProducto);
                precio = precioProducto;
                codigop = true;
            } else {
                System.out.print("Producto no registrado, ingrese otro CÓDIGO");
                System.out.print("\nDigite el numero para continuar con la compra: ");
                String respuesta = scanner.next();
                if (!respuesta.equalsIgnoreCase("S")) {
                    System.out.println(
                            "Reingrese nuevamente el producto");
                    break;
                }
            }
        }
        System.out.println(" ");

      
        if (codigop) {
            System.out.println("A continuacion se le solicitara sus datos");
            System.out.print("Digite sus datos, nombre y apellido: ");
            nombre = scanner.nextLine();
            JOptionPane.showMessageDialog(null, "DATOS ingresados:\n " + nombre);
            JOptionPane.showMessageDialog(null, "MUCHAS GRACIAS " + nombre + "\nLe invitamos a continuar el proceso de PAGO");
        }
        return precio;
    }

    
    public static void validarTarjetaDebito(int costoDeEnvio, int precioProducto) {
        Scanner scanner = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "El pago se realiza a travez de debito o credito");
        double precioFinal = costoDeEnvio + precioProducto;
        JOptionPane.showMessageDialog(null, "monto a pagar: $" + precioFinal);
        System.out.println("El monto total de compra es de: $" + precioFinal);

        String numeroTarjeta;
        int longTarjeta;
        String codigoSeguridad;
        int longCodigo;
        int mes, anio;

        do {
            System.out.println("Ingrese el número de su tarjeta: ");
            numeroTarjeta = scanner.next();
            longTarjeta = numeroTarjeta.length();
            if (longTarjeta != 16) {
                System.out.println("las tarjetas solo contienen 16 dígitos. Intente nuevamente");
            }
        } while (longTarjeta != 16);
        System.out.println("tarjeta ingresada correctamente");

        do {
            System.out.println(
                    "Ingrese el cvv");
            codigoSeguridad = scanner.next();
            longCodigo = codigoSeguridad.length();
            if (longCodigo != 3) {
                System.out.println("El cvv ingresado es incorrecto, ingréselo nuevamente: ");
            }
        } while (longCodigo != 3);
        System.out.println("cvv ingresado correctamente");

        do {
            System.out.println("Ingrese el numero del mes en que vence su tarjeta ");
            mes = scanner.nextInt();
            System.out.println("ingrese al año de vencimiento en formato(AA): ");
            anio = scanner.nextInt();
            if (mes >= 1 && mes <= 12 && anio >= 26 && anio <= 99) {
                System.out.println("fecha de vencimiento correcta");
                break;
            } else {
                System.out.println("la fecha ingresada es invalida");
            }
        } while (true);
        System.out.println("Pago exitoso, en breve recibira su correo de confirmacion");
    }


  
    private static void mostrarMensajeDespedida() {
        JOptionPane.showMessageDialog(null, "¡¡¡Gracias por comprar en PRINT3D!!!");
    }
}