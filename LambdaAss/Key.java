import java.util.HashMap;
import java.util.Map.Entry;

public class Key {
	public static void main(String[] args)
	{
		HashMap<Integer,String> hs=new HashMap<>();
		StringBuilder sb=new StringBuilder();
		hs.put(1, "Team Leader ");
		hs.put(2, "Manager ");
		hs.put(3, "HR ");
		hs.put(4, "CEO ");
		System.out.println("The elements in the hashmap are: "+hs);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("After converting entire hashmap into a string, the result is:");
		for (Entry<Integer, String> m:hs.entrySet()) 
		{
			sb.append(m);
		}
		System.out.println(sb);
		System.out.println("-----------------------------------------------------------------");
	}

}
