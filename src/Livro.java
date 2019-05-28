public class Livro extends Object {

    String titulo;
    String editora;
    String genero;

    public Livro(String titulo, String editora, String genero) {
        this.titulo = titulo;
        this.editora = editora;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public String getGenero() {
        return genero;
    }
}
