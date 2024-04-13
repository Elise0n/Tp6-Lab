package MenuPrincipal;

import ConsultasProductos.ConsultasProductos;
import java.util.Scanner;

public class MenuPrincipal {
    private GestorProductos gestorProductos;
    private ConsultasProductos consultasProductos;
    private Scanner scanner;

    public MenuPrincipal(GestorProductos gestorProductos, ConsultasProductos consultasProductos) {
        this.gestorProductos = gestorProductos;
        this.consultasProductos = consultasProductos;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        // Implementar la lógica para mostrar el menú y manejar las opciones
    }

    // Otros métodos según sea necesario

    private static class GestorProductos {

        public GestorProductos() {
        }
    }
}
