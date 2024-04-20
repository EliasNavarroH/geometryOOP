/*Creamos la primera clasa abstracta, esto quiere decir que aunque tenga metodos, atributos getters y setters, 
estos no se van a poder instanciar (por ejemplo new Figura) solo podran ser heredados a la clase hijo */

public abstract class Figura {// A TENER EN CUENTA: Siempre el abstract va delante del public y antes del
                              // class
    protected String nombre;

    protected Figura(String nombre) {
        this.nombre = nombre;
    }

    protected String getNombre() {
        return this.nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected abstract double calcularArea(); // Al ser la clase abstracta el o los metodos quse declaran solo van con
                                              // el tipo de dato y se finaliza con ;

}