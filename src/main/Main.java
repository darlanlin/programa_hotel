package main;

import java.util.Scanner;
import repositorio.*;

public class Main {
		
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
	        int opt;

	        do {
	            System.out.println("Bem vindo ao Grande Hotel Budapeste. Antes de iniciarmos, temos que fazer o cadastro de quartos");
	            System.out.println("0- Sair");
	            System.out.println("1- Cadastrar Quarto Novo");
	            System.out.println("2- Passar para Cadastro de Hospedes e Proximas Etapas");
	            opt = Integer.parseInt(input.nextLine());

	            switch (opt) {
	                case 0 -> System.out.println("Voce saiu do sistema");
	                case 1 -> CadastroQuarto.cadastroQuarto(input);
	                case 2 -> optCadastroHospede(input);
	                default -> System.out.println("Favor selecionar opcao valida");
	            }

	        } while (opt != 0);

	        input.close();
	        System.out.println("Sistema Desligado");
	        

	    }
			
		 private static void optCadastroHospede(Scanner input) {

		        int opt;

		        do {
		            System.out.println("Voce esta agora no modulo cadastro de Hospede");
		            System.out.println("0- Voltar");
		            System.out.println("1- Cadastrar Hospede");
		            System.out.println("2- Chamar Tela Reserva");
		            opt = Integer.parseInt(input.nextLine());


		            switch (opt) {
		                case 0 -> System.out.println("Retornando para tela anterior.");
		                case 1 -> CadastroHospede.cadastroHospede(input);
		                case 2 -> optCadastroReserva(input);
		                default -> System.out.println("Selecione uma opcao valida.");
		            }
		        } while (opt != 0);
		    }
		 
		 public static void optCadastroReserva(Scanner input) {

		        int opt;

		        do {
		            System.out.println("Voce esta agora no modulo cadastro de Reserva");
		            System.out.println("0- Voltar");
		            System.out.println("1- Cadastrar Reserva");
		            opt = Integer.parseInt(input.nextLine());


		            switch (opt) {
		                case 0 -> System.out.println("Retornando para tela anterior.");
		                case 1 -> CadastroReserva.cadastroReserva(input);
		                default -> System.out.println("Selecione uma opcao valida.");
		            }
		        } while (opt != 0);
		    }
		
}


