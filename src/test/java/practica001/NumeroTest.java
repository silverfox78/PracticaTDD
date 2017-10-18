package practica001;

import org.junit.Assert;
import org.junit.Test;

/**
 * Clase de prueba de la clase [Numero]
 */
public class NumeroTest {
    /**
     * Variable de la instancia de numero
     */
    private Numero numero;

    /**
     * Metodo que evalua si al iniciar la instancia el valor del numero queda en cero
     */
    @Test
    public void PoseeValorInicialEnZero(){
        /* Generamos la instancia*/
        this.GeneraInstancia(true, null, null);

        /* Comparamos los resultados */
        Assert.assertTrue(this.numero.getValor() == practica001.Constante.Valores.Zero);
    }

    /**
     * Metodo que evalua si al iniciar en uno la instancia toma este valor
     */
    @Test
    public void PoseeValorInicialEnUno(){
        /* Generamos la instancia*/
        this.GeneraInstancia(true, null, practica001.Constante.Valores.Uno);

        /* Comparamos los resultados */
        Assert.assertTrue(this.numero.getValor() == practica001.Constante.Valores.Uno);
    }

    /**
     * Metodo que evalua si al iniciar la instancia por defecto, luego podemos cambiar su valor
     */
    @Test
    public void IniciaPorDefectoYCambiaAUno(){
        /* Generamos la instancia*/
        this.GeneraInstancia(true, null, practica001.Constante.Valores.Uno);

        /* Comparamos los resultados */
        Assert.assertTrue(this.numero.getValor() == practica001.Constante.Valores.Uno);
    }

    /**
     * Metodo que evalua si al iniciar una instancia en un valor, este puede cambiarse
     */
    @Test
    public void IniciaEnUnoYCambiaAZero(){
        /* Generamos la instancia*/
        this.GeneraInstancia(false, practica001.Constante.Valores.Uno, practica001.Constante.Valores.Zero);

        /* Comparamos los resultados */
        Assert.assertTrue(this.numero.getValor() == practica001.Constante.Valores.Zero);
    }

    /**
     * Metodo que evalua si el valor es positivo
     */
    @Test
    public void DetermiaQueElValorEsPositivo(){
        /* Generamos la instancia*/
        this.GeneraInstancia(false, practica001.Constante.Valores.Uno,null);

        /* Comparamos los resultados */
        Assert.assertTrue(this.numero.DeterminaValor() == Constante.SignoValor.Positivo.toString());
    }

    /**
     * Metodo que evalua si el valor es negativo
     */
    @Test
    public void DetermiaQueElValorEsNegativo(){
        /* Generamos la instancia*/
        this.GeneraInstancia(false, Constante.Valores.MenosUno,null);

        /* Comparamos los resultados */
        Assert.assertTrue(this.numero.DeterminaValor() == Constante.SignoValor.Negativo.toString());
    }

    /**
     * Metodo que evalua si el valor es cero
     */
    @Test
    public void DetermiaQueElValorEsZero(){
        /* Generamos la instancia*/
        this.GeneraInstancia(false, Constante.Valores.Zero,null);

        /* Comparamos los resultados */
        Assert.assertTrue(this.numero.DeterminaValor() == Constante.SignoValor.Cero.toString());
    }

    /**
     * Metodo que genera la instancia del objeto
     * @param inicioDefecto determina si inicia por defecto o con determinado valor
     * @param valor de inicio de la instancia
     * @param nuevoValor de la instancia
     */
    private void GeneraInstancia(boolean inicioDefecto, Object valor, Object nuevoValor){
        if (inicioDefecto) {
            this.numero = new Numero();
        } else {
            this.numero = new Numero(Float.parseFloat(valor.toString()));
        }

        if (nuevoValor!= null){
            this.numero.setValor(Float.parseFloat(nuevoValor.toString()));
        }
    }
}