package src.default_package;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String autor;
    private String titulo;
    private String genero;
    private String codigoBarra;    
    

    //Los constructores son equivalentes al método de crear/registrar un nuevo libro

    //Constructor vacío
    public Libro() {
    }
    

    //Constructor con sus atributos
    public Libro(String autor, String titulo, String genero, String codigoBarra) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.codigoBarra = codigoBarra;
    }


    /*---GETTERS Y SETTERS---*/

    //Getter y setter para atributo autor
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Getter y setter para atributo titulo
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Getter y setter para atributo genero
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Getter y setter para atributo codigo de barra
    public String getCodigoBarra() {
        return codigoBarra;
    }
    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }


    /*---METODOS DE COMPORTAMIENTO---*/

    //Método para buscar un libro por su codigo de barras
    public Libro buscarPorCodigo(List<Libro> libros, String codigoBarras) {
        for (int i = 0; i <libros.size(); i++)
        {
            if (libros.get(i).getCodigoBarra().equals(codigoBarras))
            {
                return libros.get(i);
            }
        }
        return null;
    }

    //Método para mostrar todos los libros registrados
    public void mostrarTodos(List<Libro> libros) {
        for (Libro libro : libros) {
            System.out.println("\nTitulo: " + libro.getTitulo());
            System.out.println("Nombre autor: " + libro.getAutor());
            System.out.println("Genero: " + libro.getGenero());
            System.out.println("Codigo de barras: " + libro.getCodigoBarra() + "\n");
        }
    }
    
    //Metodo para buscar libro por su tipo de genero
    public List<Libro> buscarPorGenero(List<Libro> libros, String genero) {
        List<Libro> librosPorGenero = new ArrayList<Libro>();
        
        for(int i = 0; i < libros.size(); i++)
        {
            if(libros.get(i).getGenero().equals(genero))
            {
                librosPorGenero.add(libros.get(i));
            }
        }
        
        if (!librosPorGenero.isEmpty()){
            return librosPorGenero;
        }
        
        else {
            return null;
        }
    }
}