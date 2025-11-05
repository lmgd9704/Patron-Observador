import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CentroDeDonaciones centro = new CentroDeDonaciones();

        // Registrar módulos observadores
        centro.registrar(new ModuloInventario());
        centro.registrar(new ModuloContabilidad());
        centro.registrar(new ModuloRelacionesPublicas());

        // Cabecera del programa
        System.out.println("\033[33m" + "   /\\_/\\                   /)/)" + "\033[0m");
        System.out.println("\033[33m" + "  ( o.o )                 ( . .)" + "\033[0m");
        System.out.println("\033[33m" + "  > ^ <                   c(__)" + "\033[0m");
        System.out.println("\033[32m" + "+--------------------------------------------------+" + "\033[0m");
        System.out.println("\033[32m" + "|   ¡Bienvenido al Sistema de Donaciones Animales!   |" + "\033[0m");
        System.out.println("\033[32m" + "+--------------------------------------------------+" + "\033[0m");
        System.out.println("\033[33m" + "Escribe 'salir' en cualquier momento para terminar.\n" + "\033[0m");

        while (true) {
            System.out.print("\033[36m" + "\uD83D\uDC64 Nombre del donante: " + "\033[0m");
            String donante = sc.nextLine().trim();
            if (donante.equalsIgnoreCase("salir")) break;

            System.out.print("\033[36m" + "\uD83D\uDCE6 Tipo de donación (alimento, dinero, medicina...): " + "\033[0m");
            String tipo = sc.nextLine().trim();
            if (tipo.equalsIgnoreCase("salir")) break;

            System.out.print("\033[36m" + "\uD83D\uDD0D Cantidad o descripción: " + "\033[0m");
            String cantidad = sc.nextLine().trim();
            if (cantidad.equalsIgnoreCase("salir")) break;

            centro.recibirDonacion(tipo, cantidad, donante);
            System.out.println("\033[35m" + "\u2705 ¡Donación registrada con éxito!\n" + "\033[0m"); // Feedback al usuario
        }

        System.out.println("\n\033[32m" + "+--------------------------------------------------+" + "\033[0m");
        System.out.println("\033[32m" + "|  ¡Gracias por apoyar a nuestros amigos peludos!  |" + "\033[0m");
        System.out.println("\033[32m" + "+--------------------------------------------------+" + "\033[0m");
        System.out.println("\033[33m" + "   /\\_/\\                   /)/)" + "\033[0m");
        System.out.println("\033[33m" + "  ( ^.^ )                 ( . .)" + "\033[0m");
        System.out.println("\033[33m" + "  >   <                   c(__)" + "\033[0m");
        System.out.println("\033[32m" + "¡Hasta la próxima!" + "\033[0m");
        sc.close();
    }
}
