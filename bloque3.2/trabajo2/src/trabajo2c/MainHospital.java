package trabajo2c;

public class MainHospital {
    public static void main(String[] args) {
        System.out.println("=== Corrección de Examen Final (Prioridad) ===");

        ColaPrioridadTDA cola = new ColaPrioridadEstatica();
        cola.InicializarColaPrioridad();

        cola.AcolarPrioridad(701, 1);
        cola.AcolarPrioridad(702, 3);
        cola.AcolarPrioridad(703, 2);

        // Se corrigen según prioridad
        while (!cola.ColaVacia()) {
            System.out.println("Corrigiendo examen: " + cola.Primero() +
                    " (prioridad " + cola.Prioridad() + ")");
            cola.Desacolar();
        }

        System.out.println("¿Cola vacía?: " + cola.ColaVacia());
    }
}
