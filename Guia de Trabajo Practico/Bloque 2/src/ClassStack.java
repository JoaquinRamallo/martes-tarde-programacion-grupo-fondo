public class ClassStack {
    public static void main(String[] args) {
        HistorialNavegacion stack = new HistorialNavegacion();
        stack.InicializarPila();


        // 1. Main() llama a CalcularPromedio()
        stack.Apilar("Main"); // Main
        stack.Apilar("Calcular promedio");

        // 2. CalcularPromedio() llama a Sumar()
        stack.Apilar("Sumar"); // Sumar

        // CONSIGNA: ¿Quién está en el Tope()?
        // Respuesta: Sumar() está en el Tope porque es la última función llamada
        // y la que se está ejecutando actualmente.
        System.out.println("Función en ejecución (Tope): " + stack.Tope());
    }
}
