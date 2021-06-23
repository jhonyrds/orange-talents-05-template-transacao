package br.com.transacao.listener;

import br.com.transacao.repository.TransacaoRepository;
import br.com.transacao.dto.request.EventoTransacaoRequest;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerTransacao {

    private TransacaoRepository transacaoRepository;

    public ListenerTransacao(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void escutar(EventoTransacaoRequest eventoTransacao) {
        transacaoRepository.save(eventoTransacao.toModel());
    }
}
