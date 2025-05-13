package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Bank;

public class Project {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bank bank;

		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there a initial deposit? (y/n) ");
		char opcao = sc.next().charAt(0);
		if (opcao == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bank = new Bank(account, name, initialDeposit);
		} else {
			bank = new Bank(account, name);
		}
		System.out.println();
		System.out.println(bank);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		bank.deposit(amount);
		System.out.println();
		System.out.println("Update account data: \n" + bank);

		System.out.println();
		System.out.print("Enter a withdrawal value: ");
		amount = sc.nextDouble();
		bank.withdraw(amount);
		System.out.println();
		System.out.println("Update account data: \n" + bank);

		sc.close();
	}

}
