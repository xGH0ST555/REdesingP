import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private static Tienda instancia;
    private List<Pedido> pedidos;

    private Tienda() {
        pedidos = new ArrayList<>();
    }

    public static Tienda getInstancia() {
        if (instancia == null) {
            instancia = new Tienda();
        }
        return instancia;
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido agregado correctamente.");
    }

    public void listarPedidos() {
        System.out.println("=== LISTA DE PEDIDOS ===");
        for (Pedido p : pedidos) {
            p.resumen();
        }
    }
}
