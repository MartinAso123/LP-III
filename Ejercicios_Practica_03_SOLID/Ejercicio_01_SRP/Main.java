class Empleado {
    private String nombre;
    private double salario;
    private String departamento;

    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }
}

// Esta clase tiene una sola responsabilidad: calcular el pago.
class CalculadoraPago {
    public double calcularPagoMensual(Empleado empleado) {
        return empleado.getSalario();
    }
}

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Ana", 2500, "Sistemas");
        CalculadoraPago calculadora = new CalculadoraPago();

        System.out.println("Empleado: " + empleado.getNombre());
        System.out.println("Departamento: " + empleado.getDepartamento());
        System.out.println("Pago mensual: S/ "
                + calculadora.calcularPagoMensual(empleado));
    }
}
