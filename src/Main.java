import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GestionDeCiudades gestion = new GestionDeCiudades();
        Map<Integer , String> menu = new HashMap<>();
        menu.put(1 , "Agregar ciudad");
        menu.put(2 , "Mostrar ciudades");
        menu.put(3 , "Buscar ciudad");
        menu.put(4 , "Eliminar ciudad");
        menu.put(5 , "Salir");

        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenidos al sistema de gestion de ciudades");

        do {
            System.out.println("--------------------------------");
            System.out.printf("| %-3s %-25s |%n", "", "Seleccione una opcion");
            menu.forEach((k, s) -> {
                System.out.printf("| %-3s %-25s |%n", k + ".", s);
            });
            System.out.println("--------------------------------");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1 -> {
                    System.out.println("Introduzca la ciudad a agregar");
                    gestion.agregarCiudad(entrada.next());
                }
                case 2 -> gestion.mostrarCiudades();
                case 3 -> {
                    System.out.println("Introduzca la ciudad a buscar");
                    gestion.buscarCiudad(entrada.next());
                }
                case 4 -> {
                    System.out.println("Introduzca la ciudad a eliminar");
                    gestion.eliminarCiudad(entrada.next());
                }
                case 5 -> System.out.print("¡Hasta luego!");
                default -> System.out.println("Entrada incorrecta");
            }
        }while(opcion != 5);
    }
}