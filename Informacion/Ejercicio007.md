# Ejercicio N°7

Leer un valor entero hasta que sea ingresado un -1, y que entregue el producto de los valores ingresados.

---

## Observacion

Como se pueden imaginar, para cada problema, suele haber mas de una forma de afrontar la solucion...

En este caso es algo similar y se refiere a quien tiene la responsabilidad de que...

Por ejemplo,

* ¿Es el Objeto quien debe ser responsable de pedir al usuario la lista de datos...
* O el Objeto debe proveer los metodos necesarios para esta interaccion?

Esta es una decision de diseño y siempre es relevante el como y que hagamos...

Por un tema de reutilizacion, opto por generar un objeto que proporcione las herramientas y no sea quien haga la accion...

***Observacion :*** Otra forma, es llamar iterativamente a un objeto pasandole a su constructor el numero ingresado por el numero previo, siendo el primer caso un "**1**" y deteniendose al ingresar "**-1**"... El detalle es que ¿Quien realmente controla hasta cuando leer...? aunque por otro lado, brindando las herramientas pasamos la responsabilidad de iterrar a otro nivel...

---

## Casos de prueba

* Verificar que el objeto exista, se identifica el objeto [**Secuencia**] y los atributos identificados son:
  * Ultimo valor ingresado, en este caso seria **nulo**
  * Un flag que nos mencione si podemos proseguir, en este caso **true**
  * El producto de los valores ingresados, en este caso **0**
  * Aunque innecesario, podriamos considerar un contador de valores ingresados, en este caso **0**
* Validar que se disponga de un metodo que nos permita anexar un valor a la secuencia, si este valor es distinto a "**-1**", debe:
  * Fijar el ultimo valor ingresado con este numero.
  * Moldificar el valor del producto total de los valores ongresados
  * Aumentar el contador de datos ingresados en una unidad. 
 