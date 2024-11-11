package clases;

public class ProductoAlimenticio extends Producto 
{

    public ProductoAlimenticio(String nombre, double precio) 
    {
        super(nombre, precio);
    }

    @Override
    public String getNombre() 
    {
        return super.nombre;  
    }

    @Override
    public double getPrecio() 
    {
        return super.precio;  
    }
}
