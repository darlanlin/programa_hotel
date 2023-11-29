package models;

public class Quarto {
	
	private static int totalQuartos;
	
	private int idQuarto;
	private String identificacao;
	private String tipo;
	private int limpeza;
	private int limiteOcupa;
	
	public Quarto(String identificacao, String tipo, int limpeza, int limiteOcupa) {
		this.idQuarto = totalQuartos + 1;
		this.identificacao = identificacao;
		this.tipo = tipo;
		this.limpeza = limpeza;
		this.limiteOcupa = limiteOcupa;
		
		totalQuartos = totalQuartos +1;
	}

	public int getIdQuarto() {
		return idQuarto;
	}

	public void setIdQuarto(int idQuarto) {
		this.idQuarto = idQuarto;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getLimpeza() {
		return limpeza;
	}

	public void setLimpeza(int limpeza) {
		this.limpeza = limpeza;
	}

	public int getLimiteOcupa() {
		return limiteOcupa;
	}

	public void setLimiteOcupa(int limiteOcupa) {
		this.limiteOcupa = limiteOcupa;
	}
	
	
	

}
