package servicio;

import modelo.Evento;
import java.util.ArrayList;
import java.util.List;

public class GestorEventos {

    private final List<Evento> eventos = new ArrayList<>();

    public void publicar(Evento evento) {
        eventos.add(evento);
    }

    public void eliminar(String id) {
        eventos.removeIf(e -> e.getId().equals(id));
    }

    public Evento buscarPorId(String id) {
        return eventos.stream()
                      .filter(e -> e.getId().equals(id))
                      .findFirst()
                      .orElse(null);
    }

    public List<Evento> listar() {
        return new ArrayList<>(eventos);
    }
    
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
