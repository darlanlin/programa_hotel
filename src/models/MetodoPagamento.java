package models;

public class MetodoPagamento {
	
	private String metodo;
	private String titularCartao;
	private String numeroCartao;
	private String codigoSeguranca;
	
	public MetodoPagamento(String metodo, String titularCartao, String numeroCartao,
			String codigoSeguranca) {
		this.metodo = metodo;
		this.titularCartao = titularCartao;
		this.numeroCartao = numeroCartao;
		this.codigoSeguranca = codigoSeguranca;
	}
	
	public MetodoPagamento(String metodo) {
		this.metodo = metodo;
		
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public String getTitularCartao() {
		return titularCartao;
	}

	public void setTitularCartao(String titularCartao) {
		this.titularCartao = titularCartao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getCodigoSeguranca() {
		return codigoSeguranca;
	}

	public void setCodigoSeguranca(String codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}
	
	

}
