public class ModuloContabilidad implements DonacionObserver {
    public void actualizar(String tipo, String cantidad, String donante) {
        System.out.println("\033[32m" + "  _______________________________" + "\033[0m");
        System.out.println("\033[32m" + " |                               |" + "\033[0m");
        System.out.println("\033[32m" + " |   \033[33m[CONTABILIDAD]\033[32m       |" + "\033[0m");
        System.out.println("\033[32m" + " |   Donación: \033[34m" + tipo + "\033[32m             |" + "\033[0m");
        System.out.println("\033[32m" + " |   Cantidad: \033[35m" + cantidad + "\033[32m           |" + "\033[0m");
        System.out.println("\033[32m" + " |_______________________________|" + "\033[0m");
    }
}


