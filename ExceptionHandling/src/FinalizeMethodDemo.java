class Employee{
	int employeeId;
	String employeeName;
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	@Override
	public void finalize() {
		System.out.println("finalize()"); 
		
	}
}
public class FinalizeMethodDemo {
public static void main(String[] args) {
	Employee e1=new Employee(100, "wills");
	Employee e2=new Employee(101, "linga");
	System.out.println(e1);
	System.out.println(e2);
	System.out.println("===============");
	e1=e2;//1.assigning reference to another reference
	System.out.println(e1);
	System.out.println(e2);
	//anonymous objcet-namlesss object no reference
	new Employee(1000,"lingashewar");//2.anonymous object eligible for garbage collection
	
	Employee e3=new Employee(1004,"alice");
	e3=null;//3. nullifying the reference
	
	//request JVM to call garbage collector 
	System.gc();
	
}
}
