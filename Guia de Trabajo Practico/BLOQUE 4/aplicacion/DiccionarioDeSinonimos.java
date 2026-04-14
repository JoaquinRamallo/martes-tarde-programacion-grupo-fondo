package aplicacion;

import implementacion.DiccionarioMultipleEstatico;
import interfaces.DiccionarioMultipleTDA;



public class DiccionarioDeSinonimos {
    public static void main(String[] args) {

        DiccionarioMultipleTDA d = new DiccionarioMultipleEstatico();
        d.InicializarDiccionario();

        // Agregar sinónimos
        d.Agregar(1, 10); // rápido → veloz
        d.Agregar(1, 20); // rápido → ágil
        d.Agregar(1, 30); // rápido → ligero

        d.Agregar(2, 40); // grande → enorme
        d.Agregar(2, 50); // grande → amplio

        d.Agregar(1, 10); // no se repite

        // Mostrar claves (palabras)
        System.out.println("Palabras en el diccionario:");
        int[] claves1 = d.Claves();
        for (int i = 0; i < claves1.length; i++) {
            System.out.println("Palabra(ID): " + claves1[i]);
        }

        // Mostrar sinónimos de "rápido"
        System.out.println("\nSinónimos de la palabra 1:");
        int[] valores1 = d.Recuperar(1);
        for (int i = 0; i < valores1.length; i++) {
            System.out.println(valores1[i]);
        }

        // Eliminar un sinónimo
        d.EliminarValor(1, 20);

        System.out.println("\nSinónimos de la palabra 1 luego de eliminar uno:");
        int[] valores1b = d.Recuperar(1);
        for (int i = 0; i < valores1b.length; i++) {
            System.out.println(valores1b[i]);
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