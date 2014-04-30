package br.com.pousadadobicao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.pousadadobicao.modelo.Endereco;
import br.com.pousadadobicao.modelo.Funcionario;
import br.com.pousadadobicao.modelo.Produto;

@Repository
public class JpaProdutoDao implements ProdutoDao {
	
	@PersistenceContext
	EntityManager manager;

	@Override
	public Produto buscaPorId(Long idProduto) {
		return manager.find(Produto.class, idProduto);
	}

	@Override
	public List<Produto> lista() {
		return manager.createQuery("select p from Produto p").getResultList();
	}

	@Override
	public void altera(Produto produto) {
		manager.merge(produto);

	}

	@Override
	public void remove(Produto produto) {
		Produto ProdutoARemover = buscaPorId(produto.getIdProduto());
		manager.remove(ProdutoARemover);

	}

	@Override
	public void adiciona(Produto produto) {
		manager.persist(produto);
	}

}