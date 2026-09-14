public class NumeroException extends Exception {
    public NumeroException(char caracter) {
        super("Se ingreso un numero: " + caracter);
    }
}
