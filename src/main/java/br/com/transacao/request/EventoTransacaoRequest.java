package br.com.transacao.request;

import br.com.transacao.model.Cartao;
import br.com.transacao.model.Estabelecimento;
import br.com.transacao.model.EventoTransacao;

import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EventoTransacaoRequest {

    private String id;

    @Positive
    private BigDecimal valor;

    private EstabelecimentoRequest estabelecimento;

    private CartaoRequest cartao;

    private LocalDateTime efetivadoEm;

    public EventoTransacaoRequest() {
    }

    public EventoTransacaoRequest(String id, BigDecimal valor, EstabelecimentoRequest estabelecimento,
                                  CartaoRequest cartao, LocalDateTime efetivadoEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadoEm = efetivadoEm;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoRequest getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoRequest getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadoEm() {
        return efetivadoEm;
    }

    public EventoTransacao toModel() {
        Estabelecimento estabelecimento = this.estabelecimento.toModel();
        Cartao cartao = this.cartao.toModel();
        return new EventoTransacao(id, valor, estabelecimento, cartao, efetivadoEm);
    }
}
