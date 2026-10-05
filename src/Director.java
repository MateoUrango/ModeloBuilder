public class Director {
    private Builder builder;

    public Director() {
    }

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    // Define el orden para un coche deportivo
    public void construirCocheDeportivo() {
        builder.reset();
        builder.construirMotor("V8 Biturbo");
        builder.construirAsientos(2);
        builder.construirGPS(true);
        builder.construirComputadoraViaje(true);
    }

    // Define el orden para un coche familiar (SUV)
    public void construirSUV() {
        builder.reset();
        builder.construirMotor("V6 Híbrido");
        builder.construirAsientos(7);
        builder.construirGPS(true);
        builder.construirComputadoraViaje(false);
    }
}