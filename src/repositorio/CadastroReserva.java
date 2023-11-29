package repositorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Hospede;
import models.Pagamento;
import models.Quarto;
import models.Reserva;

import main.Main;

public class CadastroReserva {

public static List<Reserva> listaReserva = new ArrayList<>();
	
	public static void cadastroReserva(Scanner input) {

		int dia;
		int mes;
		int ano;
		int quantidadePessoas;
		Quarto quartoSelecionado;
		Hospede hospedeSelecionado;    
		
		int id;
		int opt;


		do {
            System.out.println("Digite o ID do hospede que deseja fazer a reserva");
            id =  Integer.parseInt(input.nextLine());
            hospedeSelecionado = CadastroHospede.procuraIDHospede(CadastroHospede.listaHospede, id);
            
            
            System.out.println("O ID selecionado e referente ao Hospede\nID: " + hospedeSelecionado.getIdHospede() + "\nNome: " + hospedeSelecionado.getNome() + "\nE-mail de Contato: " + hospedeSelecionado.getEmail());
                             
            System.out.println("O hospede selecionado esta correto? Selecione as opções abaixo:");
            System.out.println("0- Cancelar");
            System.out.println("1- Reinserir ID");
            System.out.println("2- Confirmar");

            opt = Integer.parseInt(input.nextLine());

            switch (opt) {
                case 0 -> System.out.println("Retornando");
                case 1 -> System.out.println("Nova Seleção");
                case 2 -> System.out.println("Seleção Confirmada");
                default -> System.out.println("Favor selecionar opcao valida");
            }

        } while (opt != 0 && opt != 2);
        
        if (opt == 0) {
        	Main.optCadastroReserva(input);;
        }
		
		do {
            System.out.println("Digite o ID do quarto que deseja reservar");
            id =  Integer.parseInt(input.nextLine());
            quartoSelecionado = CadastroQuarto.procuraIDQuarto(CadastroQuarto.listaQuarto, id);
            
            
            System.out.println("O ID selecionado e referente ao seguinte Quarto\nID: " + quartoSelecionado.getIdQuarto() + "\nIdentificacao do Quarto: " + quartoSelecionado.getIdentificacao() + "\nQuarto Tipo: " + quartoSelecionado.getTipo());
                             
            System.out.println("O quarto selecionado está correto? Selecione as opções abaixo:");
            System.out.println("0- Cancelar");
            System.out.println("1- Reinserir ID");
            System.out.println("2- Confirmar");

            opt = Integer.parseInt(input.nextLine());

            switch (opt) {
                case 0 -> System.out.println("Retornando");
                case 1 -> System.out.println("Nova Seleção");
                case 2 -> System.out.println("Seleção Confirmada");
                default -> System.out.println("Favor selecionar opcao valida");
            }

        } while (opt != 0 && opt != 2);
        
        if (opt == 0) {
        	Main.optCadastroReserva(input);;
        }
        
        System.out.println("Quantas pessoas vao ocupar a reserva?");
        quantidadePessoas =  Integer.parseInt(input.nextLine());
        
        System.out.println("Insira as informações DO INÍCIO DA RESERVA");
        System.out.println("Digite o dia do inicio da reserva");
        dia = Integer.parseInt(input.nextLine());
        
        System.out.println("Digite o mes do inicio da reserva");
        mes = Integer.parseInt(input.nextLine());
        
        System.out.println("Digite o ano do inicio da reserva");
        ano = Integer.parseInt(input.nextLine());
        
        LocalDate dataInicio = LocalDate.of(ano, mes, dia);
        
        System.out.println("Insira as informações DO FIM DA RESERVA");
        System.out.println("Digite o dia do fim da reserva");
        dia = Integer.parseInt(input.nextLine());
        
        System.out.println("Digite o mes do fim da reserva");
        mes = Integer.parseInt(input.nextLine());
        
        System.out.println("Digite o ano do fim da reserva");
        ano = Integer.parseInt(input.nextLine());
        
        LocalDate dataFim = LocalDate.of(ano, mes, dia);
        
        Reserva novaReserva = new Reserva(dataInicio, dataFim, quantidadePessoas, hospedeSelecionado, quartoSelecionado);
        novaReserva.setIdentificacao("Reserva do Quarto " + quartoSelecionado.getIdentificacao() + " pelo hospede " + hospedeSelecionado.getNome());
        listaReserva.add(novaReserva);
        
        System.out.println(novaReserva.getIdentificacao());
        
	
	}
}
