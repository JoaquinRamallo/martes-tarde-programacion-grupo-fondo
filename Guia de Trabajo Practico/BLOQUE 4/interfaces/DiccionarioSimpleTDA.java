package interfaces;
public interface DiccionarioSimpleTDA {
    void InicializarDiccionario();
    void Agregar(int clave, int valor);
    void Eliminar(int clave);
    int[] Claves();
}

