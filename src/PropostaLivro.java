import java.time.LocalDate;

public class PropostaLivro {

    LocalDate data;
    Membro membro;
    ClubeLivro clubeLivro;

    public PropostaLivro(LocalDate data, Membro membro, ClubeLivro clubeLivro) {
        this.data = data;
        this.membro = membro;
        this.clubeLivro = clubeLivro;
    }

    public LocalDate getData() {
        return data;
    }

    public Membro getMembro() {
        return membro;
    }

    public ClubeLivro getClubeLivro() {
        return clubeLivro;
    }
}
