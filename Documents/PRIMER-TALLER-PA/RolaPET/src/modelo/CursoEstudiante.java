package modelo;

import java.time.LocalDate;

public class CursoEstudiante {
    private int idCursoEstudiante;
    private int idCurso;
    private int idEstudiante;
    private LocalDate fechaInscripcion;
    private Double notaFinal;
    private boolean activo;

    public CursoEstudiante(int idCursoEstudiante, int idCurso, int idEstudiante,
                           LocalDate fechaInscripcion, Double notaFinal, boolean activo) {
        this.idCursoEstudiante = idCursoEstudiante;
        this.idCurso = idCurso;
        this.idEstudiante = idEstudiante;
        this.fechaInscripcion = fechaInscripcion;
        this.notaFinal = notaFinal;
        this.activo = activo;
    }

    public int obtenerIdCursoEstudiante() {
        return idCursoEstudiante;
    }

    public int obtenerIdCurso() {
        return idCurso;
    }

    public int obtenerIdEstudiante() {
        return idEstudiante;
    }

    public LocalDate obtenerFechaInscripcion() {
        return fechaInscripcion;
    }

    public Double obtenerNotaFinal() {
        return notaFinal;
    }

    public boolean estaActivo() {
        return activo;
    }
}
