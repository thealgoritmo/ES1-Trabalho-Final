public class Utilizador extends Object {

    String nome;
    String estado;
    TipoUtilizador tipoUtilizador;

    public Utilizador(String nome, String estado, TipoUtilizador aluno) {
        this.nome = nome;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public TipoUtilizador getTipoUtilizador() {
        return tipoUtilizador;
    }
}
