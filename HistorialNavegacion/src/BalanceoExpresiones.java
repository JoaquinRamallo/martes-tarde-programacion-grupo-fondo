public class BalanceoExpresiones {

    public static boolean chequearBalanceo(String expresion) {
        PilaTDA pila = new HistorialNavegacion();
        pila.InicializarPila();

        boolean balanceada = true;

        for (int i = 0; i < expresion.length(); i++) {
            char ch = expresion.charAt(i);

            // Aperturas
            if (ch == '(' || ch == '{' || ch == '[') {
                pila.Apilar(String.valueOf(ch));
            }

            // Cierres
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (pila.PilaVacia()) {
                    balanceada = false;
                } else {
                    String tope = pila.Tope();
                    if ((ch == ')' && tope.equals("(")) ||
                            (ch == '}' && tope.equals("{")) ||
                            (ch == ']' && tope.equals("["))) {
                        pila.Desapilar();
                    } else {
                        balanceada = false;
                    }
                }
            }
        }

        // Al final, la pila debe estar vacía
        if (!pila.PilaVacia()) {
            balanceada = false;
        }

        return balanceada;
    }
}
