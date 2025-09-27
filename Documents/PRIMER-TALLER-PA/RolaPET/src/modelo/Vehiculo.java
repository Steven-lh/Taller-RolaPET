package modelo;

/**
 * Clase abstracta para los vehículos de los usuarios.
 */
public abstract class Vehiculo {
    protected String id;
    protected String marca;
    protected String modelo;

    public Vehiculo(String id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getId() { return id; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }

    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
}
