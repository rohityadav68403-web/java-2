
class A {
    void showA() {
        System.out.println("This is Class A");
    }
}

class B extends A {
    void showB() {
        System.out.println("This is Class B");
    }
}

class C extends B {
    void showC() {
        System.out.println("This is Class C");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();

        obj.showA();
        obj.showB();
        obj.showC();
    }
}
