package br.com.pousadadobicao.dao;

import java.util.List;

import br.com.pousadadobicao.modelo.ValorDiaria;

public interface ValorDiariaDao {

	ValorDiaria buscaPorId(Long idValorDiaria);

	List<ValorDiaria> lista();

	void altera(ValorDiaria v);

	void remove(ValorDiaria v);

	void adiciona(ValorDiaria valorDiaria);
}
