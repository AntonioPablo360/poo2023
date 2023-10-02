package exercicios;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Fatorial {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o número: ");
		int contador = 1, ValorFatorial = 1;
		int numero = input.nextInt();
		
		while (numero < 0 || numero % 2 != 0) {
			System.out.println("Valor invalido, digite novamente: ");
			numero = input.nextInt();
		}
		while(contador <= numero) {
			ValorFatorial = ValorFatorial * contador;
			contador += 1;
		}
		System.out.println("O valor fatorial de "+numero+" é de: "+ValorFatorial);
				

	}

}
