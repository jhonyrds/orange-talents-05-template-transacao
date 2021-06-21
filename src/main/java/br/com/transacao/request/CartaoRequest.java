package br.com.transacao.request;

import br.com.transacao.model.Cartao;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class CartaoRequest {

    @NotBlank
    private String id;

    @Email
    @NotBlank
    private String email;

    public CartaoRequest() {
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Cartao toModel() {
        return new Cartao(id, email);
    }
}
