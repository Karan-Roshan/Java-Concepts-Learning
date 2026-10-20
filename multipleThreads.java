class greet extends Thread {

    public void run() {
        for(int i=1; i<=10; i++) {
            System.out.println("Hello");
        }

    }
}

class greeting extends Thread {
    public void run() {

        for(int i=1; i<=10; i++) {
            System.out.println("Hlo");
        }

    }
}

public class multipleThreads {
    public static void main(String[] args) {

        greet obj1 = new greet();
        greeting obj2 = new greeting();

        obj1.start();
        obj2.start();
    }
}
