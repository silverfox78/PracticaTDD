package practica001;

import org.junit.Assert;
import org.junit.Test;

/**
 * Clase de prueba de la clase [Triangulo]
 */
public class TrianguloTest {

    /**
     * Metodo destinado a evaluar la generacion de una instancia de un triangulo iniciando sus valores en uno
     */
    @Test
    public void GeneraInstanciaConUno(){
        Triangulo triangulo = new Triangulo(Constante.Valores.Uno, Constante.Valores.Uno, Constante.Valores.Uno);
        Assert.assertTrue(triangulo.getLadoA() == Constante.Valores.Uno);
        Assert.assertTrue(triangulo.getLadoB() == Constante.Valores.Uno);
        Assert.assertTrue(triangulo.getLadoC() == Constante.Valores.Uno);
    }

    /**
     * Metodo destinado a evaluar un error ante ingresar valores cero en la instancia
     */
    @Test(expected = IllegalArgumentException.class)
    public void GeneraInstanciaConZero(){
        Triangulo triangulo = new Triangulo(Constante.Valores.Zero, Constante.Valores.Zero, Constante.Valores.Zero);
    }

    /**
     * Metodo destinado a evaluar un error ante ingresar valores negativos en la instancia
     */
    @Test(expected = IllegalArgumentException.class)
    public void GeneraInstanciaConNegativos(){
        Triangulo triangulo = new Triangulo(Constante.Valores.MenosUno, Constante.Valores.MenosUno, Constante.Valores.MenosUno);
    }

    /**
     * Metodo dispuesto a evaluar la obtencion del perimetro de la instancia
     */
    @Test
    public void ObtienePerimetro() {
        Triangulo triangulo = new Triangulo(Constante.Valores.Uno, Constante.Valores.Uno, Constante.Valores.Uno);
        float perimetro = triangulo.Perimetro();
        Assert.assertTrue(perimetro == Constante.Valores.Tres);
    }
}
