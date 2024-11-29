package metodos;

public class Setters {
    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "dorainy", "Guerrero");

        System.out.println("la id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: "+ alu2.getNombre());
        System.out.println("El apellido es: "+ alu2.getApellido());

        alu1.setId(8);
        alu1.setNombre("lulu");
        alu1.setApellido("bayona");
        System.out.println("---------------------------");
        System.out.println("la id del alumno 2 es: " + alu1.getId());
        System.out.println("El nombre es: "+ alu1.getNombre());
        System.out.println("El apellido es: "+ alu1.getApellido());

        System.out.println("---------------------------");
        //cambio de valor con el set
        alu2.setId(35);

        System.out.println("la id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: "+ alu2.getNombre());
        System.out.println("El apellido es: "+ alu2.getApellido());
    }
    
}
