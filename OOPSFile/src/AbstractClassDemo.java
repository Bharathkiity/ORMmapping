interface Vehicle{
	void wheels(); 
	void start();
	void move();
	void stop();
}
//if Class having any defination then class name as abstr
abstract class myVehicle  implements Vehicle{
	public void start() {
		System.out.println("start.....");
	}
	public void move() {
		System.out.println("move.....");
	}
	public void stop() {
		System.out.println("stop.....");
	}
	public abstract void wheels();
	
}
class Bike extends myVehicle{
	@Override
	public void wheels(){
		System.out.println("2 wheels");
		
	}
}
class Car extends myVehicle{
	@Override
	public void wheels(){
		System.out.println("4 wheels");
		
	}
}

public class AbstractClassDemo {
	public static void main(String[] args) {
		//myVehicle mv=new myVehicle();
		Bike b=new Bike();
		b.wheels();
		b.start();
		b.stop();
		b.move();
		
		Car c=new Car();
		c.wheels();
		c.start();
		c.stop();
		c.move();
		//c.wheels();
	
	}

}
