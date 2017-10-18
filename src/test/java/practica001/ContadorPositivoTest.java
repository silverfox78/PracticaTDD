package practica001;

import org.junit.Assert;
import org.junit.Test;

public class ContadorPositivoTest {
    @Test
    public void QueElObjetoExista(){
        ContadorPositivo contador = new ContadorPositivo();
        Assert.assertTrue(contador.ObtieneLargo() == Constante.Valores.Zero);
    }

    @Test
    public void ValidarQueAlIngresarUnValorPositivoEnUnaInstanciaVaciaDebeSerUno(){
        ContadorPositivo contador = new ContadorPositivo();
        contador.AgregaNumero(Constante.Valores.Uno);
        Assert.assertTrue(contador.ObtieneLargo() == Constante.Valores.Uno);
    }

    @Test
    public void ValidarQueAlIngresarUnValorZeroEnUnaInstanciaVaciaDebeSerCero(){
        ContadorPositivo contador = new ContadorPositivo();
        contador.AgregaNumero(Constante.Valores.Zero);
        Assert.assertTrue(contador.ObtieneLargo() == Constante.Valores.Zero);
    }

    @Test
    public void ValidarQueAlIngresarUnValorNegativoEnUnaInstanciaVaciaDebeSerCero(){
        ContadorPositivo contador = new ContadorPositivo();
        contador.AgregaNumero(Constante.Valores.MenosUno);
        Assert.assertTrue(contador.ObtieneLargo() == Constante.Valores.Zero);
    }

    @Test
    public void ValidarQueTresPositivosDeTres(){
        ContadorPositivo contador = new ContadorPositivo();
        contador.AgregaNumero(Constante.Valores.Uno);
        contador.AgregaNumero(Constante.Valores.Uno);
        contador.AgregaNumero(Constante.Valores.Uno);
        Assert.assertTrue(contador.ObtieneLargo() == Constante.Valores.Tres);
    }

    @Test
    public void ValidarQueTresNumerosNoPositivosDeCero(){
        ContadorPositivo contador = new ContadorPositivo();
        contador.AgregaNumero(Constante.Valores.MenosUno);
        contador.AgregaNumero(Constante.Valores.Zero);
        contador.AgregaNumero(Constante.Valores.MenosUno);
        Assert.assertTrue(contador.ObtieneLargo() == Constante.Valores.Zero);
    }
}
