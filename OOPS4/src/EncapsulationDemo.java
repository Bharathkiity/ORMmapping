
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1001,"bharath","bharathkitty9009@gmail.com",7095134631l);
		//s2.setStudentName("linga");
		System.out.println(s1.getStudentId());
		System.out.println(s1.getStudentName());
		System.out.println(s1.getStudentEmail());
		System.out.println(s1.getStudentMobile());
		
		
		System.out.println("===========");
		Student s2=new Student();
		s2.setStudentName("linga + langarhouse");
		s2.setStudentId(10002);
		s2.setStudentEmail("linga@gmail.com");
		s2.setStudentMobile(566561l);
		System.out.println(s2.getStudentId());
		System.out.println(s2.getStudentName());
		System.out.println(s2.getStudentEmail());
		System.out.println(s2.getStudentMobile());
		
	}
	
	

}
