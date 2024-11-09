 
public class Student {

	private int studentId;
	private String studentName;
	private String studentEmail;
	private Long studentMobile;
	
	public Student() {
		super();
	}
	
	public Student(int stduentId, String studentName, String studentEmail, Long studentMobile) {
		super();
		this.studentId = stduentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentMobile = studentMobile;
	}
	//Setter and getter methods ,constructors initliaze methods 
	//to access properties outside

	public int getStudentId() {//for initlixzation
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public Long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	
}
