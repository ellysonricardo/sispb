package br.com.pousadadobicao.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.pousadadobicao.modelo.Cliente;
import br.com.pousadadobicao.modelo.Endereco;
import br.com.pousadadobicao.modelo.Reserva;

@Repository
public class JpaReservaDao implements ReservaDao {
	
	@PersistenceContext
	EntityManager manager;

	@Override
	public Reserva buscaPorId(Long idReserva) {
		return manager.find(Reserva.class, idReserva);
	}

	@Override
	public List<Reserva> lista() {
		return manager.createQuery("select r from Reserva r join fetch r.clientes").getResultList();
	}

	@Override
	public void altera(Reserva reserva) {
		manager.merge(reserva);

	}

	@Override
	public void remove(Reserva reserva) {
		Reserva ReservaARemover = buscaPorId(reserva.getIdReserva());
		manager.remove(ReservaARemover);

	}

	@Override
	public void adiciona(Reserva reserva, Cliente cliente, Endereco endereco) {
		cliente.setReserva(reserva);
		cliente.setEndereco(endereco);
		manager.persist(cliente);
		manager.persist(endereco);
		manager.persist(reserva);
	}
	
	public void finaliza(Long id) {
		Reserva reserva = buscaPorId(id);
		reserva.setStatusReserva(2);
		/*reserva.setDataDeposito(Calendar.getInstance());*/
	}
	
	public List quarto(Reserva r) { 
		Query query = manager.createQuery("Select r from Reserva r where r.numeroQuarto = :numeroQuarto AND r.statusReserva = 3 "); 
		query.setParameter("numeroQuarto", r.getNumeroQuarto()); 
		return query.getResultList( ); 
		} 
	
	public void alteraDeposito(Reserva r) { 
		Query query = manager.createQuery("UPDATE Reserva r SET r.valorDeposito = :valorDeposito WHERE r.idReserva = :idReserva"); 
		query.setParameter("idReserva", r.getIdReserva());
		query.setParameter("valorDeposito", r.getValorDeposito());
		query.executeUpdate();
		}
}



	
