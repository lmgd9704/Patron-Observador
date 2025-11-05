public class ModuloInventario implements DonacionObserver {
    public void actualizar(String tipo, String cantidad, String donante) {
        System.out.println("\033[32m" + "  ____________________" + "\033[0m");
        System.out.println("\033[32m" + " |                    |" + "\033[0m");
        System.out.println("\033[32m" + " |  \033[33m[INVENTARIO]\033[32m      |" + "\033[0m");
        System.out.println("\033[32m" + " |  + " + "\033[34m" + cantidad + " " + tipo + "\033[32m" + "  |" + "\033[0m");
        System.out.println("\033[32m" + " |  Donante: " + "\033[35m" + donante + "\033[32m" + " |" + "\033[0m");
        System.out.println("\033[32m" + " |____________________|" + "\033[0m");
    }
}
