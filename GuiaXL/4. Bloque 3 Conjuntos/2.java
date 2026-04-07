import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class FiestaFinCursada {
    public static void main(String[] args) {
        ConjuntoTDA invitados = new ConjuntoEstatico();
        invitados.InicializarConjunto();

        invitados.Agregar(101); // Juan
        invitados.Agregar(102); // Maria
        invitados.Agregar(103); // Pedro

        System.out.println("Cantidad de invitados: 3");

        // Intento agregar a Juan de nuevo
        invitados.Agregar(101);

        // Recorro el conjunto para contar
        int contador = 0;
        ConjuntoTDA copia = new ConjuntoEstatico();
        copia.InicializarConjunto();

        while (!invitados.ConjuntoVacio()) {
            int elem = invitados.Elegir();
            invitados.Sacar(elem);
            copia.Agregar(elem);
            contador++;
        }

        System.out.println("Cantidad despues de agregar duplicado: " + contador);
        // El tamaño sigue siendo 3, no cambia porque el conjunto no permite duplicados
    }
}