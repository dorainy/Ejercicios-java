import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Estudiante> estudiantes = new ArrayList<>(); 

        int opcion;
        do{
            menu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1 :
                    agregarEstudiante(estudiantes);
                    break;
                case 2 :
                    mostrarEstudiante(estudiantes);
                    break;
                case 3 :
                    actualizarEstudiante(estudiantes);
                    break;
                case 4 :
                    System.out.println("salir del programa..");
                    break;
                default:
                    System.out.println("");
            }            
        }while(opcion != 5);
    }



    public static void agregarEstudiante(List<Estudiante> estudiantes){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Agrega el nombre del estudiante");
        String nombreEstudiante = scanner.nextLine();
        System.out.println("Agrega la edad del estudiante");
        int edadEstudiante = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Agrega el codigo del estudiante");
        int codigoEstudiante = scanner.nextInt();
        scanner.nextLine()
;        System.out.println("Agrega la carrera del estudiante");
        String carreraEstudiante = scanner.nextLine();
        estudiantes.add(new Estudiante(nombreEstudiante, edadEstudiante, codigoEstudiante,carreraEstudiante));
        System.out.println("Estudiante agredado con exito");
    }

    public static void mostrarEstudiante(List<Estudiante> estudiantes){
      if (estudiantes.isEmpty()) {
        System.out.println("No hay estudiantes registrados");
      }else{
        for(Estudiante estudiante : estudiantes){
            estudiante.mostrarInfo();
        }
      }
    }
    public static void actualizarEstudiante(List<Estudiante> estudiantes){

        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados para actualizar");
            return;
        }
        
        System.out.println("Ingrese el codigo del estudiante que quiere actualizar");
        Scanner scanner = new Scanner(System.in);
        int codigo = scanner.nextInt();
        scanner.nextLine();

        Estudiante estudiante = null;
        for(Estudiante e: estudiantes){
            if(e.getCodigo() == codigo){
                estudiante = e;
                break;
            }

        }
        if (estudiante == null) {
            System.out.println("Estudiante no encontrado");
            return;
        }

        System.out.println("¿Que deseas actualizar?");
        System.out.println("1.nombre");
        System.out.println("1.Edad");
        System.out.println("1.Codigo");
        System.out.println("1.Carrera");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("ingresa el nuevo nombre");
                estudiante.setNombre(scanner.nextLine());
                break;
            case 2:
                System.out.println("ingresa la nuevo edad");
                estudiante.setEdad(scanner.nextInt());
                scanner.nextLine();
                break;
            case 3:
                System.out.println("ingresa el nuevo codigo");
                estudiante.setCodigo(scanner.nextInt());
                scanner.nextLine();
                break;
            case 4:
                System.out.println("ingresa la nuevo carrera");
                estudiante.setCarrera(scanner.nextLine());
                break;

            default:
                System.out.println("Opcion invalida");
                break;

        }
        System.out.println("Lista actualizada");
        for(Estudiante estudiant: estudiantes){
            System.out.println("Nombre: " + estudiant.getNombre());
            System.out.println("Edad: " + estudiant.getEdad());
            System.out.println("Codigo: " + estudiant.getCodigo());
            System.out.println("Carrera: " + estudiant.getCarrera());
        }
    }
    public static void menu(){
        System.out.println("ingrese la opcion ");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Mostrar estudiantes");
        System.out.println("3. Actualizar estudiante");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }
}
