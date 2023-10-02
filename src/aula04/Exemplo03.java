package aula04;

import java.util.Scanner;

public class Exemplo03 {

	static void entradaTeclado() {
		Scanner input = new Scanner(System.in);
		System.out.println("Escolha uma opção: ");
		int opcao = input.nextInt();
	}
	
	public static void main(String[] args) {

		entradaTeclado();
		
		System.out.println("Fim do programa.");
	}

}
