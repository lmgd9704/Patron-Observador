public class ModuloInventario implements DonacionObserver {
    public void actualizar(String tipo, String cantidad, String donante) {
        System.out.println("📊 [Inventario] Se agregó al inventario: " + cantidad + " de " + tipo + ".");
    }
}
