package application;

import java.util.Scanner;

import entities.Conta;
import entities.ContaPoupança;

public class Program {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Enter name account: ");
		String nameAccount = teclado.next();
		System.out.print("Enter middle name account: ");
		String middleName = teclado.next();
		System.out.print("Enter the id account: ");
		int id = teclado.nextInt();
		
		Conta ContaPoupança = new ContaPoupança(nameAccount, middleName, id);
			
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("Caixa Eletronico!!! || Automated Teller Machine");
			System.out.println("Escolha 1 para depositar!!! || Choose 1 for Deposit");
			System.out.println("Escolha 2 para sacar!!! || Choose 2 for Withdraw");
			System.out.println("Escolha 3 para ver o extrato!!! || Choose 3 for Check Balance");
			System.out.println("Escolha 4 para sair || Choose 4 for exit");
			System.out.println(" ");
			System.out.println("Escolha a operação que você quer: ");
		
		
		
		   int key = teclado.nextInt();  
		
		   switch (key) {
		   case 1:
			System.out.println("Montante solicitado para o deposito: ");
			int Deposit = teclado.nextInt();
			ContaPoupança.deposit(Deposit);
		
			break;
		
		   case 2:
			System.out.println("Montate solicitado para o saque");
			int withdraw = teclado.nextInt();
			ContaPoupança.withdraw(withdraw);
			break;
		
		   case 3:
			System.out.println("Solicitando o extrato");
			System.out.println(ContaPoupança.getBalance());
			break;
		
		   case 4:
			System.exit(0);
			
			break;
		} 
		
		}
	}	

}
