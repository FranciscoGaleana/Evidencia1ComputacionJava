import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String autor;
    private String titulo;
    private String genero;
    private String codigoBarra;    
    
    public Libro() {
    }

    
    public Libro(String autor, String titulo, String genero, String codigoBarra) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.codigoBarra = codigoBarra;
    }


    /*---GETTERS Y SETTERS---*/
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getCodigoBarra() {
        return codigoBarra;
    }
    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }


    /*---METODOS DE COMPORTAMIENTO---*/
    public Libro buscarPorCodigo(List<Libro> libros, String codigoBarras) {
        for (int i = 0; i <libros.size(); i++)
        {
            if (libros.get(i).getCodigoBarra() == codigoBarras)
            {
                return libros.get(i);
            }
        }
        return null;
    }

    public void mostrarTodos(List<Libro> libros) {
        for (Libro libro : libros) {
            System.out.println("Titulo: " + libro.getTitulo());
            System.out.println("Nombre autor: " + libro.getAutor());
            System.out.println("Genero: " + libro.getGenero());
            System.out.println("Codigo de barras: " + libro.getCodigoBarra());
        }
    }
    
    public List<Libro> buscarPorGenero(List<Libro> libros, String genero) {
        List<Libro> librosPorGenero = new ArrayList<Libro>();
        
        for(int i = 0; i < libros.size(); i++)
        {
            if(libros.get(i).getGenero() == genero)
            {
                librosPorGenero.add(libros.get(i));
            }
        }
        return librosPorGenero;
    }
}