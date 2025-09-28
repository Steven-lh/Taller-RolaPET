package modelo;

import java.util.ArrayList;
import java.util.List;

public class ModeloDatos {
    private static ModeloDatos instancia;
    private List<Usuario> solicitudesDeRegistro;
    private List<Usuario> usuariosRegistrados;

    // El constructor es privado para que no se puedan crear nuevas instancias
    private ModeloDatos() {
        solicitudesDeRegistro = new ArrayList<>();
        this.usuariosRegistrados = new ArrayList<>();
    }
    
    public void aceptarSolicitud(Usuario usuario) {
        if (solicitudesDeRegistro.contains(usuario)) {
            solicitudesDeRegistro.remove(usuario);
            usuariosRegistrados.add(usuario);
        }
    }

    public void rechazarSolicitud(Usuario usuario) {
        if (solicitudesDeRegistro.contains(usuario)) {
            solicitudesDeRegistro.remove(usuario);
        }
    }
    
    public Usuario validarLoginUsuario(String username, String password) {
        for (Usuario u : usuariosRegistrados) {
            if (u.getUsuario().equals(username) && u.getPassword().equals(password)) {
                return u; 
            }
        }
        return null;
    }
    
    public static synchronized ModeloDatos getInstance() {
        if (instancia == null) {
            instancia = new ModeloDatos();
        }
        return instancia;
    }

    public void agregarSolicitudDeRegistro(Usuario usuario) {
        this.solicitudesDeRegistro.add(usuario);
    }

    public List<Usuario> getSolicitudesDeRegistro() {
        return solicitudesDeRegistro;
    }

    public List<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }
}