package br.com.pousadadobicao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.pousadadobicao.modelo.Cliente;
import br.com.pousadadobicao.modelo.Endereco;
import br.com.pousadadobicao.modelo.Reserva;

@Repository
public class JpaClienteDao implements ClienteDao {

	@PersistenceContext
	EntityManager manager;

	@Override
	public Cliente buscaPorId(Long idCliente) {
		return manager.find(Cliente.class, idCliente);
	}

	@Override
	public List<Cliente> lista() {
		return manager.createQuery(
				"select c from Cliente c join fetch c.endereco")
				.getResultList();
	}

	public List encontrarPorNome(Cliente cliente) {
		String nome = null;
		Query query = manager
				.createQuery("Select c from Cliente c where c.nome LIKE :nome");
		query.setParameter("nome", "%" + cliente.getNome() + "%");
		return query.getResultList();
	}

	@Override
	public void adiciona(Cliente cliente, Endereco endereco) {
		endereco.setCliente(cliente);
		manager.persist(cliente);
		manager.persist(endereco);
	}

	/*@Override
	public void altera(Cliente cliente, Endereco endereco, Reserva reserva) {
		cliente.setEndereco(endereco);
		cliente.setReserva(reserva);
		manager.merge(cliente);
		manager.merge(endereco);
	}*/

	/*@Override
	public void altera(Cliente cliente, Endereco endereco) {
		cliente.setEndereco(endereco);
		manager.merge(cliente);
	}
	*/
		
	/*@Override
	public void alteraRes(Reserva reserva) {
				manager.merge(reserva);
	}*/

	@Override
	public void altera(Cliente c, Endereco e, Reserva r) {
		Query query = manager
				.createQuery("UPDATE Cliente c SET c.celular = :celular , c.cpf = :cpf , c.dataNasc = :dataNasc , c.email = :email , c.nome = :nome , c.telefone = :telefone , c.sexo = :sexo, c.comentario = :comentario "
						+ "WHERE c.idCliente = :idCliente");
		query.setParameter("celular", c.getCelular());
		query.setParameter("cpf", c.getCpf());
		query.setParameter("dataNasc", c.getDataNasc());
		query.setParameter("email", c.getEmail());
		query.setParameter("nome", c.getNome());
		query.setParameter("telefone", c.getTelefone());
		query.setParameter("sexo", c.getSexo());
		query.setParameter("comentario", c.getComentario());
		query.setParameter("idCliente", c.getIdCliente());
		query.executeUpdate();
	}

    @Override
	public void alteraEnd(Endereco e, Reserva r) {
		Query query = manager.createQuery("UPDATE Endereco e SET e.bairro = :bairro , e.cep = :cep , e.cidade = :cidade , e.complemento = :complemento , e.estado = :estado , e.numero = :numero , e.pais = :pais , e.rua = :rua "
						+ "WHERE e.idEndereco = :idEndereco");
		query.setParameter("bairro", e.getBairro());
		query.setParameter("cep", e.getCep());
		query.setParameter("cidade", e.getCidade());
		query.setParameter("complemento", e.getComplemento());
		query.setParameter("estado", e.getEstado());
		query.setParameter("numero", e.getNumero());
		query.setParameter("pais", e.getPais());
		query.setParameter("rua", e.getRua());
		query.setParameter("idEndereco", e.getIdEndereco());
		query.executeUpdate();
	}
    
    @Override
	public void alteraRes(Reserva r) {
		Query query = manager.createQuery("UPDATE Reserva r SET r.quantidadePessoas = :quantidadePessoas , r.dataEntrada = :dataEntrada , r.dataSaida = :dataSaida , r.numeroQuarto = :numeroQuarto , r.statusReserva = :statusReserva , r.valorDiaria = :valorDiaria "
						+ "WHERE r.idReserva = :idReserva");
		query.setParameter("quantidadePessoas", r.getQuantidadePessoas());
		query.setParameter("dataEntrada", r.getDataEntrada());
		query.setParameter("dataSaida", r.getDataSaida());
		query.setParameter("numeroQuarto", r.getNumeroQuarto());
		query.setParameter("statusReserva", r.getStatusReserva());
		query.setParameter("valorDiaria", r.getValorDiaria());
		query.setParameter("idReserva", r.getIdReserva());
		query.executeUpdate();
	}
	
	
	@Override
	public void remove(Cliente cliente) {
		Cliente ClienteARemover = buscaPorId(cliente.getIdCliente());
		manager.remove(ClienteARemover);

	}

	/*
	 * public List encontrarPorId(Cliente cliente) { String idCliente = null;
	 * Query query =
	 * manager.createQuery("Select c from Cliente c where c.idCliente = :idCliente"
	 * ); query.setParameter("idCliente","%"+cliente.getIdCliente()+"%"); return
	 * query.getResultList( ); }
	 */

}
