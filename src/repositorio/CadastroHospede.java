package repositorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Hospede;
import models.Quarto;

public class CadastroHospede {
	
	public static List<Hospede> listaHospede = new ArrayList<>();
	
	public static void cadastroHospede(Scanner input) {

		String nome;
		String tipo;
		String cpf;
		int dia;
		int mes;
		int ano;
		String telefone;
		String email;       

        System.out.println("Bem vindo ao sistema de CADASTRO DE HOSPEDE");

        System.out.println("Digite o nome completo do Hospede");
        nome = input.nextLine();

        System.out.println("Digite o nome tipo do Hospede. Ex.: Passeio, Negocio");
        tipo = input.nextLine();
        
        System.out.println("Digite o CPF do hospede");
        cpf = input.nextLine();

        System.out.println("Digite o dia do nascimento do hospede");
        dia = Integer.parseInt(input.nextLine());
        
        System.out.println("Digite o mes do nascimento do hospede");
        mes = Integer.parseInt(input.nextLine());
        
        System.out.println("Digite o ano do nascimento do hospede");
        ano = Integer.parseInt(input.nextLine());
        
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        
        System.out.println("Digite o telefone do hospede");
        telefone = input.nextLine();
        
        System.out.println("Digite o email do hospede");
        email = input.nextLine();
        
        Hospede novoHospede = new Hospede(nome, tipo, cpf, dataNascimento, telefone, email);
        listaHospede.add(novoHospede);
        
        System.out.println("O hospede " + novoHospede.getNome() + " foi registrado com sucesso sob o ID " + novoHospede.getIdHospede());
        
		}
	
    public static Hospede procuraIDHospede(List<Hospede> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getIdHospede() == id) {
                return list.get(i);
            }
        }
        return null;
    }

}
