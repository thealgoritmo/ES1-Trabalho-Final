import java.time.LocalDate;

public class Main {

    public static void main(String args[]){
       /* TipoUtilizador t = new TipoUtilizador("aluno",10);
        Utilizador u = new Utilizador("Manuel","Ativo", t);
        ClubeLivro c = new ClubeLivro(1,"António","Ficção-Cientifica","Ativo");
        LocalDate d = LocalDate.now();
        Membro m = new Membro(u,c,d);
        RepositorioMem repo = new RepositorioMem();
        repo.adicionaMembro(m);*/

        /*TipoUtilizador t = new TipoUtilizador("aluno",10);
        Utilizador u = new Utilizador("Manuel","Ativo", t);
        ClubeLivro c = new ClubeLivro(1,"António","Ficção-Cientifica","Ativo");
        Livro l = new Livro("Viagem","Porto Editora", "Ficção-Cientifica");
        LocalDate d = LocalDate.now();
        Membro m = new Membro(u,c,d);
        d = LocalDate.now();
        PropostaLivro p = new PropostaLivro(d,m,c);
        d = LocalDate.now();
        AprovacaoPropostaLivro ap = new AprovacaoPropostaLivro("Em Espera",d,m,c,p);
        RepositorioMem repo = new RepositorioMem();
        repo.adicionaAprovacaoPropostaLivro(ap);*/

        TipoUtilizador t = new TipoUtilizador("aluno",10);
        Utilizador u = new Utilizador("Manuel","Ativo", t);
        ClubeLivro c = new ClubeLivro(1,"António","Ficção-Cientifica","Ativo");
        Livro l = new Livro("Viagem","Porto Editora", "Ficção-Cientifica");
        Sala s = new Sala(1,"Sala Grande");
        Sessao ss = new Sessao(2019,06,10,13,30,c,s,l);
        RepositorioMem repo = new RepositorioMem();
        repo.adicionaSessao(ss);

    }

}
