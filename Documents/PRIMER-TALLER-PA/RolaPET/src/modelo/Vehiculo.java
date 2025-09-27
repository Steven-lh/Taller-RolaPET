package modelo;

/** Clase base abstracta para los vehículos de los usuarios. */
public abstract class Vehiculo {

    protected String id;
    protected String marca;
    protected String modelo;

    /** Constructor que inicializa los datos principales del vehículo. */
    public Vehiculo(String id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters
    public String getId() { return id; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }

    // Setters
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
}
