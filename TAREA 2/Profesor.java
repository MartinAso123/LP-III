public class Profesor extends Persona {

    // Variable de clase
    private static int cantidadProfesores = 0;

    // Variables de instancia
    private String codigoProfesor;
    private String especialidad;

    // Constructor
    public Profesor(String nombre, String dni, int edad,
                    String codigoProfesor, String especialidad) {

        super(nombre, dni, edad);

        this.codigoProfesor = codigoProfesor;
        this.especialidad = especialidad;

        cantidadProfesores++;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarRol() {
        System.out.println("Rol: Profesor");
    }

    // Método de instancia
    public void mostrarDatos() {
        mostrarInformacion();
        System.out.println("Código de profesor: " + codigoProfesor);
        System.out.println("Especialidad: " + especialidad);
    }

    // Método de clase
    public static int getCantidadProfesores() {
        return cantidadProfesores;
    }
}