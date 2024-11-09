
public class MethodDemo {
	
	//static method--utility purpose
	public static void findSquare(int num) {  //user Defined method
		int square=num*num;
		System.out.println(square);//direct access
		
	}
	//instance method  //non static methods
	public  static void findCube(int num) {
		int cube=num*num*num;
		System.out.println(cube);//direct access
		
	}
	public static int findMax(int num1,int num2) { 
		int max=(num1>num2)?num1:num2;
		
		return max;
		
	}
	public static double findTotal(double num1,double num2) {
		return num1+num2;
	
		
	}
	
	public static double findAvg(double num1,double num2) {//Return type and call in main method 
		double total=findTotal(num1,num2);
		double avg=total/2;
		return avg;
			
	}
	
	public static void main(String[] args) {
		
		double findavg=findAvg(44.5,55.5);//return type
		System.out.println(findavg);
		int findmax=findMax(10,85);//return type
		System.out.println(findmax);
		
		
		// acessing //non static methods// INSATNCE METHODS//object level
		MethodDemo m=new MethodDemo();
		m.findCube(10);
		
		
		
		//acess static methods 3 ways
		findSquare(5);//1.directly access with sample class
		m.findSquare(10);//2.refrrence variable(not recommend)
		MethodDemo.findSquare(10);//3.using class name
		
		}

}
