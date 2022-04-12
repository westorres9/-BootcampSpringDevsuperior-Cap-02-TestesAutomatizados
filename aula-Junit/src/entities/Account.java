package entities;

public class Account {
	
	public static double DEPOSIT_FEE_PERCENTAGE = 0.02;
	
	private Long id;
	private Double balance;
	
	private Account() {
	}

	public Account(Long id, Double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
		amount += amount * DEPOSIT_FEE_PERCENTAGE;
		balance += amount;
		}
		else {
			System.out.println("amount not be negative value");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			throw new IllegalArgumentException();
		}
		else {
			balance -= amount;
		}
	}
	
	public double fullWithdraw() {
		double aux = balance;
		balance = 0.0;
		return aux;
	}

}
