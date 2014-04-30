package br.com.pousadadobicao.dao;

import java.util.List;

import br.com.pousadadobicao.modelo.Site;

public interface TextoPrincipalDao {

	Site buscaPorId(Long idSite);

	List<Site> lista();

	void adiciona(Site s);

	void altera(Site s);

	void remove(Site s);
}
