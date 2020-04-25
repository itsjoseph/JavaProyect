package Ventas;
import com.gm.ventas.*;

public class Ventas {
    public static void main(String[] args) {
        Producto producto = new Producto("Camisa",50);
        Producto producto1 = new Producto("Pantalon",100);


        //objeto orden
        Orden orden = new Orden();
        orden.agregarProductos(producto);
        orden.agregarProductos(producto1);

        //imprimir orden
        orden.mostrarOrden();
    }
}
