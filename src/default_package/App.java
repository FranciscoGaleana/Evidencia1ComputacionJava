package src.default_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    //Buffer para leer datos de entrada
    public static BufferedReader entrada = new BufferedReader((new InputStreamReader(System.in)));

    public static void main(String[] args) throws IOException {
        
        //Lista para almacenar los objetos de tipo libro
        List<Libro> libros = new ArrayList<>();
        
        //Variable para guardar la opcion ingresada por el usuario
        int opcion;

        //Inicianlizando objeto de tipo libro como nulo
        Libro nuevoLibro = null;

        //Ciclo infinito para permitir interaccion con el usuario hasta que el desee salir
        while(true) 
        {
            //Menu de opciones
            System.out.println("\n -- MENU --");
            System.out.println("Opcion 1: Guardar/Registrar libro");
            System.out.println("Opcion 2: Buscar por código");
            System.out.println("Opcion 3: Mostrar todos los libros");
            System.out.println("Opcion 4: Buscar por genero");
            System.out.println("Opcion 5: Salir del programa");
            System.out.print("\nIngrese una opción: ");

            opcion = Integer.parseInt(entrada.readLine());

            //Manejar opciones ingresadas invalidas
            while(opcion < 1 || opcion > 5)
            {
                System.out.print("Opcion invalida. Ingrese una de las opciones anteriores: ");
                opcion = Integer.parseInt(entrada.readLine());
            }

            //Condicion para salir del programa
            if (opcion == 5)
                break;

            //Manejar opciones ingresadas
            switch (opcion) 
            {
                case 1:
                //Instanciando objeto de tipo libro vacío
                nuevoLibro = new Libro();
                
                //Declarando variables necesarias 
                String autor;
                String titulo;
                String genero;
                String codigoBarra;

                //Preguntando datos de entrada para registrar el libro
                System.out.print("Ingresa el autor del libro: ");
                autor = entrada.readLine();

                System.out.print("Ingresa el titulo del libro: ");
                titulo = entrada.readLine();

                System.out.print("Ingresa el genero del libro: ");
                genero = entrada.readLine().toLowerCase();

                System.out.print("Ingresa el codigo de barra del libro: ");
                codigoBarra = entrada.readLine().toLowerCase();

                //Asignando valores al objeto de tipo libro instanciado previamente
                nuevoLibro.setAutor(autor);
                nuevoLibro.setTitulo(titulo);
                nuevoLibro.setGenero(genero);
                nuevoLibro.setCodigoBarra(codigoBarra);
                
                //Guardando objeto en la lista previamente creada
                libros.add(nuevoLibro);
                    break;
                
                case 2:
                //Preguntando codigo de barra del libro que se desea buscar
                System.out.print("Ingresa el codigo de barra del libro a buscar: ");
                String codigoPorBuscar = entrada.readLine().toLowerCase();

                //Llamando al metodo para buscar por libro y guardando su valor
                Libro resultado = nuevoLibro.buscarPorCodigo(libros, codigoPorBuscar);

                //Si el libro es diferente de nulo (sí hay concidencias)
                if(resultado != null){
                    System.out.println("Titulo: " + resultado.getTitulo());
                    System.out.println("Autor: " + resultado.getAutor());
                    System.out.println("Genero: " + resultado.getGenero());
                    System.out.println("Codigo de barra: " + resultado.getCodigoBarra());
                }

                //De lo contrario no hay coincidencias
                else {
                    System.out.println("No se encontró el codigo solicitado: " + codigoPorBuscar);
                }
                    break;
                    
                case 3:
                //Llamando al metodo para mostrar todos los libros registrados
                System.out.println("Los libros registrados son:");
                nuevoLibro.mostrarTodos(libros);
                    break;
                
                case 4:
                //Preguntando genero de los libros a buscar
                System.out.print("Ingresa el genero de los libros que se desean buscar: ");
                String generoPorBuscar = entrada.readLine().toLowerCase();

                //Declarando lista para guardar los libros encontrados
                List <Libro> resultados = new ArrayList<Libro>();

                //Llamando al metodo que busca libros por su tipo de genero
                resultados = nuevoLibro.buscarPorGenero(libros, generoPorBuscar);
            

                //Si resultados es diferente de nulo (sí hay coincidencias)
                if(resultados != null)
                {    
                    System.out.println("Los libros con el genero " + generoPorBuscar + " encontrados son:");
                    //Recorriendo lista de resultados (libros encontrados)
                    for(Object x: resultados)
                    {
                        Libro xx = (Libro)x;
                        System.out.println("Titulo: " + xx.getTitulo());
                        System.out.println("Autor: " + xx.getAutor());
                        System.out.println("Genero: " + xx.getGenero());
                        System.out.println("Codigo de barra: " + xx.getCodigoBarra());
                    }
                }

                //De lo contrario no hay coincidencias
                else {
                    System.out.println("No se encontro el genero solicitado: " + generoPorBuscar);
                }
                    break;
                
                default:
                    break;
            }
        }
    }
}
