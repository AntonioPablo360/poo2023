package aula04;

public class Exemplo {
	
	static void soma(int a, int b) {
		double resultado = a + b;
		System.out.println("Soma = "+resultado);
	}
	
	static void sub(int a, int b) {
		double resultado = a - b;
		System.out.println("Subtração = "+resultado);
	}

	static void mult(int a, int b) {
		double resultado = a * b;
		System.out.println("Multiplicação = "+resultado);
		
	}

	static void divisao(int a, int b) {
		double resultado = a / b;
		System.out.println("Divisão = "+resultado);
		
	}

	static void potencia(int a, int b) {
		double resultado = Math.pow(a, b);
		System.out.println("Potencia = "+resultado);
		
	}
	
	public static void main(String[] args) {
		int a = 2;
		int b = 6;
	
		soma(a,b);
		
		sub(a,b);
		
		mult(a, b);

		divisao(a, b);

		potencia(a, b);
		
		System.out.println("Fim do programa.");	
	}

}
