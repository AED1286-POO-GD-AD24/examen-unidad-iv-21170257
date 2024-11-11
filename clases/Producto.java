package clases;

public abstract class Producto 
{
    public String nombre;
    public double precio;

    // Constructor
    public Producto(String nombre, double precio)
     {
        this.nombre = nombre;
        this.precio = precio;
    }

   
    public abstract String getNombre();
    public abstract double getPrecio();
}

