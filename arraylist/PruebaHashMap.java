package arraylist;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {
    public static void main(String[] args) {
        
        Map <Integer, String> mapaEmpleados = new HashMap<>();

       
        mapaEmpleados.put(1523, "suscribeee");
        mapaEmpleados.put(1545, "dorainyyy");
        mapaEmpleados.put(1524, "lunaaa");
        mapaEmpleados.put(1525, "hola atodos");
        mapaEmpleados.put(1526, "namjoon");

        //Eliminar un valor 
        mapaEmpleados.remove(1526);
        
        //Para mirar mi se encuentra un dato
        boolean estaOno = mapaEmpleados.containsKey(1523);

        if(estaOno==true){
            System.out.println("El valor buscado esta");
        }else{
            System.out.println("el valor buscado no esta ");
        }
        //para mostrar todos los datos del map
        System.err.println(mapaEmpleados.values());

        //para traer un dato a partir del nombre
        String nombre = mapaEmpleados.get(1523);
        System.out.println("El empleado buscado es " + nombre);

    }
}
