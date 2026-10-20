/* final */ class Calc {
    public /* final */ void show() {
        System.out.println("In Calc show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc {
    public void show() {
        System.out.println("In Calc show");
    }
}

public class finalKeyword {
    public static void main(String[] args) {
        
        // ---- final variable ----
        // final int num = 10;
        // // num = 11;
        // System.out.println(num);

        // ---- final class ----
        Calc obj = new AdvCalc();
        obj.show();
        obj.add(4, 9);
    }
}
