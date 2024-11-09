
public class Employee {
	int employeeId;         //properties, VARIABLE
	String employeeName;
	long employeeMobile;;
	Adress employeeAddress;// (ENETITY REFERNCE)  HAS A REALTIONSHIP --COMPOSTION
	
	//generate constructors
	public Employee(int employeeId, String employeeName, long employeeMobile, Adress employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeMobile = employeeMobile;
		this.employeeAddress = employeeAddress;
	}
	public void displayEmployyee() {
		System.out.println("EmployyeeId   :   "+employeeId);
		System.out.println("Employyeename :   "+employeeName);
		System.out.println("Employyeemobile:  "+employeeMobile);
		employeeAddress.displayAdress();
		
	}
	

}
