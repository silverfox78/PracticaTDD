# Ejercicio N°4

Hallar el índice de **masa muscular IMM** (busque la formula) de una persona.

---

La formula de masa moscular es: **Peso dividido por la altura al cuadrado.** 

***(kilogramos / metros^2)***

---

## Casos de prueba

1. Requerimos verificar la existencia del objeto, en este caso se identifica el objeto [**Masa Moscular**] y para el, se determinan dos atributos, el peso (**kilos**) y la altura (**metros**).
2. Se debe validar que ante un peso menor o igual a cero, esto genere un error.
3. Se debe validar que ante una altura menor o igual a cero, esto genere un error.
4. Se valida que ante un peso con valor uno y una altura uno, la masa moscular debe dar uno

---

Esto genera el siguiente grupo de pruebas

En [**MasaMoscularTest.java**]
```java
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
```

---

Esto genera el siguiente codigo

En [**MasaMoscular.java**]
```java
package practica001;

public class MasaMuscular {
    private static final String MensajeErrorKilos = "El valor de los kilos ingresado es invalido, debe ser un valor superior a cero.";
    private static final String MensajeErrorMetros = "El valor de los metros ingresado es invalido, debe ser un valor superior a cero.";
    private float metros;
    private float kilos;

    public MasaMuscular(float kilos, float metros) {
        if(kilos <= Constante.Valores.Zero){
            throw new IllegalArgumentException(MensajeErrorKilos);
        }

        if(metros <= Constante.Valores.Zero){
            throw new IllegalArgumentException(MensajeErrorMetros);
        }

        this.kilos = kilos;
        this.metros = metros;
    }

    public float getKilos() {
        return this.kilos;
    }

    public float getMetros() {
        return this.metros;
    }

    public float ObtieneIndice(){
        return this.kilos / (this.metros * this.metros);
    }
}
```