
public class BankAccounts {
	public static void main(String[] args) {
		
	
	int a1,a2;
	BankAccounts b1=new Savings();
	BankAccounts b2= new Current();
	a1=((Savings) b1).cash();
	a2=((Current) b2).cash();
	int Total = a1+a2;
	System.out.println("Total cash in the bank is Rs."+Total);

			}
	

}




