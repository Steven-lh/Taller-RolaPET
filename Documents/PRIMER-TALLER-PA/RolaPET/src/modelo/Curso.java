package modelo;

public class Curso {
    private int idCurso;
    private int idMateria;
    private int idProfesor;

    public Curso(int idCurso, int idMateria, int idProfesor) {
        this.idCurso = idCurso;
        this.idMateria = idMateria;
        this.idProfesor = idProfesor;
    }

    public int obtenerIdCurso() {
        return idCurso;
    }

    public int obtenerIdMateria() {
        return idMateria;
    }

    public int obtenerIdProfesor() {
        return idProfesor;
    }
}
