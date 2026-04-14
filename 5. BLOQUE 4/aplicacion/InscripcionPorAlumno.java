package aplicacion;

import implementacion.DiccionarioMultipleEstatico;
import interfaces.DiccionarioMultipleTDA;



public class InscripcionPorAlumno {
    public static void main(String[] args) {

        DiccionarioMultipleTDA d = new DiccionarioMultipleEstatico();
        d.InicializarDiccionario();

        // Agregar materias por legajo
        d.Agregar(100, 1); // legajo 100 → Programación
        d.Agregar(100, 2); // legajo 100 → Matemática
        d.Agregar(100, 3); // legajo 100 → Base de Datos

        d.Agregar(200, 2); // legajo 200 → Matemática
        d.Agregar(200, 4); // legajo 200 → Inglés

        d.Agregar(100, 1); // no se repite

        // Mostrar legajos
        System.out.println("Legajos en el sistema:");
        int[] claves1 = d.Claves();
        for (int i = 0; i < claves1.length; i++) {
            System.out.println("Legajo: " + claves1[i]);
        }

        // Mostrar materias de un alumno
        System.out.println("\nMaterias del legajo 100:");
        int[] materias = d.Recuperar(100);
        for (int i = 0; i < materias.length; i++) {
            System.out.println(materias[i]);
        }

        // Eliminar una materia
        d.EliminarValor(100, 2);

        System.out.println("\nMaterias del legajo 100 luego de eliminar una:");
        int[] materias2 = d.Recuperar(100);
        for (int i = 0; i < materias2.length; i++) {
            System.out.println(materias2[i]);
        }

        // Eliminar alumno completo
        d.Eliminar(200);

        System.out.println("\nLegajos luego de eliminar el 200:");
        int[] claves2 = d.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println(claves2[i]);
        }
    }
}