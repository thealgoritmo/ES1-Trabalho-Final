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

    public void setEstado(String estado) {
        this.estado = estado;
    }

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
