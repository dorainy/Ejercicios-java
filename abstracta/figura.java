package abstracta;

public abstract class figura {

    protected double x;
    
    protected double y;

    protected figura(){

    }
    protected figura(double x, double y){
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();

}
