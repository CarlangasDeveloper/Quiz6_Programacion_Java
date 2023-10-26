package src;

/**
 * Clase Triangulo que hereda de FiguraGeometrica.
 */
public class Triangulo extends FiguraGeometrica {
    /**
     * Atributos:
     */
    private double base;
    private double altura;

    /**
     * Constructor de la clase Triangulo.
     *
     * @param base  base del triangulo.
     * @param altura altura del triangulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método para obtener el area del Triangulo.
     *
     * @return devuelve el area del triangulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea(){
        return 0.5 * base * altura;
    }

    /**
     * Método para obtener el perimetro del Triangulo.
     *
     * @return devuelve el perimetro del triangulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro(){
        return  base + base + base;
    }
}
