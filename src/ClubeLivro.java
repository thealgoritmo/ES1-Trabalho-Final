public class ClubeLivro {

    int idclube;
    String ResponsavelClube;
    String Genero;

    public ClubeLivro(int idclube, String responsavelClube, String genero) {
        this.idclube = idclube;
        ResponsavelClube = responsavelClube;
        Genero = genero;
    }

    public int getIdclube() {
        return idclube;
    }

    public String getResponsavelClube() {
        return ResponsavelClube;
    }

    public String getGenero() {
        return Genero;
    }
}
