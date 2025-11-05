public interface DonacionSubject {
    void registrar(DonacionObserver o);
    void eliminar(DonacionObserver o);
    void notificar(String tipo, String cantidad, String donante);
}

