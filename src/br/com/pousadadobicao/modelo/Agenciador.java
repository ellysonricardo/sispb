package br.com.pousadadobicao.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Agenciador extends Pessoa {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAgenciador;
	private String empresa;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "agenciador")
	private List<Endereco> enderecos;
	
	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	 
	public Long getIdAgenciador() {
		return idAgenciador;
	}

	public void setIdAgenciador(Long idAgenciador) {
		this.idAgenciador = idAgenciador;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public void recebePorcentagem() {
	 
	}
	 
}
 
