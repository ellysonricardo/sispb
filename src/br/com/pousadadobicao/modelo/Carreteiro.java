package br.com.pousadadobicao.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carreteiro extends Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCarreteiro;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "carreteiro")
	private List<Endereco> enderecos;

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public long getIdCarreteiro() {
		return idCarreteiro;
	}

	public void setIdCarreteiro(long idCarreteiro) {
		this.idCarreteiro = idCarreteiro;
	}

	public void recebeCliente() {

	}
}
