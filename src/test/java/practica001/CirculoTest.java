package practica001;

import org.junit.Assert;
import org.junit.Test;
import practica001.Circulo;
import practica001.Constante;

public class CirculoTest {
    @Test
    public void QueLaInstanciaTengaUnRadio(){
        Circulo circulo = new Circulo(Constante.Valores.Uno);
        Assert.assertTrue(circulo.getRadio() == Constante.Valores.Uno);
    }

}
