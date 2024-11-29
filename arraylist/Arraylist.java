package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        
        List<persona> lista = new ArrayList<persona>();
        lista.add(new persona(1,"dorainy",30));
        lista.add(new persona(2,"luna",30));
        lista.add(new persona(3,"luisa",9));
        lista.add(new persona(4,"Alma",2));

    System.out.println("---------------------------------");
    //recorrer por indice 
    for(int i = 0; i < lista.size(); i++){
        System.out.println("prueba: " + lista.get(i).getNombre());
    }
    System.out.println("---------------------------------");
    // recorrido por cada uno
    for(persona perso: lista){
        System.out.println("prueba: " + perso.getNombre());
    }
    }
   
}
