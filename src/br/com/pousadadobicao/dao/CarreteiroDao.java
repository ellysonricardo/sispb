package br.com.pousadadobicao.dao;

import java.util.List;

import br.com.pousadadobicao.modelo.Carreteiro;
import br.com.pousadadobicao.modelo.Endereco;

public interface CarreteiroDao {

	Carreteiro buscaPorId(Long idCarreteiro);

	List<Carreteiro> lista();

	void altera(Carreteiro c);

	void remove(Carreteiro c);

	void adiciona(Carreteiro c, Endereco e);
	
}

