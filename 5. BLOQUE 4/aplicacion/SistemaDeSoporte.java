package aplicacion;

import implementacion.DiccionarioSimpleEstatico;
import interfaces.DiccionarioSimpleTDA;


public class SistemaDeSoporte {
    public static void main(String[] args) {

        DiccionarioSimpleTDA d = new DiccionarioSimpleEstatico();
        d.InicializarDiccionario();

        // Agregar órdenes y scripts
        d.Agregar(1001, 1); // orden 1001 → script 1
        d.Agregar(1002, 2); // orden 1002 → script 2
        d.Agregar(1003, 3); // orden 1003 → script 3

        // Actualizar script de una orden
        d.Agregar(1002, 5);

        // Mostrar órdenes
        System.out.println("Órdenes en el sistema:");
        int[] claves = d.Claves();
        for (int i = 0; i < claves.length; i++) {
            System.out.println("Orden ID: " + claves[i]);
        }

        // Eliminar una orden
        d.Eliminar(1001);

        System.out.println("\nÓrdenes luego de eliminar la orden 1001:");
        int[] claves2 = d.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println("Orden ID: " + claves2[i]);
        }
    }
}
