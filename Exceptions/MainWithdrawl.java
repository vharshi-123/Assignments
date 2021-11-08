
public class MainWithdrawl {
	public static void main(String[] args) 
	{
		SavingsAccount sa = new SavingsAccount();
		sa.deposit(1200);
		try {
			sa.withdraw(100);
		}catch(Exception e)
		{
			System.out.println("InsufficientBalanceException "+e);
		}

	}
}
