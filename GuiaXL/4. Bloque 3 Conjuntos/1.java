import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class PadronElectoral {
    public static void main(String[] args) {
        ConjuntoTDA votantes = new ConjuntoEstatico();
        votantes.InicializarConjunto();

        int legajoAlumno = 12345;

        // Antes de votar, verifico si ya voto
        if (votantes.Pertenece(legajoAlumno)) {
            System.out.println("Error: Este alumno ya voto. No puede votar dos veces.");
        } else {
            // Si no voto, lo registro y le permito votar
            votantes.Agregar(legajoAlumno);
            System.out.println("Voto registrado correctamente.");
        }

        // Intento de voto duplicado
        if (votantes.Pertenece(legajoAlumno)) {
            System.out.println("Error: Este alumno ya voto. No puede votar dos veces.");
        } else {
            votantes.Agregar(legajoAlumno);
            System.out.println("Voto registrado correctamente.");
        }
    }
}