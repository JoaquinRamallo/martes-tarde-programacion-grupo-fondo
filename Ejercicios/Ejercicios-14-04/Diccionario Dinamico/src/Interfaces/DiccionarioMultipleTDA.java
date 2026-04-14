package Interfaces;

public interface DiccionarioMultipleTDA {
    void InicializarDiccionario();
    void Agregar(int clave, int valor);
    void EliminarValor(int clave, int valor);
    void Eliminar(int clave);
    int[] Recuperar(int clave);
    int[] Claves();
}
