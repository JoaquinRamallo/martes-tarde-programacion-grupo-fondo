package aplicacion;

import implementacion.DiccionarioMultipleEstatico;
import interfaces.DiccionarioMultipleTDA;



public class TraductorDeIdiomas {
    public static void main(String[] args) {

        DiccionarioMultipleTDA d = new DiccionarioMultipleEstatico();
        d.InicializarDiccionario();

        // Agregar significados
        d.Agregar(1, 10); // Bank → Banco
        d.Agregar(1, 20); // Bank → Orilla

        d.Agregar(2, 30); // Run → Correr
        d.Agregar(2, 40); // Run → Ejecutar

        d.Agregar(1, 10); // no se repite

        // Mostrar palabras
        System.out.println("Palabras en el diccionario:");
        int[] claves1 = d.Claves();
        for (int i = 0; i < claves1.length; i++) {
            System.out.println("Palabra(ID): " + claves1[i]);
        }

        // Mostrar significados de "Bank"
        System.out.println("\nSignificados de la palabra 1 (Bank):");
        int[] valores1 = d.Recuperar(1);
        for (int i = 0; i < valores1.length; i++) {
            System.out.println(valores1[i]);
        }

        // Eliminar un significado
        d.EliminarValor(1, 20);

        System.out.println("\nSignificados de Bank luego de eliminar uno:");
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
    