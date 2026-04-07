import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class FiltroSpam {
    public static void main(String[] args) {
        ConjuntoTDA blacklist = new ConjuntoEstatico();
        blacklist.InicializarConjunto();

        // Agrego palabras prohibidas (uso numeros que representan codigos de palabras)
        int CRYPTO = 1;
        int GANA = 2;
        int PREMIO = 3;

        blacklist.Agregar(CRYPTO);
        blacklist.Agregar(GANA);
        blacklist.Agregar(PREMIO);

        // Palabras del mail entrante
        int[] palabrasMail = {5, 1, 8, 10}; // El 1 es CRYPTO

        boolean esSpam = false;
        for (int i = 0; i < palabrasMail.length; i++) {
            if (blacklist.Pertenece(palabrasMail[i])) {
                esSpam = true;
                System.out.println("Palabra prohibida encontrada: " + palabrasMail[i]);
            }
        }

        if (esSpam) {
            System.out.println("El mail es SPAM.");
        } else {
            System.out.println("El mail es valido.");
        }
    }
}