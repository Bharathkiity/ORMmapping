
public class StringDemo2 {
	public static void main(String[] args) {
		
		String s="Java";
		System.out.println(s);
		System.out.println(s.hashCode());
		
		String s2=s.toUpperCase();
		System.out.println(s2);
		System.out.println(s);
		System.out.println(s.hashCode());
		
		String s3=s.toLowerCase();
		System.out.println(s3);
		System.out.println(s);
		System.out.println(s.hashCode());
		
		
	}

}
