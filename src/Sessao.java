import java.time.LocalDate;
import java.time.LocalTime;

public class Sessao {

    LocalDate data;
    LocalTime hora;
    ClubeLivro clubelivro;
    Sala sala;
    Livro livro;

    public Sessao(int year, int month, int day, int hour, int minute, ClubeLivro clubelivro, Sala sala, Livro livro) {
        this.data = LocalDate.of(year, month, day);
        this.hora = LocalTime.of(hour, minute);
        this.clubelivro = clubelivro;
        this.sala = sala;
        this.livro = livro;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public ClubeLivro getClubelivro() {
        return clubelivro;
    }

    public Sala getSala() {
        return sala;
    }

    public Livro getLivro() {
        return livro;
    }
}
