package abstracta;

public class circulo extends figura {

    
    private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    public circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi*radio;
        return resultado;
    }
    
}
