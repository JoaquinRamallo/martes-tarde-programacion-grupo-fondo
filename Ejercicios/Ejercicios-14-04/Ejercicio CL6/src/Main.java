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

        System.out.println("Cola Dinamica");
        while (!colaDinamica.ColaVacia()){
            int elemento = colaDinamica.Primero();
            pilaDinamica.Apilar(elemento);
            System.out.println(elemento);
            colaDinamica.Desacolar();
        }


        PilaTDA pilaEstatica = new PilaDinamica();
        pilaEstatica.InicializarPila();

        System.out.println("Pila Dinamica");
        while (!pilaDinamica.PilaVacia()){
            int elemento = pilaDinamica.Tope();
            pilaEstatica.Apilar(elemento);
            System.out.println(elemento);
            pilaDinamica.Desapilar();
        }

        ColaTDA colaEstatica = new ColaEstatica();
        colaEstatica.InicializarCola();

        System.out.println("Pila Estatica");
        while (!pilaEstatica.PilaVacia()){
            int elemento = pilaEstatica.Tope();
            colaEstatica.Acolar(elemento);
            System.out.println(elemento);
            pilaEstatica.Desapilar();
        }

        System.out.println("Cola estatica");
        while (!colaEstatica.ColaVacia()){
            System.out.println(colaEstatica.Primero());
            colaEstatica.Desacolar();
        }
    }
}