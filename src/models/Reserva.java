package models;

import java.time.LocalDate;

public class Reserva {
	
	private static int totalReservas;
	
	private int idReserva;
	private String identificacao;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private int quantidadePessoas;
	private String status;
	private Hospede hospede;
	private Quarto quarto;
	
	public Reserva(LocalDate dataInicio, LocalDate dataFim, int quantidadePessoas, Hospede hospede, Quarto quarto) {
		super();
		this.idReserva = totalReservas + 1;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.quantidadePessoas = quantidadePessoas;
		this.status = "OK";
		this.hospede = hospede;
		this.quarto = quarto;
		
		totalReservas = totalReservas + 1;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	
	

}
