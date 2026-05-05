import Implementacion.ColaDinamica;
import Implementacion.PilaDinamica;
import Interface.ColaTDA;
import Interface.PilaTDA;

public class Ejercicio1 {
    public static boolean esPalindromo(ColaTDA c){
        ColaTDA aux = new ColaDinamica();
        aux.InicializarCola();
        PilaTDA pila = new PilaDinamica();
        pila.InicializarPila();

        while (!c.ColaVacia()){
            int x = c.Primero();
            aux.Acolar(x);
            pila.Apilar(x);
            c.Desacolar();
        }

        boolean palindromo = true;
        ColaTDA restaurar = new ColaDinamica();
        restaurar.InicializarCola();

        while (!aux.ColaVacia()){
            int x = aux.Primero();
            int y = pila.Tope();
            if (x != y){
                palindromo = false;
            }
            aux.Desacolar();
            pila.Desapilar();
            restaurar.Acolar(x);
        }
        while (!restaurar.ColaVacia()){
            int x = restaurar.Primero();
            c.Acolar(x);
            restaurar.Desacolar();
        }
        return palindromo;
    }
}

