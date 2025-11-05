import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CentroDeDonaciones centro = new CentroDeDonaciones();

        // Registrar módulos observadores
        centro.registrar(new ModuloInventario());
        centro.registrar(new ModuloContabilidad());
        centro.registrar(new ModuloRelacionesPublicas());

        System.out.println("=== Sistema de Registro de Donaciones - Refugio de Animales ===");
        System.out.println("Escribe 'salir' en cualquier momento para terminar.\n");

        while (true) {
            System.out.print("Nombre del donante: ");
            String donante = sc.nextLine().trim();
            if (donante.equalsIgnoreCase("salir")) break;

            System.out.print("Tipo de donación (alimento, dinero, medicina...): ");
            String tipo = sc.nextLine().trim();
            if (tipo.equalsIgnoreCase("salir")) break;

            System.out.print("Cantidad o descripción: ");
            String cantidad = sc.nextLine().trim();
            if (cantidad.equalsIgnoreCase("salir")) break;

            centro.recibirDonacion(tipo, cantidad, donante);
        }

        System.out.println("\n✅ Sistema finalizado. Gracias por registrar las donaciones.");
        sc.close();
    }
}
