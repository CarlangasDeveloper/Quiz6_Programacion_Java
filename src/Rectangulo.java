package src;

/**
 * Clase Rectangulo que hereda de FiguraGeometrica.
 */
public class Rectangulo extends FiguraGeometrica {
    /**
     * Atributos:
     */
    private double lado1;
    private double lado2;

    /**
     * Constructor de la clase Rectangulo.
     *
     * @param lado1 lado número uno.
     * @param lado2 lado número dos.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Método para obtener el lado uno del Rectangulo.
     *
     * @return devuelve el lado uno.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * Método para agregar el lado uno del Rectangulo.
     *
     * @param lado1 lado uno del rectangulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * Método para obtener el lado dos del Rectangulo.
     *
     * @return  devuelve el lado dos.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * Método para agregar el lado uno del Rectangulo.
     *
     * @param lado2 lado dos del rectangulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * Método para obtener el area del Rectangulo.
     *
     * @return devuelve el area.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea(){
        return lado1 * lado2;
    }

    /**
     * Método para obtener el perimetro del Rectangulo.
     *
     * @return devuelve el perimetro.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro(){
        return 2 * (lado1 + lado2);
    }
}