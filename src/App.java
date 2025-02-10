import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        // System.out.println("Hello, World!");

        Libro l1 = new Libro();
        l1.setAutor("Gabriel Garcia Marquez");
        l1.setTitulo("100 años de soledad");
        l1.setGenero("Novela");
        l1.setCodigoBarra("0001");


        Libro l2 = new Libro("Rowling", "Harry Potter",
        "CienciaFiccion", "0002");

        Libro l3 = new Libro("Baldor", "Operaciones Aritmeticas",
        "Educacion", "0003");


        List<Libro> libros = new ArrayList<>();
        libros.add(l1);
        libros.add(l2);
        libros.add(l3);
        

        System.out.println("\n -- MENU --");
        System.out.println("Opcion 1: Guardar libro");
        System.out.println("Opcion 2: Buscar por código");
        System.out.println("Opcion 3: Mostrar todos los libros");
        System.out.println("Opcion 4: Buscar por genero");
        System.out.print("\nIngrese una opción: ");

        Scanner scanner = new Scanner(System.in);
        
        int opcion = scanner.nextInt();

        // System.out.println("El valor ingresado fue: " + opcion);

        while(opcion < 1 || opcion > 4)
        {
            System.out.print("Opcion invalida. Ingrese una de las opciones anteriores: ");
            opcion = scanner.nextInt();
        }

        switch (opcion) {
            case 1:
                Libro resultado = l1.buscarPorCodigo(libros, "0002");

                if(resultado != null){
                    System.out.println(resultado.getTitulo());
                }

                else {
                    System.out.println("No se encontró ninguna coincidencia");
                }
                
                break;
            
            case 2:
                break;
                
            case 3:
                break;
            
            case 4:
                break;

            
            default:
                break;
        }
        scanner.close();
    }
}
