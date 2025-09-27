package servicio;

import modelo.Usuario;
import modelo.Vehiculo;
import java.util.List;

public class GestorVehiculos {

    private final GestorUsuarios gestorUsuarios;

    public GestorVehiculos(GestorUsuarios gestorUsuarios) {
        this.gestorUsuarios = gestorUsuarios;
    }

    public void agregarVehiculo(String idUsuario, Vehiculo vehiculo) {
        Usuario u = gestorUsuarios.buscarPorId(idUsuario);
        if (u != null) {
            u.agregarVehiculo(vehiculo);
        }
    }

    public void eliminarVehiculo(String idUsuario, String idVehiculo) {
        Usuario u = gestorUsuarios.buscarPorId(idUsuario);
        if (u != null) {
            u.getVehiculos().removeIf(v -> v.getId().equals(idVehiculo));
        }
    }

    public List<Vehiculo> listarVehiculosUsuario(String idUsuario) {
        Usuario u = gestorUsuarios.buscarPorId(idUsuario);
        return (u != null) ? u.getVehiculos() : List.of();
    }
    
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
