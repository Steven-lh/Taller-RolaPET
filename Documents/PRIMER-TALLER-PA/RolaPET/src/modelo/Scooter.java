package modelo;

/**
 * Vehículo tipo Scooter eléctrico.
 */
public class Scooter extends Vehiculo {
    private double autonomiaKm;

    public Scooter(String id, String marca, String modelo, double autonomiaKm) {
        super(id, marca, modelo);
        this.autonomiaKm = autonomiaKm;
    }

    public double getAutonomiaKm() { return autonomiaKm; }
    public void setAutonomiaKm(double autonomiaKm) { this.autonomiaKm = autonomiaKm; }
}
