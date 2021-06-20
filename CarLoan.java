public class CarLoan extends Loan
{
private static final double INTEREST_RATE = 0.04;
	
	public CarLoan(double amt)
	{
		super(amt, 5);
	}
	
	public CarLoan(double amt, double years)
	{
		super(amt,years);
	}
	
	public void calculate()
	{
		setAmount(getAmount() * Math.pow(1+INTEREST_RATE, getYears()));
	}
}
