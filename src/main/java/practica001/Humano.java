package practica001;

public class Humano {
    public void setNombre(String nombre) {
        if (nombre == null){
            throw new IllegalArgumentException("Debe ingresar un nombre valido.");
        }
        this.nombre = nombre;
    }

    private String nombre;

    public Humano(String nombre) {
        this.setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public String Saludo() {
        String saludos = "Hola, soy " + this.getNombre();
        return saludos;
    }
}
