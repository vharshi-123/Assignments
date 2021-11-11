import java.util.ArrayList;
import java.util.List;

public class OddLength {
	public static void main(String[] args) 
	{
		List<String> li=new ArrayList<>();
		li.add("Prassadh");
		li.add("madhavi");
		li.add("Harshinee");
		li.add("Shanmukh");
		
		System.out.println("Elements in the list are:");
		for (String string : li) {
			System.out.println(string);
		}
		li.removeIf(a->(a.length()%2 !=0));
		System.out.println("------------------------------------------");	
		for (String string : li) {
			System.out.println("Elements in the list without odd lengths are: " +string);
		}
	}
}
