package modelo;

/** Representa una moto eléctrica de baja potencia. */
public class MotoElectrica extends Vehiculo {

    private double capacidadBateria;

    /** Crea una moto eléctrica con la información básica. */
    public MotoElectrica(String id, String marca, String modelo, double capacidadBateria) {
        super(id, marca, modelo);
        this.capacidadBateria = capacidadBateria;
    }

    public double getCapacidadBateria() { return capacidadBateria; }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }
}
