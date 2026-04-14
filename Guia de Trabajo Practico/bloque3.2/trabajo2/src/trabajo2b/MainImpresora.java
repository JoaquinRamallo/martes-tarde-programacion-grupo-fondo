public class MainImpresora {
    public static void main(String[] args) {
        System.out.println("=== Cola de la Impresora (FIFO) ===");

        Interface.ColATDA cola = new Implementacion.ColAEstatica();
        cola.InicializarCola();

        // Simulamos documentos que llegan a la impresora
        cola.Acolar(201); // documento 201
        cola.Acolar(202); // documento 202
        cola.Acolar(203); // documento 203

        // Se imprimen en el mismo orden de llegada
        while (!cola.ColaVacia()) {
            System.out.println("Imprimiendo documento: " + cola.Primero());
            cola.Desacolar();
        }

        System.out.println("¿Cola vacía?: " + cola.ColaVacia());
    }
}
