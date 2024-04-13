public class Producto implements Comparable<Producto> {
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private String rubro;

    // Constructor
    public Producto(int codigo, String descripcion, double precio, int stock, String rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    // Getters y Setters
    // Métodos equals() y hashCode() si es necesario
    // Método toString() para imprimir la información del producto

    @Override
    public int compareTo(Producto otroProducto) {
        return Integer.compare(this.codigo, otroProducto.codigo);
    }
}