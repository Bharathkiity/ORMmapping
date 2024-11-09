
public class MovieTest  {

	public static void main(String[] args) throws CloneNotSupportedException  {
		
			movie m1=new movie(111,"devara","kortala shiva");
			movie m2=new movie(222,"rrr","rajamouli");
			//shallow cloning--one to another refrence 
			movie m3=m1;
			//deep cloning-- create independent object 
			movie m4=(movie)m2.clone();
			System.out.println("m2:"+m2.hashCode());
			System.out.println("m4:"+m4.hashCode());//Create independent object different objects
			//using clone method --create duplicate independent object
			
			System.out.println(m1);//hexadecimal to hashcode
			System.out.println(m2);//tostring call internally call  //m1 refrence
			
			System.out.println(m1.toString());//hash code convert to  @+hexamdecimal by using tostring object class
			System.out.println(m2.toString());
			System.out.println(m1.hashCode());//genetrate based on addresss
			System.out.println(m2.hashCode());//hashcode in oject class
			
			
			System.out.println(m1==m2);//== refrence comparison we can override posssible
			System.out.println(m1.equals(m2));//refrence  comparion
			
			String s1=new String("java");
			String s2=new String("java");
			System.out.println(s1.equals(s2));//content comaparsion
			System.out.println(s1==s2);//reference comparsion
				
		}
}
