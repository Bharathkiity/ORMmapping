package pack2;
import pack1.Calci;

public class myCalci extends Calci {
	public static void main(String[] args) {
		myCalci mc=new myCalci();
		//PROTECT
		System.out.println(mc.doubleIt(10));
		//PUBLIC
		System.out.println(mc.findCube(10));
		//PUBLIC PROPERTY
		System.out.println(mc.MATHS_VALUE);
		System.out.println(mc.size);
	}

}
