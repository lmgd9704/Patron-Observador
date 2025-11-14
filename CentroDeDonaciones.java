import java.util.ArrayList;
import java.util.List;

public class CentroDeDonaciones implements DonacionSubject {
    private List<DonacionObserver> observadores = new ArrayList<>();

    public void registrar(DonacionObserver o) {
        observadores.add(o);
    }

  
    public void eliminar(DonacionObserver o) {
        observadores.remove(o);
    }

  
    public void notificar(String tipo, String cantidad, String donante) {
        for (DonacionObserver o : observadores) {
            o.actualizar(tipo, cantidad, donante);
        }
    }

    public void recibirDonacion(String tipo, String cantidad, String donante) {
        System.out.println("\n📦 Nueva donación recibida:");
        System.out.println("   - Donante: " + donante);
        System.out.println("   - Tipo: " + tipo);
        System.out.println("   - Cantidad o descripción: " + cantidad);

        notificar(tipo, cantidad, donante);
    }
}



