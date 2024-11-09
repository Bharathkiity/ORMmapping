class yellow extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=1;i++) {
			System.out.println("yellow");
			try {
				Thread.sleep(1);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
		}
		
	}
}
class redThread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=1;i++) {
			System.out.println("red");
			try {
				Thread.sleep(10);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
		
	}
}}
class green extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=1;i++) {
			System.out.println("green");
			try {
				Thread.sleep(10);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
		
	}}
}
public class Task {
	public static void main(String[] args) throws InterruptedException {
		for(;;) {//ifinite loops
		yellow y=new yellow();
		y.start();
		y.join();
		

		redThread r=new redThread();
		r.start();
		r.join();
		
		green g=new green();
		g.start();
		g.join();
		}
	}
}