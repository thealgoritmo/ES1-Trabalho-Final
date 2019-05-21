import java.util.ArrayList;


public interface Repositorio{


    ArrayList<Coima> ListaCoimas = new ArrayList<Coima>();
    ArrayList<Copia> ListaCopias = new ArrayList<Copia>();
    ArrayList<Devolucao> ListaDevolucoes = new ArrayList<Devolucao>();
    ArrayList<Emprestimo> ListaEmprestimos = new ArrayList<Emprestimo>();
    ArrayList<Livro> ListaLivros = new ArrayList<Livro>();
    ArrayList<Notificacao> ListaNotificacoes = new ArrayList<Notificacao>();
    ArrayList<Requisicao> ListaRequisicoes = new ArrayList<Requisicao>();
    ArrayList<TipoUtilizador> ListaTipos = new ArrayList<TipoUtilizador>();
    ArrayList<Utilizador> ListaUtilizadores = new ArrayList<Utilizador>();
    ArrayList<PropostaAquisicao> ListaPropostas = new ArrayList<PropostaAquisicao>();
    ArrayList<RequisicaoCompra> ListaRequesicoesCompra = new ArrayList<RequisicaoCompra>();
    ArrayList<Encomenda> ListaEncomendas = new ArrayList<Encomenda>();
    ArrayList<EntradaNovoLivro> ListaEntradasNovosLivros = new ArrayList<EntradaNovoLivro>();

     void adicionaPropostaRequisicao(PropostaAquisicao proposta);

     void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra);

     void adicionaEncomenda(Encomenda encomenda);

     void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);

     void adicionaUtilizador(Utilizador utilizador);

     void adicionaTipoUtilizador(TipoUtilizador tipo);

     void adicionaRequisicao(Requisicao requisicao);

     void adicionaCopia(Copia copia);

     void adicionaLivro(Livro livro);

     void adicionaEmprestimo(Emprestimo emprestimo);

     void adicionaNotificacao(Notificacao notificacao);

     void adicionaDevolucao(Devolucao devolucao);

     void adicionaCoima(Coima coima);

     Emprestimo devolveEmprestimoDaRequisicao(Requisicao r);
}
