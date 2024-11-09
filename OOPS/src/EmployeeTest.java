
public class EmployeeTest {
	public static void main(String[] args) {
		Adress employeeadress=new Adress("hyderabad","TG","india");
		Employee emp=new Employee(1001,"bharath",7095134631l,employeeadress);
		emp.displayEmployyee();
	}

}
