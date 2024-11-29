package BIBLIOTECA;

import java.util.ArrayList;
import java.util.List;

import arrayli.arraylist;

public class Biblioteca {
    
    List<Libro> libros = new ArrayList<>();

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
        System.out.println("Libro agregado exitosamente");
    }

    public Libro buscarPorISBN(String isbn){
        for(Libro libro: libros){
            if(libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;
    }
    public boolean prestarLIbro(String isbn ){
        Libro libro = buscarPorISBN(isbn);
        if(libro!= null){
            if(libro.prestarLIbro()){
                System.out.println("El libro " + libro.getTitulo() + "ha sido prestado");
                return true;
            }else{
                System.out.println("El libro " + libro.getTitulo() + "ya esta prestado");
                
            }
        }
        return false;
    }

    public boolean devolverLibro(String isbn){
        Libro libro = buscarPorISBN(isbn);
        if(libro!= null){
            if(libro.devolver()){
                System.out.println("El libro " + libro.getTitulo() + "ha sido devuelto");
                return true;
            }else{
                System.out.println("El libro " + libro.getTitulo() + "no estaba prestado");
            }
        }
        return false;
    }

    public void mostrarLibros(){
        if(libros.isEmpty()){
            System.out.println("La biblioteca no tiene libros");
        }else{
            System.out.println("Listado de libros en la biblioteca");
            for(Libro libro : libros){
                libro.mostrarInfo();
            }
        }
    }
}
