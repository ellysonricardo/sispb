package br.com.pousadadobicao.dao;

import java.util.List;

import br.com.pousadadobicao.modelo.Agenciador;
import br.com.pousadadobicao.modelo.Endereco;

public interface AgenciadorDao {

	Agenciador buscaPorId(Long idAgenciador);

	List<Agenciador> lista();

	void altera(Agenciador a);

	void remove(Agenciador a);

	void adiciona(Agenciador a, Endereco e);
}
