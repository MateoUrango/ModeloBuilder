public class App {
    public static void main(String[] args) {
        Director director = new Director();

        // 1. Construir un Coche Deportivo
        CocheBuilder cocheBuilder = new CocheBuilder();
        director.setBuilder(cocheBuilder);
        director.construirCocheDeportivo();
        Coche coche = cocheBuilder.getResultado();
        System.out.println("Coche construido: " + coche);

        // 2. Construir el Manual para ese mismo Coche Deportivo
        ManualBuilder manualBuilder = new ManualBuilder();
        director.setBuilder(manualBuilder); // ¡Cambiamos el builder!
        director.construirCocheDeportivo(); // Usamos los mismos pasos
        Manual manual = manualBuilder.getResultado();
        System.out.println("Manual construido: " + manual);
    }
}