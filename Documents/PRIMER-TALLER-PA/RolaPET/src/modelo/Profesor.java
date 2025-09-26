package modelo;

import java.util.List;

public class Profesor extends Persona {
    private int idProfesor;
    private List<Materia> materias;

    public Profesor(int id, String nombre, String apellido, String correo, String telefono,
                    int idProfesor, List<Materia> materias) {
        super(id, nombre, apellido, correo, telefono);
        this.idProfesor = idProfesor;
        this.materias = materias;
    }

    @Override
    public String obtenerRol() {
        return "Profesor";
    }

    public List<Materia> obtenerMaterias() {
        return materias;
    }

    public Materia buscarMateriaPorId(int idMateria) {
        return materias.stream()
                       .filter(m -> m.obtenerId() == idMateria)
                       .findFirst()
                       .orElse(null);
    }
}
