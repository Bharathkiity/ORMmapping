class grandparent{//by using object can call 
	int a=10;
	int b=20;
	
}
class Parent {
    int a = 10;
    int b = 20;
    int x = 111;
}
class Child extends Parent {//super can call only parent not grandparent
    int a = 100;
    int b = 200;
    int y = 222;
    
    void add(int a, int b) {//static-this,super not use in static methoad
        System.out.println(a + b);
        System.out.println(this.a + this.b);//current class instance,varaible
        System.out.println(super.a + super.b);//parent call methods,variable
        
        grandparent p=new grandparent();
        System.out.println(p.a+p.b);
//        System.out.println(x);
//        System.out.println(y);
    }
}
public class Test{
    public static void main(String[] args) {
        Child c = new Child();
        c.add(1000, 2000);
    }
}
