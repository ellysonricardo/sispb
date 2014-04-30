package br.com.pousadadobicao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.pousadadobicao.modelo.ValorDiaria;

@Repository
public class JpaValorDiariaDao implements ValorDiariaDao {
	
	@PersistenceContext
	EntityManager manager;

	@Override
	public ValorDiaria buscaPorId(Long idValorDiaria) {
		return manager.find(ValorDiaria.class, idValorDiaria);
	}

	@Override
	public List<ValorDiaria> lista() {
		return manager.createQuery("select v from ValorDiaria v").getResultList();
	}

	@Override
	public void altera(ValorDiaria valorDiaria) {
		manager.merge(valorDiaria);

	}

	@Override
	public void remove(ValorDiaria valorDiaria) {
		ValorDiaria ValorDiariaARemover = buscaPorId(valorDiaria.getIdValorDiaria());
		manager.remove(ValorDiariaARemover);

	}

	@Override
	public void adiciona(ValorDiaria valorDiaria) {
		manager.persist(valorDiaria);

	}

}

