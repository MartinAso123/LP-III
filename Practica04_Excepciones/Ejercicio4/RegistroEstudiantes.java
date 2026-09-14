import java.util.NoSuchElementException;

public class RegistroEstudiantes {
    private String[] estudiantes;
    private int cantidad;

    public RegistroEstudiantes(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que cero.");
        }
        estudiantes = new String[capacidad];
        cantidad = 0;
    }

    public void agregarEstudiante(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo ni vacio.");
        }

        if (cantidad == estudiantes.length) {
            throw new IllegalStateException("El arreglo de estudiantes esta lleno.");
        }

        estudiantes[cantidad] = nombre.trim();
        cantidad++;
    }

    public String buscarEstudiante(String nombre) {
        for (int i = 0; i < cantidad; i++) {
            if (estudiantes[i].equalsIgnoreCase(nombre)) {
                return estudiantes[i];
            }
        }

        throw new NoSuchElementException("El estudiante no se encuentra registrado.");
    }

    public static void main(String[] args) {
        RegistroEstudiantes registro = new RegistroEstudiantes(5);

        try {
            registro.agregarEstudiante("Ana");
            registro.agregarEstudiante("Luis");
            registro.agregarEstudiante("Maria");

            System.out.println("Encontrado: " + registro.buscarEstudiante("Luis"));
            System.out.println("Encontrado: " + registro.buscarEstudiante("Pedro"));
        } catch (IllegalArgumentException e) {
            System.out.println("Dato invalido: " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("Busqueda: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Registro: " + e.getMessage());
        }
    }
}
