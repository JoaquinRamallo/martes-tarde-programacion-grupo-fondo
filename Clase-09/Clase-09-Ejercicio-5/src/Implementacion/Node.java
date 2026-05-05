package Implementacion;

public class Node {

    private int dato;
    private int prioridad;
    private Node next;

    public Node(int dato, int prioridad, Node next) {
        this.dato = dato;
        this.prioridad = prioridad;
        this.next = next;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
