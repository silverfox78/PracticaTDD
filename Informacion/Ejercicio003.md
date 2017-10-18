# Ejercicio N°3

Contabilizar la lectura de números enteros positivos e imprimir el total leído.

1. Validar que el objeto exista, este objeto se llamaria **ContadorPositivo** y su largo 0.
2. Contexto, instancia vacia
    1. Validar que admita un nuevo numero y si este es positivo, el largo en esta situacion debe ser 1.
    2. Validar que admita un nuevo numero y si este es cero, el largo en esta situacion debe ser 0.
    3. Validar que admita un nuevo numero y si este es negativo, el largo en esta situacion debe ser 0.
 3. Validar que al agregar tres numeros positiovs, el largo sea de tres.
 4. Validar que al agregar tres numeros negativos, el largo sea de cero.
 
 Las pruebas de propuestas generadas son las siguientes:
 
 En [**ContadorPositivoTest.java**]
 ```java
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
 ```
 
 ---
 
 Esto genero el codigo:
 
 En [**ContadorPositivo.java**]
 ```java
 package practica001;
 
 public class ContadorPositivo {
     private int largo;
 
     public ContadorPositivo() {
         this.largo = Constante.Valores.Zero;
     }
 
     public int ObtieneLargo() {
         return this.largo;
     }
 
     public void AgregaNumero(float valor) {
         Numero numero = new Numero(valor);
         if(numero.DeterminaValor().equals(Constante.SignoValor.Positivo.toString())){
             this.largo++;
         }
     }
 }
 ```