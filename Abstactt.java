// Example program of abstraction
abstract class Car {
    abstract void drive();

    abstract void sunRoof();

    public void music() {
        System.out.println("music is playing");

    }
}

abstract class Suzuki extends Car {

    void drive() {
        System.out.println("driving");
    }
}

class Lambo extends Suzuki {
    public void sunRoof() {
        System.out.println("sunroof is open");
    }
}

public class Abstactt {
    public static void main(String[] args) {
        Car c1 = new Lambo();
        c1.music();
        c1.drive();
        c1.sunRoof();

    }
}
