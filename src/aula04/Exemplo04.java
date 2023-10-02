package aula04;

import java.util.Scanner;

public class Exemplo04 {
	
	static int MostraMenu() {
		Scanner input = new Scanner(System.in);
		int opcao;
		System.out.println("Disciplina de ED1");
		System.out.println("Estruturas");
		System.out.println("1 - Listas Estáticas");
		System.out.println("2 - Listas Dinâmica");
		System.out.println("3 - Pilhas Estáticas");
		System.out.println("4 - Pilhas Dinâmicas ");
		System.out.println("5 - Filas Estáticas");
		System.out.println("6 - Filas Dinâmicas");
		System.out.println("7 - Sair");
		System.out.println("Escolha a opção: ");
		opcao = input.nextInt();
		return opcao;
	}

	public static void main(String[] args) {	
		int op;
		do {
			op = MostraMenu();
		}while(!(op >= 1 && op <= 7));		
	}

}










