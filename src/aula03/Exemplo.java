package aula03;
import java.util.Scanner;
class Exemplo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Valor 1: ");
		int valor1 = input.nextInt();
		System.out.println("Valor 2: ");
		int valor2 = input.nextInt();
		double resultado = valor1 + valor2;
		System.out.println("Soma = "+resultado);
		resultado = valor1 - valor2;
		System.out.println("Subtração = "+resultado);
		resultado = valor1 * valor2;
		System.out.println("Subtração = "+resultado);
		resultado = valor1/valor2;
		System.out.println("Subtração = "+resultado);
	}
}
		