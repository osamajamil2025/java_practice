// EXAMPLE PROGRAM OF ANONYMOUS CLASS
class A {
    public void show() {
        System.out.println("I am A");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("I am B");
            }
        };
        obj.show();
    }
}