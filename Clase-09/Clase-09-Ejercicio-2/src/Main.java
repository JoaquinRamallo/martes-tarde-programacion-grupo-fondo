import Implementacion.ColaPrioridadDinamica;

public class Main {
    public static void main(String[] args) {
        ColaPrioridadDinamica cp = new ColaPrioridadDinamica();
        cp.InicializarColaPrioridad();

        cp.AcolarPrioridad(10, 2);
        cp.AcolarPrioridad(20, 1);
        cp.AcolarPrioridad(30, 2);
        cp.AcolarPrioridad(40, 1);
        cp.AcolarPrioridad(50, 2);

        int cantidad = ContadorPrioridades.contarPrioridad1(cp);

        System.out.println("Cantidad de elementos con prioridad 1: " + cantidad);

        // Verificar que la cola quedó restaurada
        System.out.println("Elementos en la cola restaurada:");
        while (!cp.ColaVacia()) {
            System.out.println("Dato: " + cp.Primero() + " | Prioridad: " + cp.Prioridad());
            cp.Desacolar();
        }
    }
}
