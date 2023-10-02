package exercicios;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {
		
		double raio,area;
		//Integer.parseInt()
		
		raio = Double.parseDouble(
				JOptionPane.showInputDialog(
						"Digite o raio: "));
		if (raio > 0) {
			area = Math.PI*(raio*raio);
			JOptionPane.showMessageDialog(null,area);
		}else {
			System.out.println("Valor inválido");
		}
		
		
	}
}
