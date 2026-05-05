import Implementacion.Conjunto;
import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class Main {
    public static void main(String[] args) {

        ConjuntoTDA A = new ConjuntoEstatico();
        ConjuntoTDA B = new ConjuntoEstatico();

        A.InicializarConjunto();
        B.InicializarConjunto();

        // Cargar datos
        A.Agregar(10);
        A.Agregar(30);
        A.Agregar(20);

        B.Agregar(10);
        B.Agregar(20);
        B.Agregar(50);


        ConjuntoTDA C = Conjunto.diferenciaSimetrica(A, B);

        System.out.println("Conjunto A:");
        Conjunto.mostrar(A);

        System.out.println("Conjunto B:");
        Conjunto.mostrar(B);

        System.out.println("Diferencia simétrica:");
        Conjunto.mostrar(C);
    }
}