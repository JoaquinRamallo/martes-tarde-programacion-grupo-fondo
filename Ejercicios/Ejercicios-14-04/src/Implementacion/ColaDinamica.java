package Implementacion;

import Interfaces.ColaTDA;

public class ColaDinamica implements ColaTDA {

    private Node frente; // apunta al primer nodo de la cola (el que se despacola primero)
    private Node fondo;  // apunta al último nodo de la cola (donde se acola)

    @Override
    public void InicializarCola() {
        frente = null;
        fondo = null;
    }

    @Override
    public void Acolar(int x) {
        // El nuevo nodo se inserta al final (fondo).
        Node node = new Node(x, null);
        if (ColaVacia()) {
            frente = node;
        } else {
            fondo.setNext(node);
        }
        fondo = node;
    }

    @Override
    public void Desacolar() {
        if (!ColaVacia()) {
            // Avanzamos frente al siguiente nodo, descartando el nodo actual.
            frente = frente.getNext();
            if (frente == null) {
                fondo = null;
            }
        }
    }

    @Override
    public int Primero() {
        return frente.getData();
    }

    @Override
    public boolean ColaVacia() {
        return frente == null;
    }
}