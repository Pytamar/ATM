package entities;

import entities.interfaces.Contas;

public class ContaPoupança extends Conta implements Contas {
	
	public void deposit(int ammount) {
		this.balance += ammount;
		System.out.println("Your money has been successfully deposited");
	}
	
	public void withdraw(int ammount) {
		if(this.balance < ammount) {
			System.out.println("Saldo insuficiente!!!");
		}else {
			this.balance -= ammount;
			System.out.println("Dinheiro sacado com sucesso!!!");
		}
	}
	
	public ContaPoupança() {
		
	}
	
	public ContaPoupança(String name, String middleName, int id, int balance ) {
		this.name = name;
		this.middleName = middleName;
		this.id = id;
		this.balance = balance;
	}
	
	public ContaPoupança(String name, String middleName, int id) {
		this.name = name;
		this.middleName = middleName;
		this.id = id;
	}

	
	}



