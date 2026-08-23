public abstract class Persona {

    // Atributos de instancia
    protected String nombre;
    protected String dni;
    protected int edad;

    // Constructor
    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    // Método de instancia
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
    }

    // Método abstracto
    public abstract void mostrarRol();

    // Getter
    public String getNombre() {
        return nombre;
    }
}