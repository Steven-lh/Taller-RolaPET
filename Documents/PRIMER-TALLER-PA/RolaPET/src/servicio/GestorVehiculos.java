package servicio;

import modelo.Usuario;
import modelo.Vehiculo;
import java.util.List;

//Servicio para gestionar los vehículos asociados a cada usuario. 
public class GestorVehiculos {

    private final GestorUsuarios gestorUsuarios;

   //Recibe una instancia de GestorUsuarios para acceder a los usuarios.
    public GestorVehiculos(GestorUsuarios gestorUsuarios) {
        this.gestorUsuarios = gestorUsuarios;
    }

    //Agrega un vehículo a un usuario identificado por su id. */
    public void agregarVehiculo(String idUsuario, Vehiculo vehiculo) {
        Usuario u = gestorUsuarios.buscarPorId(idUsuario);
        if (u != null) {
            u.agregarVehiculo(vehiculo);
        }
    }

   //Elimina un vehículo de un usuario según su id y el id del vehículo
    public void eliminarVehiculo(String idUsuario, String idVehiculo) {
        Usuario u = gestorUsuarios.buscarPorId(idUsuario);
        if (u != null) {
            u.getVehiculos().removeIf(v -> v.getId().equals(idVehiculo));
        }
    }

    // Lista los vehículos de un usuario. 
    public List<Vehiculo> listarVehiculosUsuario(String idUsuario) {
        Usuario u = gestorUsuarios.buscarPorId(idUsuario);
        return (u != null) ? u.getVehiculos() : List.of();
    }
    
    // Actualiza los datos de un vehículo de un usuario. 
    public void actualizarVehiculo(String idUsuario, Vehiculo datos) {
        Usuario u = gestorUsuarios.buscarPorId(idUsuario);
        if (u != null) {
            for (Vehiculo v : u.getVehiculos()) {
                if (v.getId().equals(datos.getId())) {
                    v.setMarca(datos.getMarca());
                    v.setModelo(datos.getModelo());
                    break;
                }
            }
        }
    }
}