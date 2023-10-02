
package exercicios;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("digite o valor do termo digitado:");
		int op = input.nextInt();
		
		int t1 =0;
		int t2 =1;
		int t3 =1;
		int c =0;
		while(c <op) {
			
			t1 =t2;
			t2 =t3;
			t3 =t1+t2;
			
			c++;
		}
		System.out.println("o valor é " + t1);
		
		
		
	}

}
