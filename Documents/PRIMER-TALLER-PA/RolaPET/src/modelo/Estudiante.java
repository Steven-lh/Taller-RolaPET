package modelo;

public class Estudiante extends Persona {
    private int idEstudiante;

    public Estudiante(int id, String nombre, String apellido, String correo, String telefono,
                      int idEstudiante) {
        super(id, nombre, apellido, correo, telefono);
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String obtenerRol() {
        return "Estudiante";
    }

    public int obtenerIdEstudiante() {
        return idEstudiante;
    }
}
