public class Estudiante extends Persona implements Inscribible {

    // Constante
    public static final int MAX_CURSOS = 6;

    // Variable de clase
    private static int cantidadEstudiantes = 0;

    // Variables de instancia
    private String codigo;
    private String carrera;

    // Constructor
    public Estudiante(String nombre, String dni, int edad,
                      String codigo, String carrera) {

        super(nombre, dni, edad);

        this.codigo = codigo;
        this.carrera = carrera;

        cantidadEstudiantes++;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarRol() {
        System.out.println("Rol: Estudiante");
    }

    // Implementación de la interfaz
    @Override
    public void inscribir() {
        System.out.println(nombre + " está realizando una inscripción.");
    }

    // Método de instancia
    public void mostrarDatos() {
        mostrarInformacion();
        System.out.println("Código: " + codigo);
        System.out.println("Carrera: " + carrera);
    }

    // Método de clase
    public static int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }
}