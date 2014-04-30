package br.com.pousadadobicao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.pousadadobicao.modelo.Evento;

@Repository
public class JpaEventoDao implements EventoDao {
	
	@PersistenceContext
	EntityManager manager;

	@Override
	public Evento buscaPorId(Long idEvento) {
		return manager.find(Evento.class, idEvento);
	
	}

	@Override
	public List<Evento> lista() {
		return manager.createQuery("select e from Evento e").getResultList();
	}

	@Override
	public void adiciona(Evento evento) {
		manager.persist(evento);

	}

	@Override
	public void altera(Evento evento) {
		manager.merge(evento);

	}

	@Override
	public void remove(Evento evento) {
		Evento EventoARemover = buscaPorId(evento.getIdEvento());
		manager.remove(EventoARemover);

	}

}