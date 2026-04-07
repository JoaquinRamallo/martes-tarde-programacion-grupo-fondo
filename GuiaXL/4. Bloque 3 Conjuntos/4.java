import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class TagsBlog {
    public static void main(String[] args) {
        ConjuntoTDA tags = new ConjuntoEstatico();
        tags.InicializarConjunto();

        int PROGRAMACION = 1;
        int JAVA = 2;
        int OOP = 3;

        tags.Agregar(PROGRAMACION);
        tags.Agregar(JAVA);
        tags.Agregar(OOP);

        // Intento agregar JAVA de nuevo
        tags.Agregar(JAVA);

        // El conjunto sigue teniendo solo 3 tags, no 4
        // Con una Pila, tendria JAVA repetido

        System.out.println("Tags del post:");
        while (!tags.ConjuntoVacio()) {
            int tag = tags.Elegir();
            System.out.println("Tag: " + tag);
            tags.Sacar(tag);
        }
    }
}