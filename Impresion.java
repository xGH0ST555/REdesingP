import java.util.ArrayList;
import java.util.List;

public class Impresion extends Producto {
    private String color;
    private List<Foto> fotos = new ArrayList<>();

    public Impresion(int numero, String color) {
        super(numero);
        this.color = color;
    }

    public void addFoto(Foto foto) {
        fotos.add(foto);
    }

    @Override
    public String descripcion() {
        return "Impresión color " + color + " con " + fotos.size() + " fotos (#" + getNumero() + ")";
    }
}
