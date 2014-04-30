package br.com.pousadadobicao.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idEvento;
	private long idAgencia;
	private String descricao;
	private int idLocal;
    private int IdNomeEmbarcacao;
    
	public Long getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}
	public long getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(long idAgencia) {
		this.idAgencia = idAgencia;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getIdLocal() {
		return idLocal;
	}
	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
	}
	public int getIdNomeEmbarcacao() {
		return IdNomeEmbarcacao;
	}
	public void setIdNomeEmbarcacao(int idNomeEmbarcacao) {
		IdNomeEmbarcacao = idNomeEmbarcacao;
	}
	

}
