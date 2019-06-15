import java.time.LocalDate;

public class AprovacaoProposta {

    String estado;
    LocalDate data;
    Membro membro;
    ClubeLivro clubeLivro;

    public AprovacaoProposta(String estado, LocalDate data, Membro membro, ClubeLivro clubeLivro) {
        this.estado = estado;
        this.data = data;
        this.membro = membro;
        this.clubeLivro = clubeLivro;
    }

    public String getEstado() {
        return estado;
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
