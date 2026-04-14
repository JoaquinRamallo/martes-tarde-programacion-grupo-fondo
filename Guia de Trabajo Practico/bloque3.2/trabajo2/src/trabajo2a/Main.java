package trabajo2a;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Fila del Cajero (FIFO) ===");

        Interface.ColATDA cola = new Implementacion.ColAEstatica();
        cola.InicializarCola();

        cola.Acolar(101);
        cola.Acolar(102);
        cola.Acolar(103);

        while (!cola.ColaVacia()) {
            System.out.println("Atendiendo cliente: " + cola.Primero());
            cola.Desacolar();
        }

        System.out.println("¿Cola vacía?: " + cola.ColaVacia());
    }
}