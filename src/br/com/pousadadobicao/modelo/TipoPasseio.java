package br.com.pousadadobicao.modelo;

public class TipoPasseio {
 
	private int idTipoPasseio;
	 
	public int getIdTipoPasseio() {
		return idTipoPasseio;
	}

	public void setIdTipoPasseio(int idTipoPasseio) {
		this.idTipoPasseio = idTipoPasseio;
	}

	public String getNomeEmbarcacao() {
		return nomeEmbarcacao;
	}

	public void setNomeEmbarcacao(String nomeEmbarcacao) {
		this.nomeEmbarcacao = nomeEmbarcacao;
	}

	public String getTipoEmbarcacao() {
		return tipoEmbarcacao;
	}

	public void setTipoEmbarcacao(String tipoEmbarcacao) {
		this.tipoEmbarcacao = tipoEmbarcacao;
	}

	public String getLocalPasseio() {
		return localPasseio;
	}

	public void setLocalPasseio(String localPasseio) {
		this.localPasseio = localPasseio;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Evento getEventos() {
		return eventos;
	}

	public void setEventos(Evento eventos) {
		this.eventos = eventos;
	}

	private String nomeEmbarcacao;
	 
	private String tipoEmbarcacao;
	 
	private String localPasseio;
	 
	private Agencia agencia;
	 
	private Evento eventos;
	 
}
 
