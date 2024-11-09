
class parent {
	//stop override  //add final not to overiride--error stop override
	//final -can't be override
		 public  void study() {
			System.out.println("medicine ....");
		}
		public void property() {
			System.out.println("100acres of land ....");
		}
		public void marry() {
			System.out.println("arranged linga marriage....");
		}
	}
	
	class child extends parent{
	//not happy with marriage and change his implementation diferent 
		@Override//this method not for child for parent only
		public void marry() {
			super.marry();//both implementation and same method access parent class method
			System.out.println("love linga marriage....");
		}
//		//@Override
//		 public void study() {
//			System.out.println("acting....");
//		}
		
	}	
		

	public class OverRidingDemo {
		public static void main(String[] args) {
			
	parent p=new parent();
	p.marry();
	p.study();
	p.property();
			
	System.out.println("---------------");		
		
	child c=new child();
	c.study();
	c.property();
	c.marry();
	
}
}
