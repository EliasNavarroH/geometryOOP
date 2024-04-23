import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int cantMaxFiguras;
        //Aca deberia configurar el tamaño que va a tener mi array 
        System.out.println("Cuantas figuras deseas cargar ? ");
        cantMaxFiguras = input.nextInt();
        Figura figuras [] = new Figura[cantMaxFiguras]; // creo en base a figura un array de figuras y le coloco la longitud que tendra 
        int figuraActual = 0; 
        char opcion = '0';
        while (opcion!=3) {
            menuPrincipal();
            opcion = input.nextLine().charAt(0);
            switch (opcion) {
                case '1':
                    figuraActual = cargarFigura();
                    break;
                case '2':

                    break;
                case '3':

                    break;
                
            }
        }
    }

    public static void menuPrincipal(){
        System.out.println("Bienvenido al ingreso de figuras, que deseas hacer ?");
        System.out.println("====================================================");
        System.out.println("1)Ingresar figura");
        System.out.println("2)Mostrar figuras");
        System.out.println("3)Salir");
        System.out.println("=====================================================");

    }

    public static int cargarFigura(Scanner input, Figura figuras[], int figuraActual, int cantMaxFiguras){
        System.out.println("Que figura deseas cargar ?");
        System.out.println("a)Circulo");
        System.out.println("b)Rectangulo");
        System.out.println("c)Triangulo");

        if (figuraActual<cantMaxFiguras) {
            char opcion = input.nextLine().charAt(0);
            switch (opcion) {
                case 'a':
                    figuras [figuraActual] = cargarCirculo(input);
                    figuraActual++;
                    break;
                case 'b':
                    figuras[figuraActual] = cargarRectangulo(input);
                    figuraActual++;
                    break;
                case 'c':
                    figuras[figuraActual] = cargarTriangulo(input);
                    figuraActual ++;
                    break;
                default:
                    break;
            }
        }else{
            System.out.println("===================================================");
            System.out.println("La cantidad de figuras supera el tamaño de la lista");
            System.out.println("===================================================");
        }
        return figuraActual;
    }


    public static Circulo cargarCirculo(Scanner input){
        Circulo circulo =  new Circulo(" ", 0);
        System.out.println("Ingresa el nombre del circulo: ");
        circulo.setNombre(input.nextLine());
        System.out.println("Ingresa el radio del circulo: ");
        circulo.setRadio(input.nextDouble());
        return circulo;
    }
    
    public static Rectangulo cargarRectangulo(Scanner input){
        Rectangulo rectangulo = new Rectangulo(" ", 0, 0);
        System.out.println("Ingresa el nombre del rectangulo: ");
        rectangulo.setNombre(input.nextLine());
        System.out.println("Ingresa la base: ");
        rectangulo.setBase(input.nextDouble());
        System.out.println("Ingresa la altura: ");
        rectangulo.setAltura(input.nextDouble());
        return rectangulo;
    }

    public static Triangulo cargarTriangulo(Scanner input){
        Triangulo triangulo = new Triangulo(" ", 0, 0);
        System.out.println("Ingresa el nombre del triangulo: ");
        triangulo.setNombre(input.nextLine());
        System.out.println("Ingresa la base: ");
        triangulo.setBase(input.nextDouble());
        System.out.println("Ingresa la altura: ");
        triangulo.setAltura(input.nextDouble());
        return triangulo;
    }
}

