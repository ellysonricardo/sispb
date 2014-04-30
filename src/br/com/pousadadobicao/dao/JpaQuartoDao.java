package br.com.pousadadobicao.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.pousadadobicao.modelo.Quarto;

public class JpaQuartoDao implements QuartoDao {
	
	@PersistenceContext
	EntityManager manager;

	@Override
	public void adiciona(Quarto quarto) {
		manager.persist(quarto);

	}
}
