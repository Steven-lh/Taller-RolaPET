package modelo;

public class Materia {
    private int idMateria;
    private String nombre;

    public Materia(int idMateria, String nombre) {
        this.idMateria = idMateria;
        this.nombre = nombre;
    }

    public int obtenerId() {
        return idMateria;
    }

    public String obtenerNombre() {
        return nombre;
    }
}
