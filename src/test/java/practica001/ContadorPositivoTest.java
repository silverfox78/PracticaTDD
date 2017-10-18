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
}
