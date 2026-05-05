package Implementacion;

public class NodoDinamico {

    private int data;
    private NodoDinamico next;


    public NodoDinamico(int data, NodoDinamico next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodoDinamico getNext() {
        return next;
    }

    public void setNext(NodoDinamico next) {
        this.next = next;
    }
}