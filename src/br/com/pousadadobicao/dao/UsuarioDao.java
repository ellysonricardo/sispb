package br.com.pousadadobicao.dao;

import java.util.List;

import br.com.pousadadobicao.modelo.Usuario;

public interface UsuarioDao {

	Usuario buscaPorId(Long id);

	List<Usuario> lista();

	void adiciona(Usuario u);

	void altera(Usuario u);

	void remove(Usuario u);

	boolean existeUsuario(Usuario u);

}