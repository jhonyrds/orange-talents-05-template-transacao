package br.com.transacao.response;

import br.com.transacao.model.EventoTransacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EventoTransacaoResponse {

    private BigDecimal valor;

    private EstabelecimentoResponse estabelecimento;

    private CartaoResponse cartao;

    private LocalDateTime efetivadoEm;

    public EventoTransacaoResponse(EventoTransacao evento) {
        this.valor = evento.getValor();
        this.estabelecimento = new EstabelecimentoResponse(evento.getEstabelecimento());
        this.cartao = new CartaoResponse(evento.getCartao());
        this.efetivadoEm = evento.getEfetivadaEm();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoResponse getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoResponse getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadoEm() {
        return efetivadoEm;
    }
}
