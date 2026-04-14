import Interface.PilaTDA;

public class Main {
    public static void main(String[] args) {
        // Ejercicio Historial Navegación
        PilaTDA historial = new HistorialNavegacion();
        historial.InicializarPila();

        historial.Apilar("fi.uba.ar");
        System.out.println("Visitando fi.uba.ar");

        historial.Apilar("campus.utn.edu.ar");
        System.out.println("Visitando campus.utn.edu.ar");

        historial.Apilar("stackoverflow.com");
        System.out.println("Visitando stackoverflow.com");

        // Botón Atrás
        historial.Desapilar();
        System.out.println("Atrás → Página actual: " + historial.Tope());

        historial.Desapilar();
        System.out.println("Atrás → Página actual: " + historial.Tope());

        historial.Desapilar();
        if (historial.PilaVacia()) {
            System.out.println("¿Historial vacío?: Sí");
        } else {
            System.out.println("¿Historial vacío?: No");
        }

        // Ejercicio Editor de Código
        System.out.println("\nEjercicio Editor de Código");

        PilaTDA editor = new HistorialNavegacion();
        editor.InicializarPila();

        // Estado inicial
        String estado = "línea 1";
        editor.Apilar(estado);
        System.out.println("Estado actual: " + estado);

        // Usuario agrega línea 2
        editor.Apilar(estado); // guardo estado anterior
        estado = "línea 1\nlínea 2";
        editor.Apilar(estado);
        System.out.println("Estado actual:\n" + estado);

        // Usuario borra línea 2 por error
        editor.Apilar(estado); // guardo estado anterior
        estado = "línea 1";
        editor.Apilar(estado);
        System.out.println("Estado actual:\n" + estado);

        // Usuario hace Deshacer
        editor.Desapilar();
        System.out.println("Deshacer → Estado anterior:\n" + editor.Tope());

        // Ejercicio Balanceo de Paréntesis
        System.out.print("\nEjercicio Balanceo de Parentesis");
        String expresion1 = "( ( a + b ) * c )";   // balanceada
        String expresion2 = "( ( a + b ) * c "; // No balanceada
        System.out.println("\nExpresión: " + expresion1);
        System.out.println(BalanceoExpresiones.chequearBalanceo(expresion1)
                ? "La expresión está balanceada.\n"
                : "La expresión NO está balanceada.\n");

        System.out.println("Expresión: " + expresion2);
        System.out.println(BalanceoExpresiones.chequearBalanceo(expresion2)
                ? "La expresión está balanceada.\n"
                : "La expresión NO está balanceada.\n");



        //  REVERSION DE STRINGS

        String palabra = "ALGORITMOS";
        PilaTDA pila = new HistorialNavegacion();
        System.out.println("\nEjercicio Reversion de Strings");
        pila.InicializarPila();

        // Apilar cada letra
        for (int i = 0; i < palabra.length(); i++) {
            pila.Apilar(String.valueOf(palabra.charAt(i)));
        }

        // Desapilar para invertir
        String invertida = "";
        while (!pila.PilaVacia()) {
            invertida += pila.Tope();
            pila.Desapilar();
        }

        System.out.println("\nOriginal: " + palabra);
        System.out.println("Invertida: " + invertida);


    }
    }