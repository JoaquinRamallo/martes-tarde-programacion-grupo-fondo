import Interface.PilaTDA;
import Interface.ConjuntoTDA;
import Implementacion.pilaEstatica;
import Implementacion.conjuntoEstatico;
public class tieneRepetidos {
    public static boolean repetidos(pilaEstatica p) {
        PilaTDA aux = new pilaEstatica();
        aux.InicializarPila();

        ConjuntoTDA auxC= new conjuntoEstatico();
        auxC.InicializarConjunto();

        boolean repetido = false;
        int x = p.Tope();
        while(!p.PilaVacia()) {
            x = p.Tope();
            p.Desapilar();

            if(auxC.Pertenece(x)){
                repetido=true;
            }else{
                auxC.Agregar(x);
            }
            aux.Apilar(x);
        }
        while(!aux.PilaVacia()) {
            p.Apilar(aux.Tope());
            aux.Desapilar();
        }
        return repetido;
    }
}