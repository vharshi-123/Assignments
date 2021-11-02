import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		//int x[ ]= {68,89,87};
		//int s1=35;
		//int s2=89;
		//int s3=87;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the marks");
		int s1= scan.nextInt();
		int s2= scan.nextInt();
		int s3= scan.nextInt();
		if(s1>60) {
			if(s2>60) {
				if(s3>60) {
					System.out.println("the student is passed....");
				}
			}
			else {
				System.out.println("promoted");
			}
		}
		else {
			System.out.println("the student is failed...");
		}
		}
	}

