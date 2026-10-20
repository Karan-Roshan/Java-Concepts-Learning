abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class abstractClass {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
        a.eat();
    }
}