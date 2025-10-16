import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Singleton
        Tienda tienda = Tienda.getInstancia();

        // Cliente
        Cliente cliente = new Cliente("10012345", "Andrés");

        // Factory Metodo para productos
        Producto camara = ProductoFactory.crearProducto("camara", 1, "Sony", "Alpha 7");
        Impresion impresion = (Impresion) ProductoFactory.crearProducto("impresion", 2, "Color");

        // Añadir fotos a la impresión
        impresion.addFoto(new Foto("playa.jpg"));
        impresion.addFoto(new Foto("montaña.jpg"));

        // Builder para construir el pedido
        Pedido pedido = new Pedido.Builder()
                .setCliente(cliente)
                .setFecha(new Date())
                .setNumeroTarjeta(789456)
                .addProducto(camara)
                .addProducto(impresion)
                .build();

        // Guardar pedido en la tienda (Singleton)
        tienda.agregarPedido(pedido);

        // Mostrar todos los pedidos
        tienda.listarPedidos();
    }
}
