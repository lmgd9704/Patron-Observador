public class ModuloRelacionesPublicas implements DonacionObserver {
    public void actualizar(String tipo, String cantidad, String donante) {
        System.out.println("📣 [Relaciones Públicas] Se envió un agradecimiento a " + donante + 
                           " por su donación de " + cantidad + " (" + tipo + ").");
    }
}

