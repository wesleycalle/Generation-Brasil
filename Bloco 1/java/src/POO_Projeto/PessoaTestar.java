package POO_Projeto;

import java.util.Scanner;

public class PessoaTestar {

	public static void main(String[] args) {
		
		//CRIANDO VARI�VEIS
		
		int opcao;
		String nome;
		int cadastro;
		
		//CRIANDO OBJETO COM O PRIMEIRO CONSTRUCTOR
		Morador m1 = new Morador ();
		
		Scanner escreva = new Scanner(System.in);
		
		
		
		//CRIANDO O PROGRAMA
		do {
		System.out.println("\n-------------------------------");
		System.out.println("MENU");
		System.out.println("Escolha uma das op��es");
		System.out.println("1 - Morador");
		System.out.println("2 - Visitante");
		System.out.println("3 - Nenhum dos dois");
		System.out.println("0 - SAIR");

		
		opcao = escreva.nextInt();
		escreva.nextLine();
		
		switch (opcao) {
			case 1:
				System.out.println("Nome: ");
				nome = escreva.nextLine();
				System.out.println("Cadastro? 1 - SIM / 2 - N�O ");
				cadastro = escreva.nextInt();
				
				
		//PUXANDO CONSTRUCTOR E PAR�METROS
				m1 = new Morador (nome, cadastro);
		//PUXANDO M�TODO
				m1.entrar();
				
				break;
			
			case 2:
				
				break;
				
			case 3:
				break;
				
			case 0:
				System.out.println("At� mais senhor...");
				break;
				
				
			default:
			System.out.println("Op��o inv�lida..");
				
			
		}
		} while (opcao != 0);

		m1.status();
	}

}
