package exercicios;
import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		// criar as variaveis
		int valor1 = 0, valor2 = 0; 
		double resultado = 0;
		// Solicitar v1 e v2 do teclado
		Scanner input = new Scanner(System.in);
		System.out.println("Digite valor 1: ");
		valor1 = input.nextInt();
		System.out.println("Digite valor 2: ");
		valor2 = input.nextInt();
		resultado = valor1 + valor2;
		System.out.println("Soma: "+resultado);
		resultado = valor1 - valor2;
		System.out.println("Subtração: "+resultado);
		resultado = valor1 * valor2;
		System.out.println("Multiplcação: "+resultado);
		if(valor2 != 0) {
			resultado = valor1 / valor2;
			System.out.println("Divisão: "+resultado);
		}else{
			System.out.println("O den deve dife de 0");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
