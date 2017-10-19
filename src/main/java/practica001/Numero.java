package practica001;

/**
 * Clase destinada a contener un numero y las evaluaciones del mismo
 */
public class Numero {
    /**
     * Valor del numero
     */
    private float valor;

    /**
     * Constructor por defecto de la instancia
     */
    public Numero() { this.valor = practica001.Constante.Valores.Zero; }

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

    /**
     * Metodo destinado a determinar los valores de signo posibles de un numero
     * @return signo del valores numerico
     */
    public String DeterminaValor() {
        /* determina el signo del numero */
        int diferencia = Float.compare(this.valor, practica001.Constante.Valores.Zero);

        if (diferencia == practica001.Constante.Valores.Zero) {
            return Constante.SignoValor.Cero.toString();
        } else if (diferencia > practica001.Constante.Valores.Zero){
            return Constante.SignoValor.Positivo.toString();
        } else {
            return Constante.SignoValor.Negativo.toString();
        }
    }

    public float ValorAbsoluto() {
        return java.lang.Math.abs(this.valor);
    }
}
