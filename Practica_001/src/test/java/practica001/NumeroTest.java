package practica001;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Clase de prueba de la clase [Numero]
 */
public class NumeroTest {
    /**
     * Valor inicial de una instancia por defecto (0)
     */
    private static final float Zero = 0;

    /**
     * Valor tentativo de Uno
     */
    private static final float Uno = 1;

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
        Assert.assertTrue(this.numero.getValor() == Zero);
    }

    /**
     * Metodo que evalua si al iniciar en uno la instancia toma este valor
     */
    @Test
    public void PoseeValorInicialEnUno(){
        /* Generamos la instancia*/
        this.GeneraInstancia(true, null, Uno);

        /* Comparamos los resultados */
        Assert.assertTrue(this.numero.getValor() == Uno);
    }

    /**
     * Metodo que evalua si al iniciar la instancia por defecto, luego podemos cambiar su valor
     */
    @Test
    public void IniciaPorDefectoYCambiaAUno(){
        /* Generamos la instancia*/
        this.GeneraInstancia(true, null, Uno);

        /* Comparamos los resultados */
        Assert.assertTrue(this.numero.getValor() == Uno);
    }

    /**
     * Metodo que evalua si al iniciar una instancia en un valor, este puede cambiarse
     */
    @Test
    public void IniciaEnUnoYCambiaAZero(){
        /* Generamos la instancia*/
        this.GeneraInstancia(false, Uno, Zero);

        /* Comparamos los resultados */
        Assert.assertTrue(this.numero.getValor() == Zero);
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