package br.com.transacao.controller;

import br.com.transacao.model.EventoTransacao;
import br.com.transacao.repository.TransacaoRepository;
import br.com.transacao.response.EventoTransacaoResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransacaoController {

    private TransacaoRepository transacaoRepository;

    public TransacaoController(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    @GetMapping("/transacao/{idCartao}")
    public ResponseEntity<Page<EventoTransacaoResponse>>listar(@PathVariable String idCartao, @PageableDefault(direction = Sort.Direction.DESC, page = 0, size = 10)Pageable paginacao) {
        Page<EventoTransacao> transacao = transacaoRepository.findByCartaoId(idCartao, paginacao);
        return transacao.isEmpty() ?
                ResponseEntity.notFound().build() :
                ResponseEntity.ok().body(transacao.map(evento -> new EventoTransacaoResponse(evento)));
    }
}
