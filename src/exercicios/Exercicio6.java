package exercicios;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		String mensagem;
		//Dialogo de entrada
		mensagem = JOptionPane.showInputDialog("Digite uma mensagem: ");
		//Dialogo de saída
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
