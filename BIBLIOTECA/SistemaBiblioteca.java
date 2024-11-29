package BIBLIOTECA;

import java.util.Scanner;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        
        int opcion;
        
        do{
            System.out.println("\n--- Menú del Sistema de Biblioteca ---");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Prestar Libro");
            System.out.println("3. Devolver Libro");
            System.out.println("4. Mostrar Todos los Libros");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el isbn del libro a prestar");
                    scanner.nextLine();
                    String isbnPretar = scanner.nextLine();
                    biblioteca.prestarLIbro(isbnPretar);
                    break;
            
                default:
                    break;
            }
        }

    }
}
