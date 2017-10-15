# Ejercicio N°2

Debemos encontrar el perímetro (suma de los lados de un triángulo * cualquiera), para ello y a diferencia del caso anterior, listaremos las posibles pruebas, para esto seguiremos las siguientes caracteristicas:

* Cada metodo solo hace una cosa
* Cada metodo solo puede fallar en un solo punto y por un motivo
* Las pruebas van de menos a mas, cubriendo lo mas basico
* Lo ideal es una Assert a la vez
* Realizar refactorizacion tras cada iteracion

Con las pruebas, se va diseñando la aplicacion, por ende lo primero es listar las evaluaciones que haremos...

1. Que el objeto exista, para ello necesitamos una clase, en este caso se llama **Triangulo** y asumeremos que tienes tres lados, por ende requerimos un costructor con estas caracteristicas
2. Que ninguno de los valores de los lados sea negativo o cero
3. Disponer de un metodo que sume los lados

---

## Paso 1

Generacion de la instancia

En [**TrianguloTest.java**]
```java
    @Test
    public void GeneraInstanciaConUno(){
        Triangulo triangulo = new Triangulo(Constante.Valores.Uno, Constante.Valores.Uno, Constante.Valores.Uno);
        Assert.assertTrue(triangulo.getLadoA() == Constante.Valores.Uno);
        Assert.assertTrue(triangulo.getLadoB() == Constante.Valores.Uno);
        Assert.assertTrue(triangulo.getLadoC() == Constante.Valores.Uno);
    }
```

---

## Paso 2

Validamos que la instancia no acepte valores cero al iniciar

En [**TrianguloTest.java**]
```java
    @Test(expected = IllegalArgumentException.class)
    public void GeneraInstanciaConZero(){
        Triangulo triangulo = new Triangulo(Constante.Valores.Zero, Constante.Valores.Zero, Constante.Valores.Zero);
    }
```

---

## Paso 3

Validamos que la instancia no acepte valores negativos al iniciar

En [**TrianguloTest.java**]
```java
    @Test(expected = IllegalArgumentException.class)
    public void GeneraInstanciaConNegativos(){
        Triangulo triangulo = new Triangulo(Constante.Valores.MenosUno, Constante.Valores.MenosUno, Constante.Valores.MenosUno);
    }
```

---

## Paso 4

Validamos que podemos obtener el perimetro del triangulo

En [**TrianguloTest.java**]
```java
    @Test
    public void ObtienePerimetro() {
        Triangulo triangulo = new Triangulo(Constante.Valores.Uno, Constante.Valores.Uno, Constante.Valores.Uno);
        float perimetro = triangulo.Perimetro();
        Assert.assertTrue(perimetro == Constante.Valores.Tres);
    }
```