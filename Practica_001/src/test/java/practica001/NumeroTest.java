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
    private static final int Zero = 0;

    /**
     * Valor tentativo de Uno
     */
    private static final int Uno = 1;

    /**
     * Metodo que evalua si al iniciar la instancia el valor del numero queda en cero
     */
    @Test
    public void PoseeValorInicialEnZero(){
        /* Generamos la instancia*/
        Numero numero;

        /* Inciamos la instancia */
        numero = new Numero();

        /* Comparamos los resultados */
        Assert.assertEquals(numero.getValor(), Zero);
    }

    /**
     * Metodo que evalua si al iniciar en uno la instancia toma este valor
     */
    @Test
    public void PoseeValorInicialEnUno(){
        /* Generamos la instancia*/
        Numero numero;

        /* Inciamos la instancia */
        numero = new Numero(Uno);

        /* Comparamos los resultados */
        Assert.assertEquals(numero.getValor(), Uno);
    }

    /**
     * Metodo que evalua si al iniciar la instancia por defecto, luego podemos cambiar su valor
     */
    @Test
    public void IniciaPorDefectoYCambiaAUno(){
        /* Generamos la instancia*/
        Numero numero;

        /* Inciamos la instancia */
        numero = new Numero();

        /* Asignamos un nuevo valor a la instancia */
        numero.setValor(Uno);

        /* Comparamos los resultados */
        Assert.assertEquals(numero.getValor(), Uno);
    }

    /**
     * Metodo que evalua si al iniciar una instancia en un valor, este puede cambiarse
     */
    @Test
    public void IniciaEnUnoYCambiaAZero(){
        /* Generamos la instancia*/
        Numero numero;

        /* Inciamos la instancia */
        numero = new Numero(Uno);

        /* Asignamos un nuevo valor a la instancia */
        numero.setValor(Zero);

        /* Comparamos los resultados */
        Assert.assertEquals(numero.getValor(), Zero);
    }
}