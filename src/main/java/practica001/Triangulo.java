package practica001;

/**
 * Clase dispuesta para las operaciones sobre el triangulo
 */
public class Triangulo {
    /**
     * Variable del lado A del triangulo
     */
    private float ladoA;

    /**
     * Variable del lado B del triangulo
     */
    private float ladoB;

    /**
     * Variable del lado C del triangulo
     */
    private float ladoC;

    /**
     * Constructor de la instancia
     * @param ladoA - Lado A del triangulo
     * @param ladoB - Lado B del triangulo
     * @param ladoC - Lado C del triangulo
     */
    public Triangulo(float ladoA, float ladoB, float ladoC) {
        this.setLadoA(ladoA);
        this.setLadoB(ladoB);
        this.setLadoC(ladoC);
    }

    /**
     * Obtiene el valor del lado A
     * @return - valor del lado A
     */
    public float getLadoA() {
        return this.ladoA;
    }

    /**
     * Metodo privado para setear y validar el valor del lado A
     * @param ladoA - valor del lado A
     */
    private void setLadoA(float ladoA) {
        this.ladoA = this.ValidaNumeroNegativo(ladoA);
    }

    /**
     * Obtiene el valor del lado B
     * @return - valor del lado B
     */
    public float getLadoB() {
        return this.ladoB;
    }

    /**
     * Metodo privado para setear y validar el valor del lado B
     * @param ladoB - valor del lado B
     */
    private void setLadoB(float ladoB) {
        this.ladoB = this.ValidaNumeroNegativo(ladoB);
    }

    /**
     * Obtiene el valor del lado C
     * @return - valor del lado C
     */
    public float getLadoC() {
        return this.ladoC;
    }

    /**
     * Metodo privado para setear y validar el valor del lado C
     * @param ladoC - valor del lado C
     */
    private void setLadoC(float ladoC) {
        this.ladoC = this.ValidaNumeroNegativo(ladoC);
    }

    /**
     * Metodo dispuesto para validar los parametros ingresados
     * @param valor - valor dispuesto para un lado
     * @return - valor evaluado
     */
    private float ValidaNumeroNegativo(float valor){
        int diferencia = Float.compare(valor, practica001.Constante.Valores.Zero);

        if(diferencia <= 0){
            throw new IllegalArgumentException(Constante.MensajeError.TrianguloArgumentoError);
        }

        return valor;
    }

    /**
     * Metodo dispuesto para obtener el perimetro del triangulo
     * @return - perimetro del triangulo
     */
    public float Perimetro() {
        return this.ladoA + this.ladoB + this.ladoC;
    }
}
