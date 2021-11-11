import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UpCast implements UnaryOperator<String> {

		@Override
		public String apply(String t) 
		{
			return t.toUpperCase();
		}
	}
	     class UpCasted {	
		public static void main(String[] args)
		{
			List<String> li=new ArrayList<>();
			li.add("prassadh");
			li.add("madhavi");
			li.add("harshinee");
			li.add("shanmukh");
			System.out.println("Elements in list are:");
			System.out.println(li);
			System.out.println("----------------------------------------------------------------");
			li.replaceAll(new UpCast());
			System.out.println("Elements in list after replacing with upper case letters are: " +li);
				
		}

	}

