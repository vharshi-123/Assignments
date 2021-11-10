import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class P4 {
	public static void main(String[] args) {
		List<LocalDate> ll=new LinkedList<>();
		ll.add(LocalDate.of(1999,Month.OCTOBER,28));
		ll.add(LocalDate.of(1969,Month.FEBRUARY,15));
		ll.add(LocalDate.of(2000,Month.JANUARY,10));
		ll.add(LocalDate.of(1975,Month.JULY,28));
		ll.add(LocalDate.of(1969,Month.JUNE,12));
		ll.add(LocalDate.of(2006,Month.DECEMBER,21));
		ll.add(LocalDate.of(2004,Month.OCTOBER,30));
		ll.add(LocalDate.of(2016,Month.MARCH,31));
		ll.add(LocalDate.of(2020,Month.SEPTEMBER,20));
		ll.add(LocalDate.of(2021,Month.NOVEMBER,11));
		
		for(LocalDate ld: ll)
		{
			if(ld.isLeapYear())
			{
				System.out.println("Your date of birth is "+ld+" and it was leap year");
			}
			else
			{
				System.out.println("Your date of birth is "+ld+" and it was not leap year");
			}
		}
	}
}
