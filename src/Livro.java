public class Livro extends Object {

    String titulo;
    String editora;

    public Livro(String titulo, String editora) {
        this.titulo = titulo;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

}
