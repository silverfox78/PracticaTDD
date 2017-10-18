package practica001;

import org.junit.Assert;
import org.junit.Test;

public class HumanoTest {
    @Test
    public void ValidaQueExistaLaInstancia(){
        Humano humano = new Humano("Tito");
        Assert.assertTrue(humano.getNombre() == "Tito");
    }

    @Test(expected = IllegalArgumentException.class)
    public void  QueElNombreSeaValido(){
        Humano humano = new Humano(null);
    }

    @Test
    public void ElSerHumanoSaluda(){
        Humano humano = new Humano("Tito");
        String saludos = humano.Saludo();
        Assert.assertTrue(saludos.equals("Hola, soy " + humano.getNombre()));
    }
}
