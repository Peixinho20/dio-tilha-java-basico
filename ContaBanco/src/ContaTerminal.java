import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

	public static void main(String [] args){
		//receber dados via terminal conforme os atributos abaixo
		//exibir esse parametros no final
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo(a) ao terminal bancário:");
		System.out.println("Por favor, digite o número da Agencia, incluindo o hífen: ");
		String agencia = sc.nextLine();
		
		System.out.println("Por favor, digite o número da conta: ");
		int conta = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Por favor, digite o nome do cliente: ");
		String nome = sc.nextLine();
		
		System.out.println("Por favor, digite o seu saldo: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Olá " + nome
		+ ", obrigado por criar uma conta em nosso banco, sua agência é "
		+ agencia
		+ ", sua conta é "
		+ conta
		+ " e o seu saldo $"
		+ saldo
		+" já esá disponível para saque.");
		
		sc.close();
	} 
}	
