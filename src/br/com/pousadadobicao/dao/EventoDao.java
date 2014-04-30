package br.com.pousadadobicao.dao;

import java.util.List;

import br.com.pousadadobicao.modelo.Evento;

public interface EventoDao {

	Evento buscaPorId(Long idEvento);

	List<Evento> lista();

	void adiciona(Evento e);

	void altera(Evento e);

	void remove(Evento e);
	
}
