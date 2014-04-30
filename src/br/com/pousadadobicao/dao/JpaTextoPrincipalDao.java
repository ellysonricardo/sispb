package br.com.pousadadobicao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.pousadadobicao.modelo.Site;

@Repository
public class JpaTextoPrincipalDao implements TextoPrincipalDao {

	@PersistenceContext
	EntityManager manager;

	@Override
	public Site buscaPorId(Long idSite) {
		return manager.find(Site.class, idSite);
	}

	@Override
	public List<Site> lista() {
		return manager.createQuery("select s from Site s").getResultList();
	}

	@Override
	public void adiciona(Site site) {
		manager.persist(site);
	}

	@Override
	public void altera(Site site) {
		manager.merge(site);

	}

	@Override
	public void remove(Site site) {
		Site SiteARemover = buscaPorId(site.getIdSite());
		manager.remove(SiteARemover);

	}

}
