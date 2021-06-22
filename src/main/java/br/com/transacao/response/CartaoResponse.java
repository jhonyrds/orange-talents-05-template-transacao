package br.com.transacao.response;

import br.com.transacao.model.Cartao;

public class CartaoResponse {

    private String email;

    public CartaoResponse() {
    }

    public CartaoResponse(Cartao cartao) {
        this.email = cartao.getEmail();
    }

    public String getEmail() {
        return email;
    }
}
