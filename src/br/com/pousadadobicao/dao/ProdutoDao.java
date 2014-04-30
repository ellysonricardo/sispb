package br.com.pousadadobicao.dao;

import java.util.List;

import br.com.pousadadobicao.modelo.Produto;

public interface ProdutoDao {
	
	Produto buscaPorId(Long idProduto);

	List<Produto> lista();

	void altera(Produto p);

	void remove(Produto p);

	void adiciona(Produto p);

}
