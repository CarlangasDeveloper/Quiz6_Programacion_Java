package src;

/**
 * Clase Circulo que hereda de FiguraGeometrica.
 */
public class Circulo extends FiguraGeometrica {

    /**
     * Atributos:
     */
    private double radio;

    /**
     * Constructor de la clase Circulo.
     *
     * @param nombre
     * @param color
     * @param radio
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    /**
     * Método para obtener el radio del circulo.
     *
     * @return  devuelve el radio del circulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Método para agregar el radio del circulo.
     *
     * @param radio radio del  circulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Método para obtener el area del circulo.
     *
     * @return  devuleve el area del circulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea(){
        return Math.PI * radio * radio;
    }

    /**
     * Método para obtener el perimetro del circulo.
     *
     * @return  devuelve el perimetro del circulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro(){
        return 2 * Math.PI * radio;
    }
}
