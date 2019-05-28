import java.util.ArrayList;

public class ClubeLivro {

    ArrayList<AprovacaoProposta> propostaArrayList = new ArrayList<>();

    int idclube;
    String ResponsavelClube;
    String Genero;

    public ClubeLivro(int idclube, String responsavelClube, String genero) {
        this.idclube = idclube;
        this.ResponsavelClube = responsavelClube;
        this.Genero = genero;
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

    public void adicionarPropostaAceite(AprovacaoProposta proposta){
        propostaArrayList.add(proposta);
    }

}
