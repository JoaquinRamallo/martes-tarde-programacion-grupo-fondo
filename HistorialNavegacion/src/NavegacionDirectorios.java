public class NavegacionDirectorios {
        public static void main(String[] args) {
            HistorialNavegacion carpetas = new HistorialNavegacion();
            carpetas.InicializarPila();


            // Entramos: C:/ -> Usuarios -> Documentos
            carpetas.Apilar(100); // C:/
            carpetas.Apilar(200); // Usuarios
            carpetas.Apilar(300); // Documentos (Tope actual)


            // CONSIGNA: Para "Subir un nivel", el sistema hace DESAPILAR.
            carpetas.Desapilar(); // Sale "Documentos"

            // El sistema ahora sabe que debe mostrar el nuevo TOPE:
            System.out.println("Volvimos a la carpeta: " + carpetas.Tope()); // Usuarios
        }
    }

}
