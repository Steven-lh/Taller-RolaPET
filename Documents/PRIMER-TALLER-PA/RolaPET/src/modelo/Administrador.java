package modelo;

public class Administrador extends Persona {
    private int idAdministrador;

    public Administrador(int id, String nombre, String apellido, String correo, String telefono,
                         int idAdministrador) {
        super(id, nombre, apellido, correo, telefono);
        this.idAdministrador = idAdministrador;
    }

    @Override
    public String obtenerRol() {
        return "Administrador";
    }
}
