package br.com.pousadadobicao.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Funcionario extends Pessoa {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idFuncionario;
	private int tipo;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "funcionario")
	private List<Endereco> enderecos;
	 
	public Long getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	
	
	public void fazCadastroCliente() {
	 
	}
	 
	
	public void fazCadastroFuncionario() {
	 
	}
	 
	

	public void checkin() {
	 
	}
	 
	
	public void checkout() {
	 
	}
	 
	
	public void cadastraConsumo() {
	 
	}
	 
}
 
