package aplicacion;

import implementacion.DiccionarioMultipleEstatico;
import interfaces.DiccionarioMultipleTDA;


public class IndiceDeLibro {
    public static void main(String[] args) {

        DiccionarioMultipleTDA d = new DiccionarioMultipleEstatico();
        d.InicializarDiccionario();

        // Agregar páginas donde aparece la palabra
        d.Agregar(1, 12); // Recursión → pág 12
        d.Agregar(1, 45); // Recursión → pág 45
        d.Agregar(1, 88); // Recursión → pág 88

        d.Agregar(2, 5);  // Algoritmo → pág 5
        d.Agregar(2, 30); // Algoritmo → pág 30

        d.Agregar(1, 12); // no se repite

        // Mostrar palabras (claves)
        System.out.println("Palabras en el índice:");
        int[] claves1 = d.Claves();
        for (int i = 0; i < claves1.length; i++) {
            System.out.println("Palabra(ID): " + claves1[i]);
        }

        // Mostrar páginas de "Recursión"
        System.out.println("\nPáginas de la palabra 1 (Recursión):");
        int[] paginas = d.Recuperar(1);
        for (int i = 0; i < paginas.length; i++) {
            System.out.println(paginas[i]);
        }

        // Eliminar una página
        d.EliminarValor(1, 45);

        System.out.println("\nPáginas de Recursión luego de eliminar una:");
        int[] paginas2 = d.Recuperar(1);
        for (int i = 0; i < paginas2.length; i++) {
            System.out.println(paginas2[i]);
        }

        // Eliminar palabra completa
        d.Eliminar(2);

        System.out.println("\nPalabras luego de eliminar la palabra 2:");
        int[] claves2 = d.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println(claves2[i]);
        }
    }
}
