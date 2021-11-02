import java.util.Scanner;
public class SearchInArray {	
		public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
		int a[]=new int[15];
		//	int a[i]= {1,2,3,4,5,6,7,7,8,9,1,4,0,9,8};
		int i,key;
		boolean found=false;
		System.out.println("Enter 15 elements in the array: ");
		for(i=0;i<15;i++) {
		a[i]=scan.nextInt();		
		}
		System.out.println("Enter the element to be searched: ");
		key=scan.nextInt();
		for(i=0;i<15;i++){
		if(a[i]==key){	
		found=true;
		System.out.println("Key " + key + " found in the array");		
		break;			
		}		
		}
		if(found==false) {
		System.out.println("Key " + key + " not found in the array");		
		}			
		}
}
