package entity;

public class Bank {

    private int account;
    private String name;
    private double balance;

    public Bank() {
    }

    public Bank(int account, String name, double balance) {
        this.account = account;
        this.name = name;
        this.balance = balance;
    }

    public Bank(int account, String name) {
        this.account = account;
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
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

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

	@Override
	public String toString() {
		return "Bank account:" + account + ", Name Account:" + name + ", Balance: $" + balance;
	}
    
}
