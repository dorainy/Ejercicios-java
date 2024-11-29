

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;
    
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public abstract String mostrarDetalles();

    public void encender(){
        System.out.println("El vehiculo esta encendido");
    }

}
