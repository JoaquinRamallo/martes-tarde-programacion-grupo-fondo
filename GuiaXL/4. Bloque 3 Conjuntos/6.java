import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class ElegirVsSacar {
    public static void main(String[] args) {
        ConjuntoTDA c = new ConjuntoEstatico();
        c.InicializarConjunto();

        c.Agregar(10);
        c.Agregar(20);
        c.Agregar(30);

        // Llamo a Elegir dos veces sin llamar a Sacar
        int primero = c.Elegir();
        int segundo = c.Elegir();

        System.out.println("Primera llamada a Elegir: " + primero);
        System.out.println("Segunda llamada a Elegir: " + segundo);

        if (primero == segundo) {
            System.out.println("Devuelve el MISMO elemento ambas veces.");
        } else {
            System.out.println("Devuelve elementos DIFERENTES.");
        }

        // En esta implementacion, Elegir siempre devuelve datos[0]
        // Por eso devuelve el mismo elemento
    }
}