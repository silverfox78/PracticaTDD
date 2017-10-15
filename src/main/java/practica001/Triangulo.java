package practica001;

public class Triangulo {
    private float ladoA;
    private float ladoB;
    private float ladoC;

    public Triangulo(float ladoA, float ladoB, float ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public float getLadoA() {
        return ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public float getLadoC() {
        return ladoC;
    }
}
