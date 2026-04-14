package implementacion;

import interfaces.DiccionarioSimpleTDA;

public class DiccionarioSimpleEstatico implements DiccionarioSimpleTDA {

    private static final int MAX = 100;
    private int[] claves;
    private int[] valores;
    private int cantidad;

    @Override
    public void InicializarDiccionario() {
        claves = new int[MAX];
        valores = new int[MAX];
        cantidad = 0;
    }

    @Override
    public void Agregar(int clave, int valor) {
        int i = 0;

        while (i < cantidad && claves[i] != clave) {
            i++;
        }

        if (i < cantidad) {
            valores[i] = valor; // actualiza si la clave ya existe
        } else if (cantidad < MAX) {
            claves[cantidad] = clave;
            valores[cantidad] = valor;
            cantidad++;
        }
    }

    @Override
    public void Eliminar(int clave) {
        int i = 0;

        while (i < cantidad && claves[i] != clave) {
            i++;
        }

        if (i < cantidad) {
            claves[i] = claves[cantidad - 1];
            valores[i] = valores[cantidad - 1];
            cantidad--;
        }
    }

    @Override
    public int[] Claves() {
        int[] aux = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            aux[i] = claves[i];
        }
        return aux;
    }
}
