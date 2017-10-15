package practica001;

/**
 * Clase destinada a contener un numero y las evaluaciones del mismo
 */
public class Numero {

    /**
     * Valor inicial por defecto
     */
    private static final int Zero = 0;
    /**
     * Valor del numero
     */
    private int valor;

    /**
     * Constructor por defecto de la instancia
     */
    public Numero() {
        this.valor = Zero;
    }

    /**
     * Constructor de la instancia
     * @param valor - valor que se le asignara a la instancia
     */
    public Numero(int valor) {
        this.valor = valor;
    }

    /**
     * Propiedad de la variable numero, permite recuperar el valor de numero
     * @return valor del numero
     */
    public int getValor() {
        return this.valor;
    }

    /**
     * Permite asignar un valor al numero
     * @param valor - nuevo valor del numero
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
}
