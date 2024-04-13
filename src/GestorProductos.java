import java.util.TreeSet;

public class GestorProductos {
    private TreeSet<Producto> productos;

    public GestorProductos() {
        this.productos = new TreeSet<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public void modificarProducto(Producto producto) {
        // Implementar lógica de modificación
    }

    // Otros métodos según sea necesario
}
