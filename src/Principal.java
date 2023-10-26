package src;
import java.util.Scanner;

/**
 * Clase Principal.
 */
public class Principal {
    /**
     * Primer método que se ejecuta al correr el programa.
     *
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese el nombre de la figura
        System.out.print("Ingrese el nombre de la figura: ");
        String nombreFigura = sc.nextLine();

        // Pedir al usuario que ingrese el color de la figura
        System.out.print("Ingrese el color de la figura: ");
        String color = sc.nextLine();

        // Pedir al usuario que ingrese el tipo de figura (1: Círculo, 2: Rectángulo, 3: Triángulo)
        System.out.println("Ingrese el tipo de figura (1: Círculo, 2: Rectángulo, 3: Triángulo): ");
        int tipoFigura = sc.nextInt();

        // Declarar una variable figura de tipo FiguraGeometrica
        FiguraGeometrica figura = null;

        // Utilizar un switch para determinar el tipo de figura seleccionada por el usuario
        switch (tipoFigura) {
            case 1: // Círculo
                System.out.println("Ingrese el radio del círculo");
                double radio = sc.nextDouble();
                figura = new Circulo(nombreFigura, color, radio);
                break;
            case 2: // Rectangulo
                System.out.println("Ingrese el valor del lado 1 del rectángulo");
                double lado1 = sc.nextInt();
                System.out.println("Ingrese el valor del lado 2 del rectángulo");
                double lado2 = sc.nextFloat();
                figura = new Rectangulo(nombreFigura, color, lado1, lado2);
                break;
            case 3: // Triangulo
                System.out.println("Ingrese el valor de la base del triángulo");
                double base = sc.nextInt();
                System.out.println("Ingrese el valor de la altura del triángulo");
                double altura = sc.nextInt();
                figura = new Triangulo(nombreFigura, color, base, altura);
                break;
            default:
                System.out.println("Tipo de figura no válido");
                break;
        }

        // Verificar si se ha creado una figura válida
        if (figura != null) {
            // Calcular el área y el perímetro de la figura
            double area = figura.obtenerArea();
            double perimetro = figura.obtenerPerimetro();

            // Imprimir información sobre la figura
            System.out.println("Nombre de la figura: " + figura.getNombre());
            System.out.println("Color de la figura: " + figura.getColor());
            System.out.println("Área de la figura: " + area);
            System.out.println("Perímetro de la figura: " + perimetro);
        }
    }
}