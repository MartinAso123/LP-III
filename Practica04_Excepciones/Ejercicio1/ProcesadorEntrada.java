import java.io.IOException;

public class ProcesadorEntrada {
    private LeerEntrada entrada;

    public ProcesadorEntrada() {
        entrada = new LeerEntrada(System.in);
    }

    public void procesar() throws IOException, VocalException, NumeroException,
            BlancoException, SalidaException {
        char caracter = entrada.getChar();

        // La guia no indica cual debe ser el caracter de salida.
        // En esta solucion se usa 'q' o 'Q'.
        if (caracter == 'q' || caracter == 'Q') {
            throw new SalidaException();
        }

        if ("aeiouAEIOU".indexOf(caracter) >= 0) {
            throw new VocalException(caracter);
        }

        if (Character.isDigit(caracter)) {
            throw new NumeroException(caracter);
        }

        if (Character.isWhitespace(caracter)) {
            throw new BlancoException();
        }

        System.out.println("Caracter normal: " + caracter);
    }

    public static void main(String[] args) {
        ProcesadorEntrada programa = new ProcesadorEntrada();
        boolean continuar = true;

        System.out.println("Ingrese caracteres uno por uno.");
        System.out.println("Use q para salir.");

        while (continuar) {
            try {
                programa.procesar();
            } catch (VocalException | NumeroException | BlancoException e) {
                System.out.println(e.getMessage());
            } catch (SalidaException e) {
                System.out.println(e.getMessage());
                continuar = false;
            } catch (IOException e) {
                System.out.println("Error de lectura: " + e.getMessage());
                continuar = false;
            }
        }
    }
}
