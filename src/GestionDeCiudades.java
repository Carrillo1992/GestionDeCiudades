import java.util.HashSet;
import java.util.Set;

public class GestionDeCiudades {

    private Set<String> ciudades;

    public GestionDeCiudades() {
        ciudades = new HashSet<>();
    }

    public void agregarCiudad (String ciudad){
        if (ciudades.add(ciudad)){
            System.out.println("Ciudad  agregada correctamente");
        }else {
            System.out.println("La ciudad ya existe");
        }
    }

    public void mostrarCiudades (){
        if (ciudades.isEmpty()){
            System.out.println("No hay ciudades registradas");
        }else {
            ciudades.forEach(System.out::println);
        }
    }

    public void buscarCiudad(String ciudad){
        if (ciudades.contains(ciudad)){
            System.out.println("La ciudad "+ ciudad + " se encuentra en nuestra BBDD");
        }else {
            System.out.println("La ciudad " + ciudad + " no existe");
        }
    }

    public void eliminarCiudad(String ciudad){
        if (ciudades.remove(ciudad)){
            System.out.println("Ciudad eliminada correctamente");
        }else {
            System.out.println("La ciudad no esta en la BBDD");
        }
    }
}
