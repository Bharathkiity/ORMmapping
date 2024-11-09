
public class StudentClass {
	//inside class , instance variable, static var
	int studentId;
	String studentName;//PROPERTIESS ALL
	double studentMarks;
	//memomery allocate for once 
	//static variable
	static String studentBatchCode="2024-12634";
	
	public StudentClass() {
		System.out.println("O constrcutor.....");
		
	}	

	// OUR OWN initiliase  value 
	// constructor //case senitive
	//zero construcor
	//initilze propeties here
	 public StudentClass(int studentId,String studentName,double studentMarks) {
		 System.out.println("parameterized constructor");
		// void normal methoad but not a constructor
		//instance propeties and construtor both are same local use this keyword
		//if both are different no need this keyword change
		
		System.out.println("constrctor");
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentMarks=studentMarks;
		
	}
	//instance method
	public void studentResult() {
		if(studentMarks>30) {
			System.out.println("student result: pass");
		}else {
			
			System.out.println("student result:fail");
		}
		
		
	}
	public void displayStudentDetails() {
		System.out.println("student id:    "+studentId);
		System.out.println("student name:  "+studentName);
		System.out.println("student marks: "+studentMarks);
		System.out.println("student BatchCode:"+studentBatchCode);
	}

}
