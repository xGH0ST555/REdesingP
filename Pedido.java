import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    private Pedido(Builder builder) {
        this.cliente = builder.cliente;
        this.productos = builder.productos;
        this.fecha = builder.fecha;
        this.numeroTarjetaCredito = builder.numeroTarjetaCredito;
    }

    public void resumen() {
        System.out.println("Pedido de " + cliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Tarjeta: **** **** **** " + (numeroTarjetaCredito % 10000));
        System.out.println("Productos:");
        for (Producto p : productos) {
            System.out.println(" - " + p.descripcion());
        }
    }

    //Clase Builder interna 
    public static class Builder {
        private Cliente cliente;
        private List<Producto> productos = new ArrayList<>();
        private Date fecha;
        private int numeroTarjetaCredito;

        public Builder setCliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder setFecha(Date fecha) {
            this.fecha = fecha;
            return this;
        }

        public Builder setNumeroTarjeta(int numero) {
            this.numeroTarjetaCredito = numero;
            return this;
        }

        public Builder addProducto(Producto producto) {
            productos.add(producto);
            return this;
        }

        public Pedido build() {
            return new Pedido(this);
        }
    }
}
