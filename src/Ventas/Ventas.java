package Ventas;
import com.gm.ventas.*;

public class Ventas {
    public static void main(String[] args) {
        Producto producto = new Producto("Camisa",50);
        Producto producto1 = new Producto("Pantalon",100);
        Producto producto2 = new Producto("Saco",500);
        Producto producto3 = new Producto("Camisa",50);
        Producto producto4 = new Producto("Pantalon",100);
        Producto producto5 = new Producto("Saco",500);
        Producto producto8 = new Producto("Camisa",50);
        Producto producto6 = new Producto("Pantalon",100);
        Producto producto7 = new Producto("Saco",500);

        //objeto orden
        Orden orden = new Orden();
        orden.agregarProductos(producto);
        orden.agregarProductos(producto1);
        orden.agregarProductos(producto2);
        orden.agregarProductos(producto3);
        orden.agregarProductos(producto4);
        orden.agregarProductos(producto5);
        orden.agregarProductos(producto6);
        orden.agregarProductos(producto7);
        orden.agregarProductos(producto8);

        //imprimir orden
        orden.mostrarOrden();
    }
}
