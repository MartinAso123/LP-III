import java.util.ArrayList;

public class Curso {

    // Constante
    public static final int MAX_ESTUDIANTES = 30;

    // Variables de instancia
    private String codigo;
    private String nombre;
    private int creditos;

    // Agregación
    private Profesor profesor;

    // Relación con Categoría
    private Categoria categoria;

    // Lista de estudiantes
    private ArrayList<Estudiante> estudiantes;

    // Constructor
    public Curso(String codigo, String nombre, int creditos,
                 Profesor profesor, Categoria categoria) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
        this.categoria = categoria;

        estudiantes = new ArrayList<>();
    }

    // Método para matricular estudiante
    public void matricularEstudiante(Estudiante estudiante) {

        if (estudiantes.size() < MAX_ESTUDIANTES) {

            estudiantes.add(estudiante);

            System.out.println(
                estudiante.getNombre() +
                " se matriculó en " + nombre
            );

        } else {

            System.out.println("El curso está lleno.");
        }
    }

    // Cantidad de estudiantes matriculados
    public int cantidadEstudiantes() {
        return estudiantes.size();
    }

    // Verificar disponibilidad
    public boolean estaDisponible() {
        return estudiantes.size() < MAX_ESTUDIANTES;
    }

    // Mostrar información
    public void mostrarInformacion() {

        System.out.println("\n--- INFORMACIÓN DEL CURSO ---");
        System.out.println("Código: " + codigo);
        System.out.println("Curso: " + nombre);
        System.out.println("Créditos: " + creditos);
        System.out.println("Categoría: " + categoria.getNombre());
        System.out.println("Profesor: " + profesor.getNombre());
        System.out.println(
            "Estudiantes matriculados: " +
            estudiantes.size()
        );
        System.out.println(
            "Disponible: " +
            (estaDisponible() ? "Sí" : "No")
        );
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Getter del profesor
    public Profesor getProfesor() {
        return profesor;
    }

    // Getter de categoría
    public Categoria getCategoria() {
        return categoria;
    }
}