abstract class Vehiculo {
    protected int velocidad;

    public Vehiculo() {
        velocidad = 0;
    }

    public abstract void acelerar();

    public int getVelocidad() {
        return velocidad;
    }
}

class Coche extends Vehiculo {
    @Override
    public void acelerar() {
        velocidad += 10;
        System.out.println("El coche acelera usando el motor.");
    }
}

class Bicicleta extends Vehiculo {
    @Override
    public void acelerar() {
        velocidad += 3;
        System.out.println("La bicicleta acelera pedaleando.");
    }
}

public class Main {
    // Este método funciona con cualquier subtipo de Vehiculo.
    public static void probarVehiculo(Vehiculo vehiculo) {
        vehiculo.acelerar();
        System.out.println("Velocidad: "
                + vehiculo.getVelocidad() + " km/h");
    }

    public static void main(String[] args) {
        probarVehiculo(new Coche());
        probarVehiculo(new Bicicleta());
    }
}
