package br.com.pousadadobicao.dao;

import java.util.List;

import br.com.pousadadobicao.modelo.Cliente;
import br.com.pousadadobicao.modelo.Endereco;
import br.com.pousadadobicao.modelo.Reserva;

public interface ReservaDao {

	Reserva buscaPorId(Long idReserva);

	List<Reserva> lista();

	void altera(Reserva r);

	void remove(Reserva r);

	void adiciona(Reserva r, Cliente c, Endereco e);

	void finaliza(Long idReserva);

	public List quarto(Reserva reserva);

	void alteraDeposito(Reserva reserva);
}
