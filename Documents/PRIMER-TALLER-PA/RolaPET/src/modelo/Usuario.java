package modelo;

import java.util.ArrayList;
import java.util.List;

/** Usuario normal de la aplicación que puede tener vehículos y amigos. */
public class Usuario extends Persona {

    private List<Vehiculo> vehiculos;
    private List<Usuario> amigos;

    /** Constructor que inicializa los datos básicos del usuario. */
    public Usuario(String id, String nombre, String email, String password) {
        super(id, nombre, email, password);
        this.vehiculos = new ArrayList<>();
        this.amigos = new ArrayList<>();
    }

    /** Agrega un vehículo a la lista del usuario. */
    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    /** Elimina un vehículo de la lista del usuario. */
    public void eliminarVehiculo(Vehiculo v) {
        vehiculos.remove(v);
    }

    /** Agrega un amigo si aún no está en la lista. */
    public void agregarAmigo(Usuario u) {
        if (!amigos.contains(u)) {
            amigos.add(u);
        }
    }

    /** Obtiene la lista de vehículos del usuario. */
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /** Obtiene la lista de amigos del usuario. */
    public List<Usuario> getAmigos() {
        return amigos;
    }
}
