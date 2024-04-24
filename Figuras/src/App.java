import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int cantMaxFiguras;
        // Aca deberia configurar el tamaño que va a tener mi array
        System.out.println("Cuantas figuras deseas cargar ? ");
        cantMaxFiguras = input.nextInt();
        input.nextLine();
        Figura figuras[] = new Figura[cantMaxFiguras]; // creo en base a figura un array de figuras y le coloco la
                                                       // longitud que tendra
        int figuraActual = 0;
        int opcion = 0;
        while (opcion != 3) {
            menuPrincipal();
            opcion = input.nextInt();
            input.nextLine();
            switch (opcion) {
                case 1:
                    figuraActual = cargarFigura(input, figuras, figuraActual, cantMaxFiguras);
                break;
                case 2:
                    mostrarFiguras(figuras, figuraActual);
                break;
                case 3:
                    figuras = eliminarFigura(figuras);
                break;
                case 4:
                break;
                case 5:
                    System.out.println("=============================");
                    System.out.println("Hasta Luego");
                    System.out.println("=============================");
                break;
                default:
                    System.out.println("=============================");
                    System.out.println("Hasta Luego");
                    System.out.println("=============================");
                break;

            }
        }
    }

    public static void menuPrincipal() {
        System.out.println("Bienvenido al ingreso de figuras, que deseas hacer ?");
        System.out.println("====================================================");
        System.out.println("1)Ingresar figura");
        System.out.println("2)Mostrar figuras");
        System.out.println("3)Salir");
        System.out.println("=====================================================");

    }

    public static int cargarFigura(Scanner input, Figura figuras[], int figuraActual, int cantMaxFiguras) {
        System.out.println("Que figura deseas cargar ?");
        System.out.println("a)Circulo");
        System.out.println("b)Rectangulo");
        System.out.println("c)Triangulo");

        if (figuraActual < cantMaxFiguras) {
            char opcion = input.next().charAt(0);
            switch (opcion) {
                case 'a':
                    figuras[figuraActual] = cargarCirculo(input);
                    figuraActual++;
                    break;
                case 'b':
                    figuras[figuraActual] = cargarRectangulo(input);
                    figuraActual++;
                    break;
                case 'c':
                    figuras[figuraActual] = cargarTriangulo(input);
                    figuraActual++;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } else {
            System.out.println("===================================================");
            System.out.println("La cantidad de figuras supera el tamaño de la lista");
            System.out.println("===================================================");
        }
        return figuraActual;
    }

    public static Circulo cargarCirculo(Scanner input) {
        Circulo circulo = new Circulo(" ", 0);
        System.out.println("Ingresa el nombre del circulo: ");
        circulo.setNombre(input.nextLine());
        input.nextLine();
        System.out.println("Ingresa el radio del circulo: ");
        circulo.setRadio(input.nextDouble());
        input.nextLine();
        return circulo;
    }

    public static Rectangulo cargarRectangulo(Scanner input) {
        Rectangulo rectangulo = new Rectangulo(" ", 0, 0);
        System.out.println("Ingresa el nombre del rectangulo: ");
        rectangulo.setNombre(input.nextLine());
        input.nextLine();
        System.out.println("Ingresa la base: ");
        rectangulo.setBase(input.nextDouble());
        input.nextLine();
        System.out.println("Ingresa la altura: ");
        rectangulo.setAltura(input.nextDouble());
        input.nextLine();
        return rectangulo;
    }

    public static Triangulo cargarTriangulo(Scanner input) {
        Triangulo triangulo = new Triangulo(" ", 0, 0);
        System.out.println("Ingresa el nombre del triangulo: ");
        triangulo.setNombre(input.nextLine());
        input.nextLine();
        System.out.println("Ingresa la base: ");
        triangulo.setBase(input.nextDouble());
        input.nextLine();
        System.out.println("Ingresa la altura: ");
        triangulo.setAltura(input.nextDouble());
        input.nextLine();
        return triangulo;
    }

    public static void mostrarFiguras(Figura figuras[], int figuraActual) {
        for (int i = 0; i < figuraActual; i++) {
            System.out.println(figuras[i].toString());
        }
    }


    public static Figura[] eliminarFigura(Figura[] figuras){
        if (figuras.length == 0 || figuras == null) {
            return figuras;
        }
        Figura [] nuevasFiguras = new Figura[figuras.length - 1];

        for(int i = 0; i < nuevasFiguras.length ;i++){
            nuevasFiguras[i] = figuras[i];
        }
        return nuevasFiguras;
    }


}
