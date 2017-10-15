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
     * Metodo que evalua si al iniciar la instancia el valor del numero queda en cero
     * @throws Exception En caso de algun error incontrolado por la evaluacion
     */
    @Test
    public void PoseeValorInicialEnZero() throws Exception{
        Numero numero = new Numero();
        Assert.assertEquals(numero.getValor(), 0);
    }
}