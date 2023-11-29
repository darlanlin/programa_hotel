package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pagamento {
	
	private static int totalPagamentos;
	
	private int idPagamento;
	private LocalDate data;
	private double valor;
	private ArrayList<MetodoPagamento> metodosPagamento;
	
	public Pagamento(LocalDate data, double valor) {
		super();
		idPagamento = totalPagamentos + 1;
		this.data = data;
		this.valor = valor;
		this.metodosPagamento = new ArrayList<MetodoPagamento>();
		
		totalPagamentos = totalPagamentos + 1;
		
	}
	
	public void criarMetodoPagamentoCartao(String metodo, String titularCartao, String numeroCartao,
			String codigoSeguranca) {
		MetodoPagamento pagamentoCartao = new MetodoPagamento(metodo,titularCartao, numeroCartao, codigoSeguranca);
		metodosPagamento.add(pagamentoCartao);
		
	}
	
	public void criarMetodoPagamentoDinheiro(String metodo) {
		MetodoPagamento pagamentoCartao = new MetodoPagamento(metodo);
		metodosPagamento.add(pagamentoCartao);
			
	}

	public int getIdPagamento() {
		return idPagamento;
	}

	public void setIdPagamento(int idPagamento) {
		this.idPagamento = idPagamento;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public ArrayList<MetodoPagamento> getMetodosPagamento() {
		return metodosPagamento;
	}

	public void setMetodosPagamento(ArrayList<MetodoPagamento> metodosPagamento) {
		this.metodosPagamento = metodosPagamento;
	}
	
}
