interface Car {
    void start();
    void stop();
}

class BMW implements Car {
    public void start() {
        System.out.println("BMW starts with a button");
    }

    public void stop() {
        System.out.println("BMW stops");
    }
}

public class interfaceInJava {
    public static void main(String[] args) {

        BMW car = new BMW();

        car.start();
        car.stop();
    }
}