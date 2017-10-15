package practica001;

public class Triangulo {
    private float ladoA;
    private float ladoB;
    private float ladoC;

    public Triangulo(float ladoA, float ladoB, float ladoC) {
        this.setLadoA(ladoA);
        this.setLadoB(ladoB);
        this.setLadoC(ladoC);
    }

    public float getLadoA() {
        return ladoA;
    }

    private void setLadoA(float ladoA) {
        this.ladoA = this.ValidaNumeroNegativo(ladoA);
    }

    public float getLadoB() {
        return ladoB;
    }

    private void setLadoB(float ladoB) {
        this.ladoB = this.ValidaNumeroNegativo(ladoB);
    }

    public float getLadoC() {
        return ladoC;
    }

    private void setLadoC(float ladoC) {
        this.ladoC = this.ValidaNumeroNegativo(ladoC);
    }

    private float ValidaNumeroNegativo(float valor){
        int diferencia = Float.compare(valor, practica001.Constante.Valores.Zero);

        if(diferencia <= 0){
            throw new IllegalArgumentException(Constante.MensajeError.TrianguloArgumentoError);
        }

        return valor;
    }

    public float Perimetro() {
        return this.ladoA + this.ladoB + this.ladoC;
    }
}
