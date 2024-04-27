import java.util.Scanner;

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
        while (opcion != 9) {
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
                    figuraActual = borrarUltimaFigura(figuras, figuraActual);
                    break;
                case 4:
                    if (figurasIguales(figuras, figuraActual)) {
                    } else
                        break;
                case 9:
                    System.out.println("=====================================================");
                    System.out.println("Hasta Luego");
                    System.out.println("=====================================================");

                    break;
                default:
                    System.out.println("=====================================================");
                    System.out.println("Por favor ingrese un valor correcto");
                    System.out.println("=====================================================");
                    break;

            }
        }
    }

    public static void menuPrincipal() {
        System.out.println("Bienvenido al ingreso de figuras, que deseas hacer ?");
        System.out.println("1)Ingresar figura.");
        System.out.println("2)Mostrar figuras.");
        System.out.println("3)Eliminar ultima figura.");
        System.out.println("4)Buscar figuras iguales.");
        System.out.println("9)Salir.");
        System.out.println("=====================================================");

    }

    public static int cargarFigura(Scanner input, Figura figuras[], int figuraActual, int cantMaxFiguras) {
        System.out.println("Que figura deseas cargar ?");
        System.out.println("A)Circulo.");
        System.out.println("B)Rectangulo.");
        System.out.println("C)Triangulo.");

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
            System.out.println(" ");
            System.out.println("===================================================");
            System.out.println("La cantidad de figuras supera el tamaño de la lista");
            System.out.println("===================================================");
            System.out.println(" ");
        }
        return figuraActual;
    }

    public static Circulo cargarCirculo(Scanner input) {
        Circulo circulo = new Circulo(" ", 0);
        System.out.println("Ingresa el nombre del circulo: ");
        input.nextLine();
        circulo.setNombre(input.nextLine());
        System.out.println("Ingresa el radio del circulo: ");
        circulo.setRadio(input.nextDouble());
        return circulo;
    }

    public static Rectangulo cargarRectangulo(Scanner input) {
        Rectangulo rectangulo = new Rectangulo(" ", 0, 0);
        System.out.println("Ingresa el nombre del rectangulo: ");
        input.nextLine();
        rectangulo.setNombre(input.nextLine());
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
        input.nextLine();
        triangulo.setNombre(input.nextLine());
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
            System.out.println(" ");
        }
    }

    private static int borrarUltimaFigura(Figura[] figuras, int figuraActual) {
        figuras[figuraActual - 1] = null; // con el menos 1 accede al ultimo array de la lista
        figuraActual--;
        return figuraActual;
    }

    private static boolean figurasIguales(Figura[] figuras, int figuraActual) {
        for (int i = 0; i < figuraActual; i++) {
            for (int j = 1; j < figuraActual; j++)
                if (figuras[i].equals(figuras[j])) {
                    System.out.print("La figura " + figuras[i] + " es igual a la figura " + figuras[j]);
                    return true;
                }
            System.out.println("No hay figuras iguales");
        }
        return false;
    }

}
