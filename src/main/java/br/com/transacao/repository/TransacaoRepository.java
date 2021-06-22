package br.com.transacao.repository;

import br.com.transacao.model.EventoTransacao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends PagingAndSortingRepository<EventoTransacao, String> {
    Page<EventoTransacao> findByCartaoId(String id, Pageable paginacao);
}
