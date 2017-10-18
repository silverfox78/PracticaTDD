package practica001;

public class MasaMuscular {
    private static final String MensajeErrorKilos = "El valor de los kilos ingresado es invalido, debe ser un valor superior a cero.";
    private static final String MensajeErrorMetros = "El valor de los metros ingresado es invalido, debe ser un valor superior a cero.";
    private float metros;
    private float kilos;

    public MasaMuscular(float kilos, float metros) {
        if(kilos <= Constante.Valores.Zero){
            throw new IllegalArgumentException(MensajeErrorKilos);
        }

        if(metros <= Constante.Valores.Zero){
            throw new IllegalArgumentException(MensajeErrorMetros);
        }

        this.kilos = kilos;
        this.metros = metros;
    }

    public float getKilos() {
        return this.kilos;
    }

    public float getMetros() {
        return this.metros;
    }

    public float ObtieneIndice(){
        return this.kilos / (this.metros * this.metros);
    }
}
