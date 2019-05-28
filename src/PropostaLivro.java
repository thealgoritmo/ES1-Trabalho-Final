import java.time.LocalDate;

public class PropostaLivro {

    LocalDate data;
    Membro membro;
    ClubeLivro clubeLivro;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public ClubeLivro getClubeLivro() {
        return clubeLivro;
    }

    public void setClubeLivro(ClubeLivro clubeLivro) {
        this.clubeLivro = clubeLivro;
    }
}
