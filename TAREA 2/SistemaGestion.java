import java.util.ArrayList;

public class SistemaGestion {

    // Listas del sistema
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;

    // Constructor
    public SistemaGestion() {

        estudiantes = new ArrayList<>();
        profesores = new ArrayList<>();
        cursos = new ArrayList<>();
    }

    // Agregar estudiante
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Agregar profesor
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    // Agregar curso
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    // Mostrar cursos disponibles
    public void mostrarCursosDisponibles() {

        System.out.println("\n--- CURSOS DISPONIBLES ---");

        for (Curso curso : cursos) {

            if (curso.estaDisponible()) {
                curso.mostrarInformacion();
            }
        }
    }

    // Mostrar cantidad de estudiantes por curso
    public void mostrarCantidadEstudiantesPorCurso() {

        System.out.println("\n--- CANTIDAD DE ESTUDIANTES ---");

        for (Curso curso : cursos) {

            System.out.println(
                "Curso: " + curso.getNombre() +
                " | Matriculados: " +
                curso.cantidadEstudiantes()
            );
        }
    }
}