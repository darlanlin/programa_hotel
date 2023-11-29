package repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Quarto;

public class CadastroQuarto {
	


	public static List<Quarto> listaQuarto = new ArrayList<>();
	
	public static void cadastroQuarto(Scanner input) {

        String identificacao;
        String tipo;
        int limpeza;
        int limiteOcupa;       

        System.out.println("Bem vindo ao sistema de CADASTRO DE QUARTOS");

        System.out.println("Digite a identificacao do Quarto");
        identificacao = input.nextLine();

        System.out.println("Agora, digite o nome tipo do Quarto. Ex.: Casal, Solteiro");
        tipo = input.nextLine();

        System.out.println("O quarto necessita de limpeza?\n0- Nao\n1- Sim");
        limpeza =  Integer.parseInt(input.nextLine());

        System.out.println("Informe o limite de ocupacao");
        limiteOcupa = Integer.parseInt(input.nextLine());
        
        Quarto novoQuarto = new Quarto(identificacao, tipo, limpeza, limiteOcupa);
        listaQuarto.add(novoQuarto);
        
        System.out.println("O quarto " + novoQuarto.getIdentificacao() + " foi registrado com sucesso sob o ID " + novoQuarto.getIdQuarto());
        
		}
	
    public static Quarto procuraIDQuarto(List<Quarto> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getIdQuarto() == id) {
                return list.get(i);
            }
        }
        return null;
    }
	
	}
