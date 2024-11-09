 class MyMath{
	//only one thread is allowed to access -thread safety-synchroinized
   //thread requires object level lock
	public synchronized void printMulitpleTable(int num) {
		for(int i=0;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	 //instance method
	//static synchronized method
   //required class level lock
public static synchronized void  printSquare(int num) {
	for(int i=0;i<=num;i++) {
		System.out.println(i*i);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}
}}
class NTR extends Thread{
	MyMath m;
	public  NTR(MyMath m) {
		this.m=m;
	}
	@Override
	public void run() {
	m.printMulitpleTable(10);
	}
}
class Ram extends Thread{
	MyMath m;
	public  Ram(MyMath m) {
		this.m=m;
	}
	@Override
	public void run() {
	m.printMulitpleTable(11);
	}
}
class Arjun extends Thread{
	MyMath m;
	public  Arjun(MyMath m) {
		this.m=m;
	}
	@Override
	public void run() {
	//m.printMulitpleTable(2);
	   m.printSquare(11);
	}
}

public class SynchronizationDemo {
public static void main(String[] args) {

	MyMath m=new MyMath();
	
	NTR ntr =new NTR(m);
	Ram ram=new Ram(m);
	Arjun arjun=new Arjun(m);
	
	ntr.start();
	//ntr.start();
	ram.start();
	arjun.start();
	

}}
