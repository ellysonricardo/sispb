package br.com.pousadadobicao.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ValorDiaria {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idValorDiaria;
	private String mes;
	private String pacote;
	private Double valor;

	public Long getIdValorDiaria() {
		return idValorDiaria;
	}

	public void setIdValorDiaria(Long idValorDiaria) {
		this.idValorDiaria = idValorDiaria;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getPacote() {
		return pacote;
	}

	public void setPacote(String pacote) {
		this.pacote = pacote;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
