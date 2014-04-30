package br.com.pousadadobicao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.pousadadobicao.modelo.Carreteiro;
import br.com.pousadadobicao.modelo.Endereco;

@Repository
public class JpaCarreteiroDao implements CarreteiroDao {
	

	@PersistenceContext
	EntityManager manager;


	@Override
	public Carreteiro buscaPorId(Long idCarreteiro) {
		return manager.find(Carreteiro.class, idCarreteiro);
	}

	@Override
	public List<Carreteiro> lista() {
		return manager.createQuery("select c from Carreteiro c").getResultList();
	}

	@Override
	public void altera(Carreteiro carreteiro) {
		manager.merge(carreteiro);

	}

	@Override
	public void remove(Carreteiro carreteiro) {
		Carreteiro CarreteiroARemover = buscaPorId(carreteiro.getIdCarreteiro());
		manager.remove(CarreteiroARemover);

	}

	@Override
	public void adiciona(Carreteiro carreteiro, Endereco endereco) {
		endereco.setCarreteiro(carreteiro);
		manager.persist(carreteiro);
		manager.persist(endereco);

	}

}
