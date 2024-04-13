package ConsultasProductos;

import java.util.List;
import java.util.stream.Collectors;

public class ConsultasProductos {
    private List<Producto> productos;

    public ConsultasProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> consultarPorRubro(String rubro) {
        return productos.stream()
                .filter(producto -> producto.getRubro().equalsIgnoreCase(rubro))
                .collect(Collectors.toList());
    }

    public List<Producto> consultarPorNombre(String nombre) {
        return productos.stream()
                .filter(producto -> producto.getDescripcion().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Producto> consultarPorPrecio(double precioMin, double precioMax) {
        return productos.stream()
                .filter(producto -> producto.getPrecio() >= precioMin && producto.getPrecio() <= precioMax)
                .collect(Collectors.toList());
    }

    // Otros métodos según sea necesario

    private static class Producto {

        public Producto() {
        }

        private Object getRubro() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private Object getDescripcion() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private double getPrecio() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
