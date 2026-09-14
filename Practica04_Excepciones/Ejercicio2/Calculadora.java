public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new DivisionPorCeroException("No se puede dividir entre cero.");
        }
        return a / b;
    }

    public double calcular(String operacion, double a, double b) {
        switch (operacion.toLowerCase()) {
            case "suma":
                return sumar(a, b);
            case "resta":
                return restar(a, b);
            case "multiplicacion":
                return multiplicar(a, b);
            case "division":
                return dividir(a, b);
            default:
                throw new IllegalArgumentException("Operacion no valida: " + operacion);
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        try {
            System.out.println("Suma: " + calculadora.calcular("suma", 10, 5));
            System.out.println("Division: " + calculadora.calcular("division", 10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Dato incorrecto: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error aritmetico: " + e.getMessage());
        }
    }
}
