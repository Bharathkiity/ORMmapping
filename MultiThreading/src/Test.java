class Programming{
	
}
//1.using thread class
class JavaThread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("java");
			try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

//2.Runnable interface
class pythonThread extends Programming implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("python");
			try {
				Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
		}
		
	}
}
class AngularThread extends Thread{
	@Override
	public void run() {
		for(;;) {
			System.out.println("Angular");
			try {
				Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			
		}
		
	}
}

public class Test {
public static void main(String[] args) throws InterruptedException{
	JavaThread j=new JavaThread();
	j.start();//to begin user defined thread
	j.join();
	//j.start();//IllegalThreadStateException
	//j.run();//new thread wont be created,execute like a normal method
	
	pythonThread p=new pythonThread();
	//p.start() not call compilation error need to create thread class object
	Thread t=new Thread(p);
	t.start();
	t.join();
	
//	main thread
//	for(int i=1;i<=10;i++) {
//		System.out.println("main");
//	}
	AngularThread a=new AngularThread();
	a.start();
	a.join();
}
}
