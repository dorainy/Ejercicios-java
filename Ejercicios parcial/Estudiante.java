
class Estudiante {
    private String nombre;
    private int edad;
    private int codigo;
    private String carrera;
 

    public Estudiante(String nombre, int edad, int codigo, String carrera){
        this.nombre = nombre;
        this.edad = edad;
        this.codigo = codigo;
        this.carrera = carrera;
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

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getCarrera(){
        return carrera;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre );
        System.out.println("Edad: " + edad );
        System.out.println("Codigo: " + codigo );
        System.out.println("Carrera: " + carrera);
    }
    
}