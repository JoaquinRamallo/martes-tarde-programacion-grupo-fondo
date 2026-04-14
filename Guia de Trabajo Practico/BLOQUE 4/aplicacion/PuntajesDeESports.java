package aplicacion;

import implementacion.DiccionarioSimpleEstatico;
import interfaces.DiccionarioSimpleTDA;


public class PuntajesDeESports {
    public static void main(String[] args) {

        DiccionarioSimpleTDA d = new DiccionarioSimpleEstatico();
        d.InicializarDiccionario();

        // Agregar jugadores y puntajes
        d.Agregar(1, 1500); // jugador 1 → puntaje 1500
        d.Agregar(2, 2300); // jugador 2 → puntaje 2300
        d.Agregar(3, 1800); // jugador 3 → puntaje 1800

        // Actualizar puntaje máximo del jugador 2
        d.Agregar(2, 3000);

        // Mostrar jugadores (claves)
        System.out.println("Jugadores en el sistema:");
        int[] claves = d.Claves();
        for (int i = 0; i < claves.length; i++) {
            System.out.println("Jugador(ID): " + claves[i]);
        }

        // Eliminar un jugador
        d.Eliminar(1);

        System.out.println("\nJugadores luego de eliminar al jugador 1:");
        int[] claves2 = d.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println("Jugador(ID): " + claves2[i]);
        }
    }
}