package br.com.transacao.repository;

import br.com.transacao.model.EventoTransacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends CrudRepository<EventoTransacao, String> {
}
