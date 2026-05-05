package Implementacion;

import Interface.PilaTDA;

public class pilaEstatica implements PilaTDA {
    private static final int MAX = 100;
    private int[] datos;
    private int cantidad; // variable auxiliar: cantidad de elementos

    @Override
    public void InicializarPila() {
        datos = new int[MAX];
        cantidad = 0;
    }

    @Override
    public void Apilar(int x) {
        if (cantidad < MAX) {
            datos[cantidad] = x; // guarda al final
            cantidad++;
        }
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()) {
            cantidad--;
        }
    }

    @Override
    public int Tope() {
        return datos[cantidad - 1];
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }

}
