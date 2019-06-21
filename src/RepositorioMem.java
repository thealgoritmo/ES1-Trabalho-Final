
public class RepositorioMem implements Repositorio{

    public RepositorioMem() {
    }


    public void adicionaPropostaRequisicao(PropostaAquisicao proposta){ ListaPropostas.add(proposta); }

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra){ ListaRequesicoesCompra.add(requisicaoCompra); }

    public void adicionaEncomenda(Encomenda encomenda){ ListaEncomendas.add(encomenda); }

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro){ ListaEntradasNovosLivros.add(entradaNovoLivro); }

    public void adicionaUtilizador(Utilizador utilizador){
        ListaUtilizadores.add(utilizador);
    }

    public void adicionaTipoUtilizador(TipoUtilizador tipo){
        ListaTipos.add(tipo);
    }

    public void adicionaRequisicao(Requisicao requisicao){
        ListaRequisicoes.add(requisicao);
    }

    public void adicionaCopia(Copia copia){
        ListaCopias.add(copia);
    }

    public void adicionaLivro(Livro livro){
        ListaLivros.add(livro);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo){
        ListaEmprestimos.add(emprestimo);
    }

    public void adicionaNotificacao(Notificacao notificacao){
        ListaNotificacoes.add(notificacao);
    }

    public void adicionaDevolucao(Devolucao devolucao){
        ListaDevolucoes.add(devolucao);
    }

    public void adicionaCoima(Coima coima){
        ListaCoimas.add(coima);
    }

    public void adicionaAprovacaoProposta(AprovacaoProposta aprovacaoProposta){ListaAprovacaoProposta.add(aprovacaoProposta);}

    public void adicionaAprovacaoPropostaLivro(AprovacaoPropostaLivro aprovacaoPropostaLivro){ListaAprovacaoPropostaLivro.add(aprovacaoPropostaLivro);}

    public void adicionaClubeLivro(ClubeLivro clubeLivro){ListaClubeLivro.add(clubeLivro);}

    public void adicionaMembro(Membro membro){ListaMembro.add(membro);}

    public void adicionaPropostaLivro(PropostaLivro propostaLivro){ListaPropostaLivro.add(propostaLivro);}

    public void adicionaSala(Sala sala){ListaSala.add(sala);}

    public void adicionaSessao(Sessao sessao){ListaSessao.add(sessao);}

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r){
        for(Emprestimo e: ListaEmprestimos){
            if (e.getRequisicao().equals(r)) {
                return e;
            }
        }
        return null;
    }
}
