public class Circulo extends Figura{

    private double radio;
    private final double PI = Math.PI;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public double getPi() {
        return PI;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    protected double calcularArea() {
        return this.PI*this.radio*this.radio;
    }

    @Override
    public String toString(){
       return "Nombre de la figura: " + getNombre() + " Area de la figura: " + this.calcularArea();
    }

}
