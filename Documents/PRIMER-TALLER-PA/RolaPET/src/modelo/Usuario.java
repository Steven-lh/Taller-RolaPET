package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a un usuario normal de la aplicación.
 * Puede tener varios vehículos y amigos.
 */
public class Usuario extends Persona {
    private List<Vehiculo> vehiculos;
    private List<Usuario> amigos;

    public Usuario(String id, String nombre, String email, String password) {
        super(id, nombre, email, password);
        this.vehiculos = new ArrayList<>();
        this.amigos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public void eliminarVehiculo(Vehiculo v) {
        vehiculos.remove(v);
    }

    public void agregarAmigo(Usuario u) {
        if (!amigos.contains(u)) {
            amigos.add(u);
        }
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }
}
