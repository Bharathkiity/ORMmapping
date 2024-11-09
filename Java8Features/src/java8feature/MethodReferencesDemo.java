package java8feature;
//no implementation in business logic then we use method reference
interface Greet{
	void wish();
}

public class MethodReferencesDemo {
	public static void  sayHello() {
		System.out.println("hello ...");

	}
	public void sayHi() {
		System.out.println("say hii...");
	}

	public static void main(String[] args) {
		Greet g=()-> MethodReferencesDemo.sayHello();
		g.wish();
		
		
		 //static method reference
		Greet g2=  MethodReferencesDemo :: sayHello;
		g2.wish();
		
		
		MethodReferencesDemo d=new MethodReferencesDemo();
		Greet g3=()->d.sayHi();
		g3.wish();
		
		//instance method refernece
		Greet g4=d::sayHi;
		g4.wish();
		
	}

}
