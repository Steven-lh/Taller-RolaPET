package modelo;

/**
 * Vehículo tipo Moto Eléctrica de baja potencia.
 */
public class MotoElectrica extends Vehiculo {
    private double capacidadBateria;

    public MotoElectrica(String id, String marca, String modelo, double capacidadBateria) {
        super(id, marca, modelo);
        this.capacidadBateria = capacidadBateria;
    }

    public double getCapacidadBateria() { return capacidadBateria; }
    public void setCapacidadBateria(double capacidadBateria) { this.capacidadBateria = capacidadBateria; }
}
