package clases;

import miPrincipal.Producto;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos;

    // Constructor
    public Carrito() {
        productos = new ArrayList<>();
    }

    // Método para agregar productos al carrito
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para calcular el total del carrito
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    // Método para mostrar los productos del carrito
    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - Precio: $" + producto.getPrecio());
        }
    }
}
