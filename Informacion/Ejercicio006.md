# Ejercicio N°6

Sumar los enteros desde 1 a ‘n’.

---

## Casos de prueba

1. Se requiere que valide la existencia de la instancia, en este caso se vizualiza el objeto [**Sumatoria**] con un atributo termino de la secuencia.
2. Se requiere que valide que no se instancie con un valor menor igual a cero.
3. Se requiere que el resultado de la sumatoria de una secuencia de un numero sea uno.
4. Se requiere que el resultado de la sumatoria de una secuencia de tres numeros de seis. 

---

Las pruebas que se generan son:

En [**SumatoriaTest.java**]
```java
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
```

---

El codigo generado es:

En [**Sumatoria.java**]
```java
package practica001;

public class Sumatoria {
    private static final String MensajeErrorArgumento = "Debe ingresar un valor entero postivo mayor a cero.";

    private int valorTermino;

    public Sumatoria(int valorTermino) {
        if(valorTermino <= Constante.Valores.Zero){
            throw new IllegalArgumentException(MensajeErrorArgumento);
        }

        this.valorTermino = valorTermino;
    }

    public int getValorTermino() {
        return this.valorTermino;
    }

    public int ObtieneResultado() {
        Numero numero = new Numero(Constante.Valores.Zero);

        for (int i = 1; i <= this.valorTermino; i++){
            numero = new Numero(numero.getValor() + i);
        }

        return (int) numero.getValor();
    }
}
```

---

## Alternativa

Otra forma mas sencilla de cubrir el requerimiento, pero sin pensar en un objeto sino en la funcionalidad seria con un metodo como el siguiente:

En [**Sumatoria.java**]
```java
    public int ObtieneResultadoV2() {
        int numero = 0;

        for (int i = 1; i <= this.valorTermino; i++){
            numero += i;
        }

        return numero;
    }
```