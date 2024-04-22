import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Circulo circulo1 = new Circulo("Circulo", 44.5);
        // Rectangulo rectangulo1 = new Rectangulo("Rectangulo", 30, 40);
        // Triangulo triangulo1 = new Triangulo("Triangulo", 50, 70);
        Scanner input = new Scanner(System.in);
        Figura figuras[] = new Figura[3];
        int menu, menuDos;
        double radio, base, altura, baseTri, alturaTri;
        // MENU GENERAL
        // ==========================================================================
        while (true) {
            System.out.println("Que deseas hacer? ");
            System.out.println("1)Cargar figuras");
            System.out.println("2)Mostrar figuras");
            System.out.println("3)Salir");
            System.out.println("====================");
            menu = input.nextInt(); 
            if (menu == 1) {
                System.out.println("Que figuras deseas cargar ?");
                System.out.println("1)Circulo ");
                System.out.println("2)Rectangulo ");
                System.out.println("3)Triangulo ");
                menuDos = input.nextInt();
                // MENU INTERNO PARA CARGAR LAS FIGURAS
                // =========================================================================
                while (true) {
                    if (menuDos == 1) {
                        System.out.println("Ingrese el radio del circulo: ");
                        radio = input.nextDouble();
                        Circulo c1 = new Circulo("Circulo", radio);
                        figuras[0] = c1;
                        break;
                    } else if (menuDos == 2) {
                        System.out.println("Ingresa la base y la altura del rectangulo: ");
                        base = input.nextDouble();
                        altura = input.nextDouble();
                        Rectangulo r1 = new Rectangulo("Rectangulo", base, altura);
                        figuras[1] = r1;
                        break;
                    } else if (menuDos == 3) {
                        System.out.println("Ingrese la base y la altura del triangulo: ");
                        baseTri = input.nextDouble();
                        alturaTri = input.nextDouble();
                        Triangulo t1 = new Triangulo("Triangulo", baseTri, alturaTri);
                        figuras[2] = t1;
                        break;
                    } else {
                        System.out.println("Por favor ingrese un numero valido: ");
                    }

                }
            }
            // ACA SIGUE EL MENU GENERAL
            // ===============================================================================
            else if (menu == 2) {
                for (int i = 0; i < 3; i++) {
                    System.out.println(
                            "El area de la figura " + figuras[i].nombre + " es de " + figuras[i].calcularArea());
                }
                break;
            } else if (menu == 3) {
                System.out.println("Gracias por elegir la figura App !");
                System.out.println("===================================");
                break;
            } else {
                System.out.println("Ingrese un numero valido: ");
            }

        }

        // System.out.println("El Area del circulo es " + circulo1.calcularArea());
        // System.out.println("El Area del rectangulo es " +
        // rectangulo1.calcularArea());
        // triangulo1.calcularArea();

        input.close();
    }
}
