package aplicacion;

import implementacion.DiccionarioSimpleEstatico;
import interfaces.DiccionarioSimpleTDA;


public class AgendaDeContactos {
    public static void main(String[] args) {

        DiccionarioSimpleTDA agenda = new DiccionarioSimpleEstatico();
        agenda.InicializarDiccionario();

        // Agregar contactos
        agenda.Agregar(1, 1111); // Juan → 1111
        agenda.Agregar(2, 2222); // Ana → 2222
        agenda.Agregar(3, 3333); // Luis → 3333

        // Actualizar teléfono de Ana
        agenda.Agregar(2, 9999);

        // Mostrar contactos (solo claves)
        System.out.println("Contactos en la agenda:");
        int[] claves = agenda.Claves();
        for (int i = 0; i < claves.length; i++) {
            System.out.println("Nombre(ID): " + claves[i]);
        }

        // Eliminar un contacto
        agenda.Eliminar(1);

        System.out.println("\nContactos luego de eliminar a Juan:");
        int[] claves2 = agenda.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println("Nombre(ID): " + claves2[i]);
        }
    }
}