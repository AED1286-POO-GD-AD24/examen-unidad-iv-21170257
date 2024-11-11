package miPrincipal;

import clases.Carrito;

public class Principal {

    public static void main(String[] args) {
        // Crear productos
        ProductoElectronico laptop = new ProductoElectronico("Laptop", 1200.00);
        ProductoElectronico telefono = new ProductoElectronico("Telefono", 500.00);
        ProductoAlimenticio manzana = new ProductoAlimenticio("Manzana", 0.50);
        ProductoAlimenticio pan = new ProductoAlimenticio("Pan", 1.00);

        // Crear el carrito
        Carrito carrito = new Carrito();

        // Agregar productos al carrito
        carrito.agregarProducto(laptop);
        carrito.agregarProducto(telefono);
        carrito.agregarProducto(manzana);
        carrito.agregarProducto(pan);

        // Mostrar los productos del carrito
        carrito.mostrarProductos();

        // Calcular y mostrar el total
        double total = carrito.calcularTotal();
        System.out.println("Total del carrito: $" + total);
    }
}
