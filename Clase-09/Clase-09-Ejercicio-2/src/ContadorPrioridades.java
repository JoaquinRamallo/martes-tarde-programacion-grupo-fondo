import Implementacion.ColaPrioridadDinamica;
import Interface.ColaPrioridadTDA;

public class ContadorPrioridades {
    public  static int  contarPrioridad1 (ColaPrioridadTDA cola){
        ColaPrioridadTDA aux = new ColaPrioridadDinamica();
        aux.InicializarColaPrioridad();
        int contador = 0;

        while (!cola.ColaVacia()){
            int elem = cola.Primero();
            int prioridad = cola.Prioridad();
            cola.Desacolar();

            if (prioridad == 1){
                contador++;
            }
            aux.AcolarPrioridad(elem, prioridad);

        }
        while (!aux.ColaVacia()){
            int elem = aux.Primero();
            int prioridad = aux.Prioridad();
            aux.Desacolar();
            cola.AcolarPrioridad(elem, prioridad);
        }
        return contador;

    }
}
