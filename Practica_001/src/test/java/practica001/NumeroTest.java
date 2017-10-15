package practica001;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumeroTest {
    @Test
    public void PoseeValorInicialEnZero() throws Exception{
        Numero numero = new Numero();
        Assert.assertEquals(numero.getValor(), 0);
    }
}