package aplicacion;

import implementacion.DiccionarioSimpleEstatico;
import interfaces.DiccionarioSimpleTDA;

public class SistemaDNS {
    public static void main(String[] args) {

        DiccionarioSimpleTDA d = new DiccionarioSimpleEstatico();
        d.InicializarDiccionario();

        // Agregar dominios e IPs
        d.Agregar(1, 142250190); // google.com → IP
        d.Agregar(2, 1511011);   // facebook.com → IP
        d.Agregar(3, 1722170);   // youtube.com → IP

        // Actualizar IP de un dominio
        d.Agregar(2, 9999999);

        // Mostrar dominios
        System.out.println("Dominios en el sistema:");
        int[] claves = d.Claves();
        for (int i = 0; i < claves.length; i++) {
            System.out.println("Dominio(ID): " + claves[i]);
        }

        // Eliminar un dominio
        d.Eliminar(1);

        System.out.println("\nDominios luego de eliminar google.com:");
        int[] claves2 = d.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println("Dominio(ID): " + claves2[i]);
        }
    }
}