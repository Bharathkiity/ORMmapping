class BahubaliThread extends Thread{
	int total=0;
	@Override
	public void run() {
		System.out.println("2.bhabali thread begins calculations");

		for(int i=1;i<=100;i++) {
			total +=i;
		}
		System.out.println("3.bhaubali thread gives notification");

		synchronized (this) {
			//this.notify();only for one method
			notifyAll();//b.is optional for all notification
		}
		
	//	this.notify();//not call directly call from synchrozed area 
		//connecting interconnect network or database connection
	}
	
}
public class InterThreadCommunication {
public static void main(String[] args) throws InterruptedException {
	BahubaliThread b=new BahubaliThread();
	b.start();
	//main thread
	Thread.sleep(1000);//infinite ways this problem
	//b.join();//no other thread will start 
	//b.wait(); not call diectly // sync block
	System.out.println("1.main thread calling wait()");
	synchronized (b) {
//		b.wait(100);
//		b.wait();
		b.wait(10000,500);
	}
	System.out.println("4.main thread gets notification then call");
	System.out.println(b.total);
}
	
}
