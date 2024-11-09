
public class studentTest {

	public static void main(String[] args) {
		//object creation and instatintaion//values heere initliaze
		StudentClass s1=new StudentClass(101,"bharath",50);
		s1.displayStudentDetails();
		s1.studentResult();
		
	System.out.println("----------------------");
		StudentClass s2=new StudentClass(102,"bhargav",60);
		s2.displayStudentDetails();
		s2.studentResult();
		
		//
		StudentClass s3=new StudentClass(10,"linga",65);
		s3.displayStudentDetails();
		s3.studentResult();
		
		StudentClass s4=new StudentClass();
		s4.displayStudentDetails();
		s4.studentResult();
		
	}

}
