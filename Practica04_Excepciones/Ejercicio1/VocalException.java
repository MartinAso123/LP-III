public class VocalException extends Exception {
    public VocalException(char caracter) {
        super("Se ingreso una vocal: " + caracter);
    }
}
