import java.util.HashSet;
import java.util.Set;

public class Prgm1 {
	public static void main(String[] args) {
		Set<Employee> emp=new HashSet<>();
		emp.add(new Employee(101,"Harshitha",2000,"IT"));
		emp.add(new Employee(11,"HARSHITHA",2410,"Manager"));
		emp.add(new Employee(18,"hhhh",1700,"HR"));
		
		for(Employee e : emp)
		{
			System.out.println(e);
		}
		
	}
}

class Employee{
	int id;
	String name;
	int salary;
	String dept;
		
	public Employee(int id, String name, int salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}

	public void displayDetails()
	{
		//this.toString();
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+dept);
	}
}
