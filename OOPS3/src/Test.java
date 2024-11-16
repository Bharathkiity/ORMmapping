class grandparent {
    int a = 10;
    int b = 20;
}

class Parent {
    int a = 10;
    int b = 20;
    int x = 111;
}

class Child extends Parent {
    int a = 100;
    int b = 200;
    int y = 222;

    void add(int a, int b) {
        System.out.println(a + b); // Local variables
        System.out.println(this.a + this.b); // Child class instance variables
        System.out.println(super.a + super.b); // Parent class instance variables

        grandparent p = new grandparent();
        System.out.println(p.a + p.b); // grandparent instance variables

        System.out.println(x); // Parent class instance variable
        System.out.println(y); // Child class instance variable
    }
}

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.add(1000, 2000);
    }
}
