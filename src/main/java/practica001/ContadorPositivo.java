package practica001;

public class ContadorPositivo {
    private int largo;

    public ContadorPositivo() {
        this.largo = Constante.Valores.Zero;
    }

    public int ObtieneLargo() {
        return this.largo;
    }

    public void AgregaNumero(float valor) {
        Numero numero = new Numero(valor);
        if(numero.DeterminaValor().equals(Constante.SignoValor.Positivo.toString())){
            this.largo++;
        }
    }
}
