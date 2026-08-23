public class Main {

    public static void main(String[] args) {

        // Crear sistema
        SistemaGestion sistema = new SistemaGestion();

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante(
            "Juan Perez",
            "12345678",
            18,
            "2026001",
            "Ingeniería de Sistemas"
        );

        Estudiante estudiante2 = new Estudiante(
            "Maria Lopez",
            "87654321",
            19,
            "2026002",
            "Ingeniería de Sistemas"
        );

        // Crear profesor
        Profesor profesor1 = new Profesor(
            "Carlos Gomez",
            "45678912",
            40,
            "P001",
            "Programación"
        );

        // Crear categorías
        Categoria categoriaProgramacion = new Categoria(
            "Programación",
            "Cursos relacionados con desarrollo de software"
        );

        Categoria categoriaMatematica = new Categoria(
            "Matemáticas",
            "Cursos relacionados con matemáticas"
        );

        // Crear cursos
        Curso cursoJava = new Curso(
            "LP3",
            "Lenguajes de Programación III",
            4,
            profesor1,
            categoriaProgramacion
        );

        Curso cursoMatematica = new Curso(
            "MAT2",
            "Matemática II",
            4,
            profesor1,
            categoriaMatematica
        );

        // Agregar estudiantes al sistema
        sistema.agregarEstudiante(estudiante1);
        sistema.agregarEstudiante(estudiante2);

        // Agregar profesor
        sistema.agregarProfesor(profesor1);

        // Agregar cursos
        sistema.agregarCurso(cursoJava);
        sistema.agregarCurso(cursoMatematica);

        // Matricular estudiantes
        cursoJava.matricularEstudiante(estudiante1);
        cursoJava.matricularEstudiante(estudiante2);

        cursoMatematica.matricularEstudiante(estudiante1);

        // Mostrar datos del estudiante
        System.out.println("\n--- DATOS DEL ESTUDIANTE ---");
        estudiante1.mostrarDatos();

        // Mostrar datos del profesor
        System.out.println("\n--- DATOS DEL PROFESOR ---");
        profesor1.mostrarDatos();

        // Mostrar información de los cursos
        cursoJava.mostrarInformacion();
        cursoMatematica.mostrarInformacion();

        // Mostrar cursos disponibles
        sistema.mostrarCursosDisponibles();

        // Mostrar cantidad de estudiantes por curso
        sistema.mostrarCantidadEstudiantesPorCurso();

        // Mostrar variables de clase
        System.out.println(
            "\nCantidad total de estudiantes: " +
            Estudiante.getCantidadEstudiantes()
        );

        System.out.println(
            "Cantidad total de profesores: " +
            Profesor.getCantidadProfesores()
        );

        // POLIMORFISMO
        System.out.println("\n--- POLIMORFISMO ---");

        Persona persona1 = estudiante1;
        Persona persona2 = profesor1;

        persona1.mostrarRol();
        persona2.mostrarRol();

        // INTERFACE
        System.out.println("\n--- INTERFACE ---");

        estudiante1.inscribir();
    }
}