package modelo;

public abstract class Persona {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String telefono;

    public Persona(int id, String nombre, String apellido, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public abstract String obtenerRol();

}
