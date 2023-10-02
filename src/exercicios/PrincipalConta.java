package exercicios;
public class PrincipalConta {
	public static void main(String[] args) {
		Conta ct1 = new Conta();
		ct1.agencia = "Pedro II";
		ct1.numero = 332445;
		ct1.saldo = 30.00;
		ct1.tipo = 2;
		
		Conta ct2 = new Conta();
		ct2.agencia = "Piripiri";
		ct2.numero = 11223;
		ct2.saldo = 5000.00;
		ct2.tipo = 1;
		
		Conta ct3 = new Conta();
		ct3.agencia = "Pedro II";
		//TODO - outros valores da ct3		
		Conta ct4 = new Conta();
		ct4.agencia = "Pedro II";
		//TODO - outros valores da ct4
		Conta ct5 = new Conta();
		ct5.agencia = "Teresina";
		//TODO - outros valores da ct5
	}
}
