interface Imprimible {
    void imprimir(String documento);
}

interface Escaneable {
    void escanear();
}

// La impresora común solo implementa la función que necesita.
class Impresora implements Imprimible {
    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimiendo: " + documento);
    }
}

class ImpresoraMultifuncional implements Imprimible, Escaneable {
    @Override
    public void imprimir(String documento) {
        System.out.println("Multifuncional imprime: " + documento);
    }

    @Override
    public void escanear() {
        System.out.println("Multifuncional escanea el documento");
    }
}

public class Main {
    public static void main(String[] args) {
        Imprimible impresora = new Impresora();
        impresora.imprimir("Informe.pdf");

        ImpresoraMultifuncional multifuncional =
                new ImpresoraMultifuncional();
        multifuncional.imprimir("Contrato.pdf");
        multifuncional.escanear();
    }
}
