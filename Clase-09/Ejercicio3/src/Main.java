import Implementacion.pilaEstatica;
import Interface.PilaTDA;

public class Main {
    public static void main(String[] args) {
        pilaEstatica p = new pilaEstatica();
        p.InicializarPila();
        p.Apilar(1);
        p.Apilar(2);
        p.Apilar(50);
        p.Apilar(10);
        p.Apilar(2);

        System.out.println("Tiene repetidos? " + tieneRepetidos.repetidos(p));
    }
}