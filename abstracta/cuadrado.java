package abstracta;

public class cuadrado extends figura {

    
    private double lado;

    public cuadrado(){

    }
    public cuadrado(double lado, double x, double y){
        super(x,y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado; 
    }
    
}
