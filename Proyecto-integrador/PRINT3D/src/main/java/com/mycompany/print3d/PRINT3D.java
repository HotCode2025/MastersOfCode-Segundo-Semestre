
package com.mycompany.print3d;

public class PRINT3D {

    public static void main(String[] args) {
        System.out.println("BIENVENIDOS AL MENU DE PAGO Y ENVIOS DE PRINT3D");
        
        //Matriz con los codigos postales de los 18 departamentos de Mendoza
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

        switch (codigo) { case 5500 -> { nuevoCosto = 0; System.out.println("Has ingresado el codigo postal de Capital"); } case 5501 -> { nuevoCosto = 4000; System.out.println("Has ingresado el codigo postal de Godoy Cruz"); } case 5521 -> { nuevoCosto = 3000; System.out.println("Has ingresado el codigo postal de Guaymallén"); } case 5539 -> { nuevoCosto = 3000; System.out.println("Has ingresado el codigo postal de Las Heras"); } case 5507 -> { nuevoCosto = 4000; System.out.println("Has ingresado el codigo postal de Luján de Cuyo"); } case 5515 -> { nuevoCosto = 4000; System.out.println("Has ingresado el codigo postal de Maipú"); } case 5620 -> { System.out.println("Has ingresado el codigo postal de General Alvear"); nuevoCosto = 7000; } case 5570 -> { System.out.println("Has ingresado el codigo postal de Junín"); nuevoCosto = 7000; } case 5590 -> { System.out.println("Has ingresado el codigo postal de La Paz"); nuevoCosto = 7000; }
        case 5531 -> {
            System.out.println("Has ingresado el codigo postal de Lavalle");
            nuevoCosto = 5000;
        }
        case 5613 -> {
            System.out.println("Has ingresado el codigo postal de Malargüe");
            nuevoCosto = 9000;
        }
        case 5577 -> {
            System.out.println("Has ingresado el codigo postal de Rivadavia");
            nuevoCosto = 5000;
        }
        case 5569 -> {
            System.out.println("Has ingresado el codigo postal de San Carlos");
            nuevoCosto = 7000;
        }
        case 5571 -> {
            System.out.println("Has ingresado el codigo postal de San Martin");
            nuevoCosto = 7000;
        }
        case 5600 -> {
            System.out.println("Has ingresado el codigo postal de San Rafael");
            nuevoCosto = 8000;
        }
        case 5584 -> {
            System.out.println("Has ingresado el codigo postal de Santa Rosa");
            nuevoCosto = 8000;
        }
        case 5560 -> {
            System.out.println("Has ingresado el codigo postal de Tunuyán");
            nuevoCosto = 7000;
        }
        case 5561 -> {
            System.out.println("Has ingresado el codigo postal de Tupungato");
            nuevoCosto = 6500;
        }
    }
}

