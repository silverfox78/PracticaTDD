public class Mensaje {
    public String getTexto() {
        return texto;
    }

    private String texto;

    public Mensaje(String texto) {
        this.texto = texto;
    }

    public void Agrega(String texto) {
        this.texto = this.texto.concat(" ");
        this.texto = this.texto.concat(texto);
    }
}
