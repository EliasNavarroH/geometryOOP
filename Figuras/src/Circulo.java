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
        return Math.round(this.PI*this.radio*this.radio);
    }

    @Override
    public String toString(){
       return "Nombre del circulo: " + this.nombre + " Area: " + this.calcularArea();
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) { /*en este if lo que se hace es comparar si las dos direcciones que le envio, el objeto que utilizo en .equals y 
            el parametro estan en la misma direccion de memoria */
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Circulo c = (Circulo) obj;
        return this.radio == c.radio;
    }

}
