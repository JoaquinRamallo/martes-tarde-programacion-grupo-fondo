import Interface.PilaTDA;
public class NavegacionDirectorios {
        public static void main(String[] args) {
            HistorialNavegacion carpetas = new HistorialNavegacion();
            carpetas.InicializarPila();


            // Entramos: C:/ -> Usuarios -> Documentos
            carpetas.Apilar("Goole"); // C:/
            carpetas.Apilar("Youtube"); // Usuarios
            carpetas.Apilar("Wiki"); // Documentos (Tope actual)


            // CONSIGNA: Para "Subir un nivel", el sistema hace DESAPILAR.
            carpetas.Desapilar(); // Sale "Documentos"

            // El sistema ahora sabe que debe mostrar el nuevo TOPE:
            System.out.println("Volvimos a la carpeta: " + carpetas.Tope()); // Usuarios
        }
    }

