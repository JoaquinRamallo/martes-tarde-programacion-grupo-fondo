package Implementacion;

import Interfaces.DiccionarioMultipleTDA;

public class DiccionarioMultipleDinamico implements DiccionarioMultipleTDA {

    // Lista enlazada de claves; cada clave apunta a su propia lista de valores.
    private NodeClave cabeza;

    @Override
    public void InicializarDiccionario() {
        cabeza = null;
    }

    @Override
    public void Agregar(int clave, int valor) {
        NodeClave nodoClave = buscarClave(clave);

        if (nodoClave == null) {
            // Clave nueva: crear nodo de clave con un primer valor.
            NodeValor nodoValor = new NodeValor(valor, null);
            cabeza = new NodeClave(clave, nodoValor, cabeza);
        } else {
            // Clave existente: agregar valor solo si no está repetido.
            if (!existeValor(nodoClave, valor)) {
                nodoClave.setPrimero(new NodeValor(valor, nodoClave.getPrimero()));
            }
        }
    }

    @Override
    public void EliminarValor(int clave, int valor) {
        NodeClave nodoClave = buscarClave(clave);
        if (nodoClave == null) return;

        NodeValor curr = nodoClave.getPrimero();
        NodeValor prev = null;

        while (curr != null && curr.getValor() != valor) {
            prev = curr;
            curr = curr.getNext();
        }

        if (curr != null) {
            if (prev == null) {
                nodoClave.setPrimero(curr.getNext());
            } else {
                prev.setNext(curr.getNext());
            }

            // Si la clave quedó sin valores, se elimina también.
            if (nodoClave.getPrimero() == null) {
                Eliminar(clave);
            }
        }
    }

    @Override
    public void Eliminar(int clave) {
        NodeClave curr = cabeza;
        NodeClave prev = null;

        while (curr != null && curr.getClave() != clave) {
            prev = curr;
            curr = curr.getNext();
        }

        if (curr != null) {
            if (prev == null) {
                cabeza = curr.getNext();
            } else {
                prev.setNext(curr.getNext());
            }
        }
    }

    @Override
    public int[] Recuperar(int clave) {
        NodeClave nodoClave = buscarClave(clave);
        if (nodoClave == null) return new int[0];

        int count = 0;
        NodeValor curr = nodoClave.getPrimero();
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }

        int[] result = new int[count];
        curr = nodoClave.getPrimero();
        for (int i = 0; i < count; i++) {
            result[i] = curr.getValor();
            curr = curr.getNext();
        }
        return result;
    }

    @Override
    public int[] Claves() {
        int count = 0;
        NodeClave curr = cabeza;
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }

        int[] result = new int[count];
        curr = cabeza;
        for (int i = 0; i < count; i++) {
            result[i] = curr.getClave();
            curr = curr.getNext();
        }
        return result;
    }

    private NodeClave buscarClave(int clave) {
        NodeClave curr = cabeza;
        while (curr != null && curr.getClave() != clave) {
            curr = curr.getNext();
        }
        return curr;
    }

    private boolean existeValor(NodeClave nodoClave, int valor) {
        NodeValor curr = nodoClave.getPrimero();
        while (curr != null) {
            if (curr.getValor() == valor) return true;
            curr = curr.getNext();
        }
        return false;
    }
}