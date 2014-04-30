package br.com.pousadadobicao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.pousadadobicao.modelo.Endereco;
import br.com.pousadadobicao.modelo.Funcionario;

@Repository
public class JpaFuncionarioDao implements FuncionarioDao {
	
	@PersistenceContext
	EntityManager manager;

	@Override
	public Funcionario buscaPorId(Long idFuncionario) {
		return manager.find(Funcionario.class, idFuncionario);
	}

	@Override
	public List<Funcionario> lista() {
		return manager.createQuery("select f from Funcionario f").getResultList();
	}

	@Override
	public void altera(Funcionario funcionario) {
		manager.merge(funcionario);

	}

	@Override
	public void remove(Funcionario funcionario) {
		Funcionario FuncionarioARemover = buscaPorId(funcionario.getIdFuncionario());
		manager.remove(FuncionarioARemover);

	}

	@Override
	public void adiciona(Funcionario funcionario, Endereco endereco) {
		endereco.setFuncionario(funcionario);
		manager.persist(funcionario);
		manager.persist(endereco);

	}

}
