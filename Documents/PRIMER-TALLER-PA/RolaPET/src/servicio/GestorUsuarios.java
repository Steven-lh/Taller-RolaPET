package servicio;

import modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

public class GestorUsuarios {

    private final List<Usuario> usuarios = new ArrayList<>();

    public void registrar(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void eliminar(String id) {
        usuarios.removeIf(u -> u.getId().equals(id));
    }

    public Usuario buscarPorId(String id) {
        return usuarios.stream()
                       .filter(u -> u.getId().equals(id))
                       .findFirst()
                       .orElse(null);
    }

    public List<Usuario> listar() {
        return new ArrayList<>(usuarios);
    }
    
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
