package Implementacion;

public class NodeValor {

    private int valor;
    private NodeValor next;

    public NodeValor(int valor, NodeValor next) {
        this.valor = valor;
        this.next = next;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodeValor getNext() {
        return next;
    }

    public void setNext(NodeValor next) {
        this.next = next;
    }
}
