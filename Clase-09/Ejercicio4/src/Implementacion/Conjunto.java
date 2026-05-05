package Implementacion;
import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class Conjunto{

    public static ConjuntoTDA diferenciaSimetrica(ConjuntoTDA A, ConjuntoTDA B) {

        ConjuntoTDA C = new ConjuntoEstatico();
        C.InicializarConjunto();

        ConjuntoTDA aux = new ConjuntoEstatico();
        aux.InicializarConjunto();

        ConjuntoTDA aux2 = new ConjuntoEstatico();
        aux2.InicializarConjunto();

        int x;

        // A - B
        while (!A.ConjuntoVacio()) {
            x = A.Elegir();
            A.Sacar(x);

            if (!B.Pertenece(x)) {
                C.Agregar(x);
            }

            aux.Agregar(x);
        }

        // B - A
        while (!B.ConjuntoVacio()) {
            x = B.Elegir();
            B.Sacar(x);

            if (!aux.Pertenece(x)) {
                C.Agregar(x);
            }

            aux2.Agregar(x);
        }

        // Restaurar A
        while (!aux.ConjuntoVacio()) {
            x = aux.Elegir();
            aux.Sacar(x);
            A.Agregar(x);
        }

        // Restaurar B
        while (!aux2.ConjuntoVacio()) {
            x = aux2.Elegir();
            aux2.Sacar(x);
            B.Agregar(x);
        }

        return C;
    }

    public static void mostrar(ConjuntoTDA C) {

        ConjuntoTDA aux = new ConjuntoEstatico();
        aux.InicializarConjunto();

        int x;

        while (!C.ConjuntoVacio()) {
            x = C.Elegir();
            System.out.print(x + " ");
            C.Sacar(x);
            aux.Agregar(x);
        }

        System.out.println();

        // Restaurar
        while (!aux.ConjuntoVacio()) {
            x = aux.Elegir();
            aux.Sacar(x);
            C.Agregar(x);
        }
    }
}
