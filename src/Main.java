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
        System.out.println("Bienvenido al sistema de gestión de ciudades");

        do {
            System.out.println("--------------------------------");
            System.out.printf("| %-3s %-25s |%n", "", "Seleccione una opción");
            menu.forEach((k, s) -> {
                System.out.printf("| %-3s %-25s |%n", k + ".", s);
            });
            System.out.println("--------------------------------");
                if (entrada.hasNextInt()) {
                    opcion = entrada.nextInt();
                    entrada.nextLine();
                    switch (opcion) {
                        case 1 -> {
                            System.out.println("Introduzca el nombre de la ciudad a agregar");
                            gestion.agregarCiudad(entrada.nextLine());
                        }
                        case 2 -> gestion.mostrarCiudades();
                        case 3 -> {
                            System.out.println("Introduzca el nombre de la ciudad a buscar");
                            gestion.buscarCiudad(entrada.nextLine());
                        }
                        case 4 -> {
                            System.out.println("Introduzca el nombre de la ciudad a eliminar");
                            gestion.eliminarCiudad(entrada.nextLine());
                        }
                        case 5 -> System.out.print("¡Hasta luego!");
                        default -> System.out.println("Entrada incorrecta");
                    }
                }else {
                    System.out.println("Entrada no válida, por favor ingrese un número");
                    entrada.nextLine();
                }
        }while(opcion != 5);
    }
}