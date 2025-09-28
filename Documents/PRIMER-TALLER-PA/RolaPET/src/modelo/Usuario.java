package modelo;

import java.util.ArrayList;
import java.util.List;

// Usuario normal de la aplicación que puede tener vehículos y amigos. 
public class Usuario extends Persona {

    private ArrayList<Vehiculo> vehiculos;
    private String numero_tel;
    private String id_rola;
    private String usuario;
    private String tipoVehiculo;
    private String marcaVehiculo;
    private String modeloVehiculo;
    private ArrayList<Usuario> amigos;
    private String tipoUsuario;

    // Constructor que inicializa los datos básicos del usuario.
    public Usuario(String id, String nombreCompleto, String email, String password, String numero_tel, String id_rola, String usuario, String tipoVehiculo, String marcaVehiculo, String modeloVehiculo, String tipoUsuario) {
        super(id, nombreCompleto, email, password);
        this.numero_tel = numero_tel;
        this.id_rola = id_rola;
        this.usuario = usuario;
        this.marcaVehiculo = marcaVehiculo;
        this.modeloVehiculo = modeloVehiculo;
        this.tipoVehiculo = tipoVehiculo;
        this.vehiculos = new ArrayList<>();
        this.amigos = new ArrayList<>();
        this.tipoUsuario = tipoUsuario;
    }

    // Agrega un vehículo a la lista del usuario.
    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    // Elimina un vehículo de la lista del usuario.
    public void eliminarVehiculo(Vehiculo v) {
        vehiculos.remove(v);
    }

    // Agrega un amigo si aún no está en la lista.
    public void agregarAmigo(Usuario u) {
        if (!amigos.contains(u)) {
            amigos.add(u);
        }
    }

    // Obtiene la lista de vehículos del usuario. 
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    // Obtiene la lista de amigos del usuario.
    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public String getNumero_tel() {
        return numero_tel;
    }

    public String getId_rola() {
        return id_rola;
    }
    
    public String getTipoUsuario() { 
        return tipoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public String getIdentificacion() {
        return id;
    }

    public String getNumeroTel() {
        return numero_tel;
    }

}
