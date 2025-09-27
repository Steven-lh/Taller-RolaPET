package modelo;

/** Representa un scooter eléctrico. */
public class Scooter extends Vehiculo {

    private double autonomiaKm;

    /** Constructor que inicializa los datos del scooter. */
    public Scooter(String id, String marca, String modelo, double autonomiaKm) {
        super(id, marca, modelo);
        this.autonomiaKm = autonomiaKm;
    }

    public double getAutonomiaKm() { return autonomiaKm; }

    public void setAutonomiaKm(double autonomiaKm) { this.autonomiaKm = autonomiaKm; }
}
