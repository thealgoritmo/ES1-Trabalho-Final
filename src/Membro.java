import java.time.LocalDate;

public class Membro {

    Utilizador utilizador;
    ClubeLivro clubeLivro;
    LocalDate data;

    public Membro(Utilizador utilizador, ClubeLivro clubeLivro, LocalDate data) {
        this.utilizador = utilizador;
        this.clubeLivro = clubeLivro;
        this.data = data;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public ClubeLivro getClubeLivro() {
        return clubeLivro;
    }

    public LocalDate getData() {
        return data;
    }
}
