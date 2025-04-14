import java.util.HashSet;
import java.util.Set;

public class GestionDeCiudades {

    private Set<String> ciudades;

    public GestionDeCiudades() {
        ciudades = new HashSet<>();
    }

    public void agregarCiudad (String ciudad){
        if (ciudades.add(ciudad)){
            System.out.println("Ciudad \""+ ciudad+ "\" agregada correctamente");
        }else {
            System.out.println("La ciudad\" "+ ciudad +"\" ya está registrada");
        }
    }

    public void mostrarCiudades (){
        if (ciudades.isEmpty()){
            System.out.println("No hay ciudades registradas");
        }else {
            System.out.println("Lista de ciudades:");
            ciudades.forEach(System.out::println);
        }
    }

    public void buscarCiudad(String ciudad){
        if (ciudades.contains(ciudad)){
            System.out.println("La ciudad \""+ ciudad + "\" se encuentra en nuestra BBDD");
        }else {
            System.out.println("La ciudad \"" + ciudad + "\" no está registrada");
        }
    }

    public void eliminarCiudad(String ciudad){
        if (ciudades.remove(ciudad)){
            System.out.println("Ciudad \""+ ciudad + "\" eliminada correctamente");
        }else {
            System.out.println("La ciudad \""+ ciudad + "\" no esta en la BBDD");
        }
    }
}
