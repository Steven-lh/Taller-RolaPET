package servicio;

import modelo.Evento;
import java.util.ArrayList;
import java.util.List;

/** Servicio para administrar la colección de eventos. */
public class GestorEventos {

    private final List<Evento> eventos = new ArrayList<>();

    /** Agrega un nuevo evento a la lista. */
    public void publicar(Evento evento) {
        eventos.add(evento);
    }

    /** Elimina un evento por su identificador. */
    public void eliminar(String id) {
        eventos.removeIf(e -> e.getId().equals(id));
    }

    /** Busca un evento por su identificador. */
    public Evento buscarPorId(String id) {
        return eventos.stream()
                      .filter(e -> e.getId().equals(id))
                      .findFirst()
                      .orElse(null);
    }

    /** Devuelve una lista con todos los eventos registrados. */
    public List<Evento> listar() {
        return new ArrayList<>(eventos);
    }
    
    /** Actualiza los datos de un evento existente. */
    public void actualizarEvento(Evento datos) {
        for (Evento e : eventos) {
            if (e.getId().equals(datos.getId())) {
                e.setTitulo(datos.getTitulo());
                e.setDescripcion(datos.getDescripcion());
                e.setFecha(datos.getFecha());
                break;
            }
        }
    }
}
