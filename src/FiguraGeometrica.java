package src;

/**
 * Clase para una figura geometrica.
 */
public class FiguraGeometrica {

    private String nombre;
    private String color;

    /**
     * Constructor de la clase.
     *
     * @param nombre    nombre de la figura geometrica.
     * @param color     color de la figura geometrica.
     *
     *  Complejidad temporal: O(1) Tiempo constante.
     */
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    /**
     * Método para obtener el area de la figura geometrica.
     *
     * @return  devuelve el valor del area.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerArea(){
         return 0.0;
     }

    /**
     * Método para obtener el perimetro de la figura geometrica.
     *
     * @return  devuelve el valor del perimetro.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerPerimetro(){
        return 0.0;
    }

    /**
     * Método para obtener el nombre de la figura geometrica.
     *
     * @return  devuelve el nombre de la figura geometrica.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para agregar el nombre de la figura geometrica.
     *
     * @param nombre    nombre de la figura geometrica.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el color de la figura geometrica.
     *
     * @return  devuelve el color de la figura.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public String getColor() {
        return color;
    }

    /**
     * Método para agregar el color de la figura geometrica.
     *
     * @param color color de la figura.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setColor(String color) {
        this.color = color;
    }
}
