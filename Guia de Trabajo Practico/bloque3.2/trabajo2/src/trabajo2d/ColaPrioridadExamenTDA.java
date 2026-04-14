package trabajo2d;

public interface ColaPrioridadExamenTDA {
    void InicializarColaPrioridad();
    void AcolarPrioridad(int x, int prioridad);
    void Desacolar();
    int Primero();
    int Prioridad();
    boolean ColaVacia();
}
