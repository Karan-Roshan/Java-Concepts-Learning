class Animals {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class anonymousInnerClass {
    public static void main(String[] args) {

        Animals obj = new Animals() {
            @Override
            void sound() {
                System.out.println("Dog barks");
            }
        };

        obj.sound();
    }
}