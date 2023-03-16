package entities;

import entities.interfaces.Contas;

abstract public class Conta implements Contas {
	
	protected String name;
	protected String middleName;
	protected int id;
	protected int balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBalance() {
		return balance;
		
	}
	
	public void withdraw(int ammount) {
		if(ammount == 0.0) {
			System.out.println("Valor abaixo do valor minimo!");
		}else {
			this.balance += ammount;
		}
	}
	
	public Conta() {
		
	}
	
	public Conta(String name, String middleName, int id, int balance) {
		this.name = name;
		this.middleName = middleName;
		this.id = id;
		this.balance = balance;
	}
	
	

}
