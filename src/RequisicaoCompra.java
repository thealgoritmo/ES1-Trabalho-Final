import java.time.LocalDate;

public class RequisicaoCompra extends Object {

    String estado;
    LocalDate data;
    String oficio;
    Livro livro;
    Utilizador utilizador;

    public RequisicaoCompra(String estado, LocalDate data, String oficio, Livro livro, Utilizador utilizador) {
        this.estado = estado;
        this.data = data;
        this.oficio = oficio;
        this.livro = livro;
        this.utilizador = utilizador;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDate getData() {
        return data;
    }

    public String getOficio() {
        return oficio;
    }

    public Livro getLivro() {
        return livro;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }
}
