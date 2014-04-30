package br.com.pousadadobicao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.pousadadobicao.dao.AgenciadorDao;
import br.com.pousadadobicao.modelo.Agenciador;
import br.com.pousadadobicao.modelo.Endereco;

@Repository
public class JpaAgenciadorDao implements AgenciadorDao {
	
	@PersistenceContext
	EntityManager manager;
	
	@Override
	public Agenciador buscaPorId(Long idAgenciador) {
		return manager.find(Agenciador.class, idAgenciador);
	}

	@Override
	public List<Agenciador> lista() {
		return manager.createQuery("select a from Agenciador a").getResultList();
	}

	@Override
	public void adiciona(Agenciador agenciador, Endereco endereco) {
		endereco.setAgenciador(agenciador);
		manager.persist(agenciador);
		manager.persist(endereco);
	}

	@Override
	public void altera(Agenciador agenciador) {
		manager.merge(agenciador);

	}

	@Override
	public void remove(Agenciador agenciador) {
		Agenciador AgenciadorARemover = buscaPorId(agenciador.getIdAgenciador());
		manager.remove(AgenciadorARemover);

	}
}
