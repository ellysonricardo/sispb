package br.com.pousadadobicao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.pousadadobicao.modelo.Usuario;

@Repository
public class JpaUsuarioDao implements UsuarioDao {

	@PersistenceContext
	EntityManager manager;

	public boolean existeUsuario(Usuario u) {

		if (u == null) {
			throw new IllegalArgumentException("Usuário não deve ser nulo");
		}

		Query query = this.manager
				.createQuery("SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha");

		query.setParameter("login", u.getLogin());

		query.setParameter("senha", u.getSenha());

		Usuario user = null;

		try {

			user = (Usuario) query.getSingleResult();

		} catch (NoResultException e) {
			e.printStackTrace();
		}
		return (user != null);
	}

	public Usuario buscaPorId(Long id) {
		return manager.find(Usuario.class, id);
	}

	public List<Usuario> lista() {
		return manager.createQuery("select u from Usuario u").getResultList();
	}

	public void adiciona(Usuario usuario) {
		manager.persist(usuario);
	}

	public void altera(Usuario usuario) {
		manager.merge(usuario);
	}

	public void remove(Usuario usuario) {
		Usuario usuarioARemover = buscaPorId(usuario.getIdUsuarios());
		manager.remove(usuarioARemover);
	}
	
	}