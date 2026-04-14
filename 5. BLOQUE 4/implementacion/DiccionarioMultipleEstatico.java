package implementacion;

import interfaces.DiccionarioMultipleTDA;

public class DiccionarioMultipleEstatico implements DiccionarioMultipleTDA {

    private static final int MAX_CLAVES = 100;
    private static final int MAX_VALORES = 100;

    private int[] claves;
    private int[][] valores;
    private int[] cantValores;
    private int cantidadClaves;

    @Override
    public void InicializarDiccionario() {
        claves = new int[MAX_CLAVES];
        valores = new int[MAX_CLAVES][MAX_VALORES];
        cantValores = new int[MAX_CLAVES];
        cantidadClaves = 0;
    }

    @Override
    public void Agregar(int clave, int valor) {
        int posClave = buscarClave(clave);

        if (posClave == -1) {
            if (cantidadClaves < MAX_CLAVES) {
                claves[cantidadClaves] = clave;
                valores[cantidadClaves][0] = valor;
                cantValores[cantidadClaves] = 1;
                cantidadClaves++;
            }
        } else {
            if (!existeValor(posClave, valor) && cantValores[posClave] < MAX_VALORES) {
                valores[posClave][cantValores[posClave]] = valor;
                cantValores[posClave]++;
            }
        }
    }

    @Override
    public void EliminarValor(int clave, int valor) {
        int posClave = buscarClave(clave);

        if (posClave != -1) {
            int posValor = buscarValor(posClave, valor);

            if (posValor != -1) {
                valores[posClave][posValor] = valores[posClave][cantValores[posClave] - 1];
                cantValores[posClave]--;

                if (cantValores[posClave] == 0) {
                    Eliminar(clave);
                }
            }
        }
    }

    @Override
    public void Eliminar(int clave) {
        int posClave = buscarClave(clave);

        if (posClave != -1) {
            claves[posClave] = claves[cantidadClaves - 1];
            cantValores[posClave] = cantValores[cantidadClaves - 1];

            for (int i = 0; i < cantValores[posClave]; i++) {
                valores[posClave][i] = valores[cantidadClaves - 1][i];
            }

            cantidadClaves--;
        }
    }

    @Override
    public int[] Recuperar(int clave) {
        int posClave = buscarClave(clave);

        if (posClave == -1) {
            return new int[0];
        }

        int[] aux = new int[cantValores[posClave]];
        for (int i = 0; i < cantValores[posClave]; i++) {
            aux[i] = valores[posClave][i];
        }
        return aux;
    }

    @Override
    public int[] Claves() {
        int[] aux = new int[cantidadClaves];
        for (int i = 0; i < cantidadClaves; i++) {
            aux[i] = claves[i];
        }
        return aux;
    }

    private int buscarClave(int clave) {
        int i = 0;
        while (i < cantidadClaves && claves[i] != clave) {
            i++;
        }

        if (i < cantidadClaves) {
            return i;
        }
        return -1;
    }

    private int buscarValor(int posClave, int valor) {
        int i = 0;
        while (i < cantValores[posClave] && valores[posClave][i] != valor) {
            i++;
        }

        if (i < cantValores[posClave]) {
            return i;
        }
        return -1;
    }

    private boolean existeValor(int posClave, int valor) {
        return buscarValor(posClave, valor) != -1;
    }
}
