package practica001;

public class Secuencia {
    private int ultimoValor;
    private boolean seguir;
    private int producto;
    private int contador;

    public Secuencia(){
        this.ultimoValor = Constante.Valores.Zero;
        this.seguir = true;
        this.producto = Constante.Valores.Zero;
        this.contador = Constante.Valores.Zero;
    }

    public int getUltimoValor() {
        return this.ultimoValor;
    }

    public boolean PuedeSeguir() {
        return this.seguir;
    }

    public int Producto() {
        return this.producto;
    }

    public int getContador() {
        return this.contador;
    }
}
