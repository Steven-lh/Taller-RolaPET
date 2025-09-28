package modelo;


// Modelo de un producto o servicio ofrecido por un proveedor.
 
public class Item {

    private String id;
    private String nombre;
    private String descripcion;
    private double precio;

    
     // Crea un nuevo ítem con los datos básicos.
     
    public Item(String id, String nombre, String descripcion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
