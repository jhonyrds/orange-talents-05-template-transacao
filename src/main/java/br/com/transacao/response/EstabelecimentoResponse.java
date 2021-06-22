package br.com.transacao.response;

import br.com.transacao.model.Estabelecimento;

public class EstabelecimentoResponse {

    private String nome;

    private String cidade;

    public EstabelecimentoResponse(Estabelecimento estabelecimento) {
        this.nome = estabelecimento.getNome();
        this.cidade = estabelecimento.getCidade();
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }
}
