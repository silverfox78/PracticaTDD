package practica001;

import org.junit.Assert;
import org.junit.Test;

public class TrianguloTest {
    @Test
    public void GeneraInstanciaConUno(){
        Triangulo triangulo = new Triangulo(Constante.Valores.Uno, Constante.Valores.Uno, Constante.Valores.Uno);
        Assert.assertTrue(triangulo.getLadoA() == Constante.Valores.Uno);
        Assert.assertTrue(triangulo.getLadoB() == Constante.Valores.Uno);
        Assert.assertTrue(triangulo.getLadoC() == Constante.Valores.Uno);
    }

    @Test(expected = IllegalArgumentException.class)
    public void GeneraInstanciaConZero(){
        Triangulo triangulo = new Triangulo(Constante.Valores.Zero, Constante.Valores.Zero, Constante.Valores.Zero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void GeneraInstanciaConNegativos(){
        Triangulo triangulo = new Triangulo(Constante.Valores.MenosUno, Constante.Valores.MenosUno, Constante.Valores.MenosUno);
    }

    @Test
    public void ObtienePerimetro() {
        Triangulo triangulo = new Triangulo(Constante.Valores.Uno, Constante.Valores.Uno, Constante.Valores.Uno);
        float perimetro = triangulo.Perimetro();
        Assert.assertTrue(perimetro == Constante.Valores.Tres);
    }
}
