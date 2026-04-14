package trabajo2E;

public class ColaEstatica implements ColaTDA {
    private static final int MAX = 100;
    private int[] valores;
    private int inicio;
    private int fin;

    @Override
    public void InicializarCola() {
        valores = new int[MAX];
        inicio = 0;
        fin = 0;
    }

    @Override
    public void Acolar(int x) {
        valores[fin] = x;
        fin++;
    }

    @Override
    public void Desacolar() {
        if (!ColaVacia()) {
            inicio++;
        }
    }

    @Override
    public int Primero() {
        return valores[inicio];
    }

    @Override
    public boolean ColaVacia() {
        return inicio == fin;
    }
}
