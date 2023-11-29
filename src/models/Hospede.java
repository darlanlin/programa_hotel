package models;

import java.time.LocalDate;

public class Hospede {
	
	private static int totalHospedes;
	
	private int idHospede;
	private String nome;
	private String tipo;
	private String cpf;
	private LocalDate dataNacimento;
	private String telefone;
	private String email;
	
	public Hospede(String nome, String tipo, String cpf, LocalDate dataNacimento, String telefone,
			String email) {
		this.idHospede = totalHospedes + 1 ;
		this.nome = nome;
		this.tipo = tipo;
		this.cpf = cpf;
		this.dataNacimento = dataNacimento;
		this.telefone = telefone;
		this.email = email;
		
		totalHospedes = totalHospedes + 1;
	}

	public int getIdHospede() {
		return idHospede;
	}

	public void setIdHospede(int idHospede) {
		this.idHospede = idHospede;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNacimento() {
		return dataNacimento;
	}

	public void setDataNacimento(LocalDate dataNacimento) {
		this.dataNacimento = dataNacimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
