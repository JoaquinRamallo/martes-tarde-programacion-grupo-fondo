import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class GestionLegajos {
    public static void main(String[] args) {
        ConjuntoTDA legajosUniversidad = new ConjuntoEstatico();
        legajosUniversidad.InicializarConjunto();

        int legajoJuan = 54321;

        // Juan se anota a Ingenieria en Informatica
        if (!legajosUniversidad.Pertenece(legajoJuan)) {
            legajosUniversidad.Agregar(legajoJuan);
            System.out.println("Juan anotado en Ing. Informatica con legajo: " + legajoJuan);
        }

        // Juan tambien quiere anotarse a Ing. en Sistemas
        // El sistema intenta agregarlo de nuevo
        if (legajosUniversidad.Pertenece(legajoJuan)) {
            System.out.println("El legajo " + legajoJuan + " ya existe en el sistema.");
            System.out.println("Se usa el mismo legajo para ambas carreras.");
        } else {
            legajosUniversidad.Agregar(legajoJuan);
        }

        // El conjunto solo tiene un elemento, no dos
    }
}