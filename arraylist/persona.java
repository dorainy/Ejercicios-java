package arraylist;

public class persona {
    private int num;
    private String nombre;
    private int edad;

    public persona(){

    }
    
    public persona(int num, String nombre, int edad){
        this.num = num;
        this.nombre = nombre;
        this.edad = edad;
    }
    public int getnum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }

}
