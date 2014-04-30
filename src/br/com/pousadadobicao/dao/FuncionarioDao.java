package br.com.pousadadobicao.dao;

import java.util.List;

import br.com.pousadadobicao.modelo.Endereco;
import br.com.pousadadobicao.modelo.Funcionario;

public interface FuncionarioDao {

	Funcionario buscaPorId(Long idFuncionario);

	List<Funcionario> lista();

	void altera(Funcionario f);

	void remove(Funcionario f);

	void adiciona(Funcionario f, Endereco e);
}
