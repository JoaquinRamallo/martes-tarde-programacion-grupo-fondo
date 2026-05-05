import Implementacion.ColaDinamica;
import Implementacion.ColaPrioridadDinamica;

public class Ejercicio5 {
    public static void main(String[] args) {
        ColaDinamica cola = new ColaDinamica();
        cola.InicializarCola();
        cola.Acolar(-3);
        cola.Acolar(5);
        cola.Acolar(0);
        cola.Acolar(-1);
        cola.Acolar(7);
        cola.Acolar(2);
        cola.Acolar(-4);

        ColaPrioridadDinamica colaPrioridad = new ColaPrioridadDinamica();
        colaPrioridad.InicializarColaPrioridad();

        while (!cola.ColaVacia()){
            int dato = cola.Primero();
            int prioridad;
            if (dato < 0) {
                prioridad = 0;
            }
            else if (dato == 0) {
                prioridad = 1;
            }
            else {
                prioridad = 2;
            }
            colaPrioridad.AcolarPrioridad(dato, prioridad);
            cola.Desacolar();
        }
        System.out.println("cola con Prioridad :");
        while (!colaPrioridad.ColaVacia()){
            System.out.println("Dato: " + colaPrioridad.Primero()+ " | Prioridad :" + colaPrioridad.Prioridad());
            colaPrioridad.Desacolar();
        }

    }
}
