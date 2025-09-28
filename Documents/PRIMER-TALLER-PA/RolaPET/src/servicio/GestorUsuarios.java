package servicio;

import modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

// Servicio para gestionar el registro y administración de usuarios.
public class GestorUsuarios {

    private final List<Usuario> usuarios = new ArrayList<>();

    /** Registra un nuevo usuario. */
    public void registrar(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Elimina un usuario según su identificador. 
    public void eliminar(String id) {
        usuarios.removeIf(u -> u.getId().equals(id));
    }

    //Busca un usuario por su identificador. 
    public Usuario buscarPorId(String id) {
        return usuarios.stream()
                       .filter(u -> u.getId().equals(id))
                       .findFirst()
                       .orElse(null);
    }

    // Devuelve una lista con todos los usuarios registrados
    public List<Usuario> listar() {
        return new ArrayList<>(usuarios);
    }
    
    // Actualiza los datos de un usuario existente.
    public void actualizarUsuario(Usuario datos) {
        for (Usuario u : usuarios) {
            if (u.getId().equals(datos.getId())) {
                u.setNombre(datos.getNombre());
                u.setEmail(datos.getEmail());
                u.setPassword(datos.getPassword());
                break;
            }
        }
    }
}
