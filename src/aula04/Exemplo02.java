package aula04;

import java.util.Scanner;

public class Exemplo02 {
	
	static void area(double r) {
		System.out.println("Calculando área . . .");
		double area = Math.PI*r*r;
		System.out.println("Área = "+area);
	}
	
	static void comprimento(double r) {
		System.out.println("Calculando comprimento . . .");
		double comprimento = 2 * Math.PI * r;
		System.out.println("Comprimento ="+comprimento);
		
	}
	
	static void diametro(double r) {
		System.out.println("Calculando diamentro . . .");
		double diametro = 2 * r;
		System.out.println("Diametro = "+diametro);
			
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double raio = input.nextDouble();
		
		area(raio);
		
		comprimento(raio);
		
		diametro(raio);
		
		System.out.println("Fim do programa.");
	}

}
