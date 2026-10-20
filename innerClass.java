class Outer {
    private int x = 10;

    public void show() {
        System.out.println(x);
    }

    class Inner {
        void display() {
            System.out.println("x = " + x);
        }
    }
}

class innerClass{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();

        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}