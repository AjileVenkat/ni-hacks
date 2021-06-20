
public class CheckingAccount 
{
	private double amount;
	
	public CheckingAccount()
	{
		amount = 0;
	}
	
	public CheckingAccount(double amt)
	{
		amount = amt;
	}
	
	public void deposit(double amt)
	{
		amount += amt;
	}
	
	public void transfer(double amt, CheckingAccount other)
	{
		this.amount -= amt;
		other.amount += amt;
	}
	
	public void withdraw(double amt)
	{
		amount -= amt;
	}
	
	public double getBalance()
	{
		return amount;
	}
}
