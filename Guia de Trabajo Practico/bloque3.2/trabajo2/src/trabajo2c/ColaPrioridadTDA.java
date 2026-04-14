package trabajo2c;

public interface ColaPrioridadTDA {
    void InicializarColaPrioridad();
    void AcolarPrioridad(int x, int prioridad);
    void Desacolar();
    int Primero();
    int Prioridad();
    boolean ColaVacia();
}
