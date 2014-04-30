package br.com.pousadadobicao.dao;

import java.util.List;

import br.com.pousadadobicao.modelo.Cliente;
import br.com.pousadadobicao.modelo.Endereco;
import br.com.pousadadobicao.modelo.Reserva;

public interface ClienteDao {

	Cliente buscaPorId(Long idCliente);

	List<Cliente> lista();

	void remove(Cliente c);

	void adiciona(Cliente c, Endereco e);

	Object encontrarPorNome(Cliente nome);

	/*void altera(Cliente cliente, Endereco endereco, Reserva reserva);*/
	

/*	void altera(Cliente cliente, Endereco endereco);*/

	void alteraEnd(Endereco e, Reserva r);

	void alteraRes(Reserva reserva);

	void altera(Cliente cliente, Endereco endereco, Reserva reserva);
	
	/*public List encontrarPorId(Cliente cliente);*/


}
