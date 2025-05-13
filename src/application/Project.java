package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Bank;

public class Project {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bank bank = new Bank();

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		bank.setAccount(accountNumber);
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		bank.setName(accountHolder);
		System.out.print("Is there a initial deposit? (y/n) ");
		char opcao = sc.next().charAt(0);
		double initialDeposit = 0;
		if (opcao == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
			bank.setBalance(initialDeposit);
			System.out.println(bank);
		} else {
			System.out.println(bank);
		}
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double amount = sc.nextDouble();
		bank.deposit(amount);
		System.out.println("Update account data: \n" + bank);
		
		System.out.println();
		System.out.println("Enter a withdrawal value: ");
		amount = sc.nextDouble();
		bank.withdrawal(amount);
		System.out.println("Update account data: \n" + bank);
		

		sc.close();
	}

}
