package practica001;

import org.junit.Assert;
import org.junit.Test;

public class MasaMoscularTest {
    @Test
    public void ValidaQueExistaLaInstancia(){
        MasaMuscular masaMuscular = new MasaMuscular(Constante.Valores.Uno, Constante.Valores.Uno);
        Assert.assertTrue(masaMuscular.getKilos() == Constante.Valores.Uno && masaMuscular.getMetros() == Constante.Valores.Uno);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ValidaQueElPesoSeaUnValorValido(){
        MasaMuscular masaMuscular = new MasaMuscular(Constante.Valores.Zero, Constante.Valores.Uno);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ValidaQueLaAlturaSeaUnValorValido(){
        MasaMuscular masaMuscular = new MasaMuscular(Constante.Valores.Uno, Constante.Valores.Zero);
    }

    @Test
    public void ValidaQueElIMMSeaUno(){
        MasaMuscular masaMuscular = new MasaMuscular(Constante.Valores.Uno, Constante.Valores.Uno);
        Assert.assertTrue(masaMuscular.ObtieneIndice() == Constante.Valores.Uno);
    }
}
