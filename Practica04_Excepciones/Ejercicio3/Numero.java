public class Numero {
    private double valor;

    public Numero(double valor) {
        setValor(valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        this.valor = valor;
    }

    public static void main(String[] args) {
        try {
            Numero numero = new Numero(20);
            System.out.println("Valor inicial: " + numero.getValor());

            numero.setValor(-5);
            System.out.println("Nuevo valor: " + numero.getValor());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
