package modelo;

import java.time.LocalDate;

/**
 * Evento o promoción publicado por un proveedor o administrador.
 */
public class Evento {
    private String id;
    private String titulo;
    private String descripcion;
    private LocalDate fecha;
    private int likes;

    public Evento(String id, String titulo, String descripcion, LocalDate fecha) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.likes = 0;
    }

    public void darLike() { likes++; }

    public String getId() { 
    	return id; 
    }
    public String getTitulo() { 
    	return titulo; 
    }
    public String getDescripcion() { 
    	return descripcion; 
    }
    public LocalDate getFecha() { 
    	return fecha; 
    }
    public int getLikes() { 
    	return likes; 
    }

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

}
