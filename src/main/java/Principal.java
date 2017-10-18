import practica001.Numero;

public class Principal {
    public static void main(String[] args) {
        Mensaje mensaje = new Mensaje("Hola");
        mensaje.Agrega("Profesor");
        mensaje.Agrega("Carvajal");
        System.out.println(mensaje.getTexto());
    }
}
