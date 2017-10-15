package practica001;

/**
 * Clase destinada a contener un numero y las evaluaciones del mismo
 */
public class Numero {

    /**
     * Valor del numero
     */
    private int valor;

    /**
     * Valor inicial por defecto
     */
    private static final int Zero = 0;

    /**
     * Constructor por defecto de la instancia
     */
    public Numero() {
        this.valor = Zero;
    }

    /**
     * Propiedad de la variable numero, permite recuperar el valor de numero
     * @return valor del numero
     */
    public int getValor() {
        return this.valor;
    }
}
