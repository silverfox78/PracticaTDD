package practica001;

import org.junit.Assert;
import org.junit.Test;

public class SumatoriaTest {
    @Test
    public void ValidaQueSeGenereLaInstancia(){
        Sumatoria sumatoria = new Sumatoria((int) Constante.Valores.Uno);
        Assert.assertTrue(sumatoria.getValorTermino() == (int) Constante.Valores.Uno);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ValidaQueNoSeGenereUnaInstanciaConValorNegativo(){
        Sumatoria sumatoria = new Sumatoria((int) Constante.Valores.MenosUno);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ValidaQueNoSeGenereUnaInstanciaConValorCero(){
        Sumatoria sumatoria = new Sumatoria((int) Constante.Valores.Zero);
    }

    @Test
    public void ValidaResultadoSumatoriaDeUnTerminoEnUno(){
        Sumatoria sumatoria = new Sumatoria((int) Constante.Valores.Uno);
        Assert.assertTrue(sumatoria.ObtieneResultado() == (int) Constante.Valores.Uno);
    }

    @Test
    public void ValidaResultadoSumatoriaDeTresTerminoEnSeis(){
        Sumatoria sumatoria = new Sumatoria((int) Constante.Valores.Tres);
        Assert.assertTrue(sumatoria.ObtieneResultado() == (int) Constante.Valores.Seis);
    }
}
