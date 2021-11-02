import java.util.Scanner;

public class ArmNum {


static boolean isArmstrong(int n) {
	int temp,digits=0,last=0,sum=0;
	temp=n;
	while(temp>0)
	{
		temp=temp/10;
		digits++;
	}
	temp=n;
	while(temp>0)
	{
		last=temp%10;
		sum+= (Math.pow(last, digits));
		temp= temp/10;
	}
	if(n==sum) {
		return true;
	}
	else
		{
		return false;
		}
		}
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the number");
		num=scan.nextInt();
		System.out.println("numbers are "+ num);
		for(int i=0;i<=num;i++) {
			if(isArmstrong(i))
				System.out.println(i+ ",");
		}
	
}
}