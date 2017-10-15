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
    private float valor;

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
    public Numero(float valor) {
        this.valor = valor;
    }

    /**
     * Propiedad de la variable numero, permite recuperar el valor de numero
     * @return valor del numero
     */
    public float getValor() {
        return this.valor;
    }

    /**
     * Permite asignar un valor al numero
     * @param valor - nuevo valor del numero
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    public String DeterminaValor() {
        String retorno = "Error";

        if (this.valor > Zero){
            retorno = "Positivo";
        }
        return retorno;
    }
}
