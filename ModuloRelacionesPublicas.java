public class ModuloRelacionesPublicas implements DonacionObserver {
    public void actualizar(String tipo, String cantidad, String donante) {
        System.out.println("\033[36m" + "  _______________________________" + "\033[0m");
        System.out.println("\033[36m" + " |                               |" + "\033[0m");
        System.out.println("\033[36m" + " |   \033[33m[RELACIONES PÚBLICAS]\033[36m       |" + "\033[0m");
        System.out.println("\033[36m" + " |   Agradecimiento a \033[35m" + donante + "\033[36m    |" + "\033[0m");
        System.out.println("\033[36m" + " |   por \033[34m" + cantidad + " " + tipo + "\033[36m       |" + "\033[0m");
        System.out.println("\033[36m" + " |_______________________________|" + "\033[0m");
    }
}


