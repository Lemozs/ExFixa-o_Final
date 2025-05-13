package entity;

public class Bank {

    private int account;
    private String name;
    private double balance;

    public Bank() {
    }

    public Bank(int account, String name, double initialDeposit) {
        this.account = account;
        this.name = name;
        deposit(initialDeposit);
    }

    public Bank(int account, String name) {
        this.account = account;
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= (amount + 5.0);
    }

	@Override
	public String toString() {
		return "Account: " + account + ", Holder: " + name + ", Balance: $" + balance;
	}
    
}
