public class Categoria {

    // Variables de instancia
    private String nombre;
    private String descripcion;

    // Constructor
    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Método de instancia
    public void mostrarCategoria() {
        System.out.println("Categoría: " + nombre);
        System.out.println("Descripción: " + descripcion);
    }
}