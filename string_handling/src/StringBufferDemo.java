
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("Java");
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		
		StringBuffer s1=new StringBuffer("python");
		StringBuffer s2=new StringBuffer("python");
		
		System.out.println(s1==s2);//refernence  comparsion
		System.out.println(s1.equals(s2));//reference comparsion
		
		
		
		
	}

}
