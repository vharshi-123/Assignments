import java.util.Arrays;

public class Prgrm3 {
	public static void main(String[] args) {
		Double ar[]= {65.0,32.01,25.36,78.01,56.1,36.02,89.2};
		swap(ar, 3, 5);
		System.out.println(Arrays.toString(ar));
	}
	
	public static <Type>void swap(Type a[],int i,int j){
		Type temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
