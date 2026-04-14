package trabajo2c;

public class ColaPrioridadEstatica implements trabajo2c.ColaPrioridadTDA {
    private static final int MAX = 100;
    private int[] valores;
    private int[] prioridades;
    private int cantidad;

    @Override
    public void InicializarColaPrioridad() {
        valores = new int[MAX];
        prioridades = new int[MAX];
        cantidad = 0;
    }

    @Override
    public void AcolarPrioridad(int x, int prioridad) {
        int i = cantidad - 1;
        while (i >= 0 && prioridades[i] < prioridad) {
            valores[i + 1] = valores[i];
            prioridades[i + 1] = prioridades[i];
            i--;
        }
        valores[i + 1] = x;
        prioridades[i + 1] = prioridad;
        cantidad++;
    }

    @Override
    public void Desacolar() {
        if (!ColaVacia()) {
            for (int i = 0; i < cantidad - 1; i++) {
                valores[i] = valores[i + 1];
                prioridades[i] = prioridades[i + 1];
            }
            cantidad--;
        }
    }

    @Override
    public int Primero() {
        return valores[0];
    }

    @Override
    public int Prioridad() {
        return prioridades[0];
    }

    @Override
    public boolean ColaVacia() {
        return cantidad == 0;
    }
}
