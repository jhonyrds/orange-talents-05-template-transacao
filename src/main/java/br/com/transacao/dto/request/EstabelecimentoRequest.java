package br.com.transacao.dto.request;

import br.com.transacao.model.Estabelecimento;

import javax.validation.constraints.NotBlank;

public class EstabelecimentoRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private String cidade;

    @NotBlank
    private String endereco;

    public EstabelecimentoRequest() {
    }

    public EstabelecimentoRequest(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public Estabelecimento toModel() {
        return new Estabelecimento(nome, cidade, endereco);
    }
}
