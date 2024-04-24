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
        // Agregar metodo Math para redondear 
    }
    @Override
    public String toString(){
       return "Nombre de la figura: " + this.nombre + " Area de la figura: " + this.calcularArea();
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Triangulo t = (Triangulo) obj;
        return this.altura == t.altura && this.base == t.base;
    }
       
}
