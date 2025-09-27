package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase base para todos los proveedores (servicios o insumos).
 */
public abstract class Proveedor extends Persona {
    protected String direccion;
    protected List<Item> items;
    protected List<Evento> eventos;

    public Proveedor(String id, String nombre, String email, String password, String direccion) {
        super(id, nombre, email, password);
        this.direccion = direccion;
        this.items = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    public void agregarItem(Item item) { 
    	items.add(item); 
    }
    public void eliminarItem(Item item) { 
    	items.remove(item); 
    }

    public void publicarEvento(Evento e) { 
    	eventos.add(e); 
    }

    public List<Item> getItems() { 
    	return items; 
    }
    public List<Evento> getEventos() { 
    	return eventos; 
    }

    public String getDireccion() { 
    	return direccion; 
    }
    public void setDireccion(String direccion) { 
    	this.direccion = direccion; 
    }
}
