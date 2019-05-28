import java.time.LocalDate;

public class AprovacaoPropostaLivro extends AprovacaoProposta {

    PropostaLivro propostaLivro;

    public AprovacaoPropostaLivro(String estado, LocalDate data, Membro membro, ClubeLivro clubeLivro, PropostaLivro propostaLivro) {
        super(estado, data, membro, clubeLivro);
        this.propostaLivro = propostaLivro;
    }

    public PropostaLivro getPropostaLivro() {
        return propostaLivro;
    }
}
