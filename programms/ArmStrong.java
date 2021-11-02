import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n= scan.nextInt();
		int n1=n;
		int sum=0;
		int temp;
		while(n>0) {
			temp=n%10;
			n=n/10;
			temp=temp*temp*temp;
			sum=sum+temp;
			
		}
	    if(n1==sum) {
	    	System.out.println("it's a armstrong number");
	    }
	    else {
	    	System.out.println("it's not a armstrong number");
	    }
		
	}

}
