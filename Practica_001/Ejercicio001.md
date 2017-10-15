# Ejercicio n°1

Que debemos probar al ver si un numero es positivo, negativo o cero?

0. Iniciamos creando un proyecto Java, en mi caso hare un poco de uso de **Gradle**, para facilitarme la generacion del mismo,  la idea es tener una estructura similar a la siguiente:

***
* src
  - main
    + java
      * practica001 (***Este sera nuestro package***)
        - Numero.java (***Esta sera nuestra clase***)
  - test
    + java
      * practica001 (***Este sera nuestro package***)
        - NumeroTest.java (***Este sera nuestro clase de prueba***) << **Aqui partiremos...**
***

1. Iniciamos pensando en que esto se hara en **POO**, lo cual nos indica que tenemos que pensar que tendremos un objeto (***Clase***), en este caso **Numero**, por ende lo primero que debemos pensar es en que exista, osea este instanciado. Para ello debemos pensar en constructor y aqui tomamos una desicion de diseño, ***¿Debemos asignarle un valor al numero en este momento o despues?*** en particular, me inclino por pensar en que requerimos un costructor con parametro, esto seria asi:

```java
package practica001;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumeroTest {
    @Test
    public void PoseeValorInicialEnZero() throws Exception{
        Numero numero = new Numero();
        Assert.assertEquals(numero.getValor(), 0);
    }
}
```

En este minuto, no existe el costructor, no se esta asignando un valor inicial y no existe el **Get** de la propiedad, por ende al ejecutar la prueba, esta se cae...

Para pasar la prueba debemos crear la clase, el constructor, la variable y la propiedad **Get** de esta...

```java
package practica001;

public class Numero {

    private int valor;

    public Numero() {
        this.valor = 0;
    }

    public int getValor() {
        return this.valor;
    }
}
```

Felicitaciones, hemos pasado nuestro primer test...
Pero **TDD** nos dice que debemos iterar en tres simples pasos, estos son;

1. Escribe la prueba [x] **Hecho...**
2. Falla [x] **Hecho...**
3. ReFactoriza [x] **¿Realmente esta hecho...?**

Si miramos el codigo, veremos facilmente dos situaciones preocupantes...

1. No hay comentarios de nuestro codigo
2. Existen valores magicos (***Si no saben que es esto, los invito a visitar Google y averiguarlo...***)

Asi que modificamos nuestro codigo para que este mas ordinado, esto debe hacerse a cada iteracion y debemos tratar de ser muy puristas en esto...

