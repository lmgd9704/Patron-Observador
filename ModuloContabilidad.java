public class ModuloContabilidad implements DonacionObserver {
    public void actualizar(String tipo, String cantidad, String donante) {
        System.out.println("💰 [Contabilidad] Se registró una donación de tipo '" + tipo + "' con descripción: " + cantidad + ".");
    }
}


