import Implementacion.ColaDinamica;

public class Main {
    public static void main(String[] args) {
        ColaDinamica cola = new ColaDinamica();
        cola.InicializarCola();
        cola.Acolar(1);
        cola.Acolar(2);
        cola.Acolar(3);
        cola.Acolar(2);
        cola.Acolar(1);

        System.out.println(Ejercicio1.esPalindromo(cola));
    }
}