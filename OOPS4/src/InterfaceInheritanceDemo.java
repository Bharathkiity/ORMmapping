interface A{
	void m1();
}
//single 
interface B extends A{
	//void m1();
}
//multilevel
interface c extends B{}
interface x{
	void m1();
}
interface y{
	void m1();
}
//multiple inheritance
interface z extends x,y{}
class employee{}

//class implemenet two inteface //two have same name method then take one
class xyz extends employee implements x,y{//one imp in class
	@Override
	public void m1() {
		System.out.println("m1() impl");
	}
}



public class InterfaceInheritanceDemo {

}
