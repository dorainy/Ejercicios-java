package arraylist;

import java.util.LinkedList;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        
        List <persona> lista = new LinkedList()<persona>();
        lista.add(new persona(1,"dorainy",30));
        lista.add(new persona(2,"luna",30));
        lista.add(new persona(3,"luisa",9));
        lista.add(new persona(4,"Alma",2));

    System.out.println("---------------------------------");
    
    System.out.println("---------------------------------");
    // recorrido por cada uno
    for(persona perso: lista){
        System.out.println("prueba: " + perso.getNombre());
    }
    }
   
}
