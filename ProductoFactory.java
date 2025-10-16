public class ProductoFactory {

    public static Producto crearProducto(String tipo, int numero, String... datos) {
        switch (tipo.toLowerCase()) {
            case "camara":
                return new Camara(numero, datos[0], datos[1]);
            case "impresion":
                return new Impresion(numero, datos[0]);
            default:
                throw new IllegalArgumentException("Tipo de producto no válido");
        }
    }
}
