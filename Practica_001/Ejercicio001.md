# Ejercicio n°1

Que debemos probar al ver si un numero es positivo, negativo o cero?

## Paso - 0

Iniciamos creando un proyecto Java, en mi caso hare un poco de uso de **Gradle**, para facilitarme la generacion del mismo,  la idea es tener una estructura similar a la siguiente:

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

## Paso - 1

Iniciamos pensando en que esto se hara en **POO**, lo cual nos indica que tenemos que pensar que tendremos un objeto (***Clase***), en este caso **Numero**, por ende lo primero que debemos pensar es en que exista, osea este instanciado. Para ello debemos pensar en constructor y aqui tomamos una desicion de diseño, ***¿Debemos asignarle un valor al numero en este momento o despues?*** en particular, me inclino por pensar en que requerimos un costructor con parametro, esto seria asi:

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
2. Existen valores magicos ( ***Si no saben que es esto, los invito a visitar Google y averiguarlo...*** )

Asi que modificamos nuestro codigo para que este mas ordinado, esto debe hacerse a cada iteracion y debemos tratar de ser muy puristas en esto...

La clase principal nos queda asi:

```java
package practica001;

/**
 * Clase destinada a contener un numero y las evaluaciones del mismo
 */
public class Numero {

    /**
     * Valor del numero
     */
    private int valor;

    /**
     * Valor inicial por defecto
     */
    private static final int Zero = 0;

    /**
     * Constructor por defecto de la instancia
     */
    public Numero() {
        this.valor = Zero;
    }

    /**
     * Propiedad de la variable numero, permite recuperar el valor de numero
     * @return valor del numero
     */
    public int getValor() {
        return this.valor;
    }
}
```

La clase de pruebas nos queda asi:

```java
package practica001;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Clase de prueba de la clase [Numero]
 */
public class NumeroTest {
    /**
     * Valor inicial de una instancia por defecto (0)
     */
    private static final int Zero = 0;

    /**
     * Metodo que evalua si al iniciar la instancia el valor del numero queda en cero
     * @throws Exception En caso de algun error incontrolado por la evaluacion
     */
    @Test
    public void PoseeValorInicialEnZero() throws Exception{
        Numero numero = new Numero();
        Assert.assertEquals(numero.getValor(), 0);
    }
}
```

***

**Acontar de este punto, solo comentare el codigo anexado o modificado...**

***

## Paso - 2

Ahora pongamonos en una situacion un tanto mas real, si deseamos iniciar la instancia con un valor determinado, por ejemplo **1**.

En [**NumeroTest.java**]
```java
    /**
     * Valor tentativo de Uno
     */
    private static final int Uno = 1;

    @Test
    public void PoseeValorInicialEnUno(){
        /* Generamos la instancia*/
        Numero numero;

        /* Inciamos la instancia */
        numero = new Numero(Uno);

        /* Comparamos los resultados */
        Assert.assertEquals(numero.getValor(), Uno);
    }
```

En [**Numero.java**]
```java
    /**
     * Constructor de la instancia
     * @param valor - valor que se le asignara a la instancia
     */
    public Numero(int valor) {
        this.valor = valor;
    }
```

## Paso - 3

Ya tenemos iniciada nuestra instancia, pero en el tiempo nuestro objeto deberia poder mutar, parte de la POO, por ende necesitamos modificar el valor de nuestro numero y verificar que este cambio, aqui tenemos dos situaciones:

1. Inicia por defecto y cambia a un valor...
2. Inicia con un valor y cambia a otro valor...

Para el primer caso, necesitamos una prueba como la siguiente:

En [**NumeroTest.java**]
```java
    /**
     * Metodo que evalua si al iniciar la instancia por defecto, luego podemos cambiar su valor
     */
    @Test
    public void IniciaPorDefectoYCambiaAUno(){
        /* Generamos la instancia*/
        Numero numero;

        /* Inciamos la instancia */
        numero = new Numero();

        /* Asignamos un nuevo valor a la instancia */
        numero.setValor(Uno);

        /* Comparamos los resultados */
        Assert.assertEquals(numero.getValor(), Uno);
    }
```

Y para el segundo caso, necesitamos una prueba como la siguiente:

En [**NumeroTest.java**]
```java
    /**
     * Metodo que evalua si al iniciar una instancia en un valor, este puede cambiarse
     */
    @Test
    public void IniciaEnUnoYCambiaAZero(){
        /* Generamos la instancia*/
        Numero numero;

        /* Inciamos la instancia */
        numero = new Numero(Uno);

        /* Asignamos un nuevo valor a la instancia */
        numero.setValor(Zero);

        /* Comparamos los resultados */
        Assert.assertEquals(numero.getValor(), Zero);
    }
```