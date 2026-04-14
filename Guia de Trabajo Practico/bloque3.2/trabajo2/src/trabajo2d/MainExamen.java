package trabajo2d;

public class MainExamen {
    public static void main(String[] args) {
        System.out.println("=== Corrección de Examen Final (Prioridad) ===");

        ColaPrioridadExamenTDA cola = new ColaPrioridadExamenEstatica();
        cola.InicializarColaPrioridad();

        // Simulamos exámenes con distinta urgencia
        cola.AcolarPrioridad(10,1); // examen común
        cola.AcolarPrioridad(20,3); // examen urgente
        cola.AcolarPrioridad(50,2); // examen intermedio

        // Se corrigen según prioridad
        while (!cola.ColaVacia()) {
            System.out.println("Corrigiendo examen: " + cola.Primero() +
                    " (prioridad " + cola.Prioridad() + ")");
            cola.Desacolar();
        }

        System.out.println("¿Cola vacía?: " + cola.ColaVacia());
    }
}