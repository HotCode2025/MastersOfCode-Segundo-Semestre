
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        //Creamos 10 productos
        Producto producto1 = new Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);
        Producto producto3 = new Producto("Remera", 3500.00);
        Producto producto4 = new Producto("Zapatos", 12000.00);
        Producto producto5 = new Producto("Gorra", 1500.00);
        Producto producto6 = new Producto("Bufanda", 2500.00);
        Producto producto7 = new Producto("Medias", 500.00);
        Producto producto8 = new Producto("Cinturon", 3000.00);
        Producto producto9 = new Producto("Mochila", 8500.00);
        Producto producto10 = new Producto("Buzos", 25500.00);
        Producto producto11 = new Producto("Guantes", 2500.00);
        Producto producto12 = new Producto("Anteojos", 10500.00);
        
        //Creamos 2 ordenes
        
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        Orden orden3 = new Orden();
        Orden orden4 = new Orden();
        
        //Agregamos productos a la primera orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        
        //Agregamos productos a la segunda orden
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        
         //Agregamos productos a la tercera orden
        orden3.agregarProducto(producto7);
        orden3.agregarProducto(producto8);
        orden3.agregarProducto(producto9);
        
        //Agregamos productos a la cuarta orden
        orden4.agregarProducto(producto10);
        orden4.agregarProducto(producto11);
        orden4.agregarProducto(producto12);
        
        // Mostramos la información de cada orden
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        orden3.mostrarOrden();
        orden4.mostrarOrden();
       
        
        //Tarea:
        //Crear mas objetos de tipo Producto = 10 --> HECHO!
        //Crear mas objetos de tipo Orden = 2 --> HECHO!
    }
    
}
