package modelo;

import java.time.LocalDate;

/** Modelo básico de un evento o promoción. */
public class Evento {

    private String id;
    private String titulo;
    private String descripcion;
    private LocalDate fecha;
    private int likes;

    /** Crea un nuevo evento. */
    public Evento(String id, String titulo, String descripcion, LocalDate fecha) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.likes = 0;
    }

    /** Incrementa el contador de likes. */
    public void darLike() { likes++; }

    // Getters
    public String getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescripcion() { return descripcion; }
    public LocalDate getFecha() { return fecha; }
    public int getLikes() { return likes; }

    // Setters
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
}
