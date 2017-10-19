# Ejercicio N°5

Hallar el valor absoluto de un número cualquiera.

---

## Casos de prueba

1. Se requiere validar la existencia del objeto, en este caso identificamos al objeto [**Numero**] con el atributo para contener el valor.
2. Se requiere comprobar que un valor negativo entrege su valor absoluto de el.
3. Se requiere comprobar que un valor positivo entrege su valor absoluto de el.

---

Para este caso, ampliaremos la funcionalidad del objeto ya generado [**Numero**]

---

La primera prueba, ya existe, por ende solo anexaremos las validacion de la obtencion del valor absoluto.

Las pruebas que anexamos son:

En [**NumeroTest.java**]
```java
    @Test
    public void ValidaValorAbsolutoDeUnValorNegativo(){
        this.GeneraInstancia(false, Constante.Valores.MenosUno, null);
        Assert.assertTrue(this.numero.ValorAbsoluto() == Constante.Valores.Uno);
    }

    @Test
    public void ValidaValorAbsolutoDeUnValorPositivo(){
        this.GeneraInstancia(false, Constante.Valores.Uno, null);
        Assert.assertTrue(this.numero.ValorAbsoluto() == Constante.Valores.Uno);
    }
```

---

El metodo que anexamos es:

En [**Numero.java**]
```java
    public float ValorAbsoluto() {
        return java.lang.Math.abs(this.valor);
    }
```