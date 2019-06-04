import java.util.ArrayList;

public class ClubeLivro {

    ArrayList<AprovacaoProposta> propostaArrayList = new ArrayList<>();

    int idclube;
    String ResponsavelClube;
    String Genero;
    String estado;

    public ClubeLivro(int idclube, String responsavelClube, String genero, String estado) {
        this.idclube = idclube;
        ResponsavelClube = responsavelClube;
        Genero = genero;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

    public ArrayList<AprovacaoProposta> getPropostaArrayList() {
        return propostaArrayList;
    }

    public void adicionarPropostaAceite(AprovacaoProposta proposta){
        propostaArrayList.add(proposta);
    }

}
