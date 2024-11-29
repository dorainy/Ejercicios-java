package BIBLIOTECA;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean estado;
    

    
    public Libro(String titulo, String autor, String isbn, boolean estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estado = false;
    }
    

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public boolean prestarLIbro(){
        if(!estado){
            estado = true;
            return true;
        }
        return false;
    }
    public boolean devolver(){
        if(estado){
            estado = false;
            return true;
        }
        return false;
    }
    public void mostrarInfo(){
        String prestado = estado ? "Prestado" : "Disponible";
        System.out.println("Tiulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Estado: " + prestado);
    }
}
