import Interfaces.ColaTDA;
import Interfaces.PilaTDA;
import Implementacion.*;

public class Main {
    public static void main(String[] args) {
        ColaTDA colaDinamica = new ColaDinamica();
        colaDinamica.InicializarCola();
        colaDinamica.Acolar(1);
        colaDinamica.Acolar(2);
        colaDinamica.Acolar(3);
        colaDinamica.Acolar(4);
        colaDinamica.Acolar(5);

        PilaTDA pilaDinamica = new PilaDinamica();
        pilaDinamica.InicializarPila();
        System.out.println("Cola dinamica: ");
        while (!colaDinamica.ColaVacia()) {
            int dato = colaDinamica.Primero();
            colaDinamica.Desacolar();
            System.out.println(dato);
            pilaDinamica.Apilar(dato);
        }
        System.out.println("Pila dinamica: ");
        PilaTDA pilaEstatica = new PilaEstatica();
        pilaEstatica.InicializarPila();
        while (!pilaDinamica.PilaVacia()) {
            int dato = pilaDinamica.Tope();
            pilaDinamica.Desapilar();
            System.out.println(dato);
            pilaEstatica.Apilar(dato);
        }
        System.out.println("Pila estatica ");
        ColaTDA colaEstatica = new ColaEstatica();
        colaEstatica.InicializarCola();
        while (!pilaEstatica.PilaVacia()) {
            int dato = pilaEstatica.Tope();
            pilaEstatica.Desapilar();
            System.out.println(dato);
            colaEstatica.Acolar(dato);
        }
        System.out.println("Cola final: ");
        while (!colaEstatica.ColaVacia()) {
            System.out.println(colaEstatica.Primero());
            colaEstatica.Desacolar();
        }

    }
}