package practica001;

public class Sumatoria {
    private static final String MensajeErrorArgumento = "Debe ingresar un valor entero postivo mayor a cero.";

    private int valorTermino;

    public Sumatoria(int valorTermino) {
        if(valorTermino <= Constante.Valores.Zero){
            throw new IllegalArgumentException(MensajeErrorArgumento);
        }

        this.valorTermino = valorTermino;
    }

    public int getValorTermino() {
        return this.valorTermino;
    }

    public int ObtieneResultado() {
        Numero numero = new Numero(Constante.Valores.Zero);

        for (int i = 1; i <= this.valorTermino; i++){
            numero = new Numero(numero.getValor() + i);
        }

        return (int) numero.getValor();
    }

    public int ObtieneResultadoV2() {
        int numero = 0;

        for (int i = 1; i <= this.valorTermino; i++){
            numero += i;
        }

        return numero;
    }
}
