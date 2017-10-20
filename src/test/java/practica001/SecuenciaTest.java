package practica001;

import org.junit.Assert;
import org.junit.Test;

public class SecuenciaTest {
    @Test
    public void ValidaExistenciaDeLaInstancia(){
        Secuencia secuencia = new Secuencia();
        Assert.assertTrue(secuencia.getUltimoValor() == Constante.Valores.Zero);
        Assert.assertTrue(secuencia.PuedeSeguir());
        Assert.assertTrue(secuencia.Producto() == Constante.Valores.Zero);
        Assert.assertTrue(secuencia.getContador() == Constante.Valores.Zero);
    }

}
