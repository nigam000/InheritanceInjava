//Base class
class A {
    public void display() {
        System.out.println("Class A");
    }
}

// Abstract Class
interface E {
    public void display();
}

// Single Level Inheritence
class B extends A {
    public void display() {
        super.display();
        System.out.println("Class B with parent class A having Single Level Inheritance");
    }
}

// Heirarchial Inheritence
class C extends A {
    public void display() {
        System.out.println("Class C with parent class A");
    }
}

// Multiple Inheritence, Multilevel Inheritence
class D extends B implements E {
    public void display() {
        super.display();
        System.out.println("Class D with parent class B");
    }
}

public class practice {
    public static void main(String[] args) {
        A a = new D();
        a.display();
        }
}

//Output
// Class A
// Class B with parent class A having Single Level Inheritance
// Class D with parent class B