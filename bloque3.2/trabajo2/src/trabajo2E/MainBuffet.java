package trabajo2E;

import trabajo2E.ColaEstatica;

public class MainBuffet {
    public static void main(String[] args) {
        System.out.println("=== Buffet de la Facultad (FIFO) ===");

        ColaEstatica cola = new ColaEstatica();
        cola.InicializarCola();

        // Simulamos estudiantes llegando al buffet
        cola.Acolar(101); // estudiante 101
        cola.Acolar(102); // estudiante 102
        cola.Acolar(103); // estudiante 103

        // Se atienden en orden de llegada
        while (!cola.ColaVacia()) {
            System.out.println("Atendiendo estudiante: " + cola.Primero());
            cola.Desacolar();
        }

        System.out.println("¿Cola vacía?: " + cola.ColaVacia());
    }
}
