public class Triangulo extends Figura {
    private double base, altura;
    
    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    protected double calcularArea() {
        return (this.base*this.altura)/2;
    }

    
}
