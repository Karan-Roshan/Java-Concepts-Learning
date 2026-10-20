class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class advCalc extends Calc{
    public int mult(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

class veryAdvCalc extends advCalc {
    public int mod(int n1, int n2) {
        return n1 % n2;
    }

    public double pow(int n1, int n2) {
        return Math.pow(n1, n2);
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int r1 = obj.add(5, 7);
        int r2 = obj.sub(10, 7);
        System.out.println(r1 + " " + r2);


        advCalc obj1 = new advCalc();
        int r3 = obj1.add(12, 7);
        int r4 = obj1.sub(10, 7);
        int r5 = obj1.mult(4, 7);
        int r6 = obj1.div(10, 5);
        System.out.println(r3 + " " + r4 + " " +  r5 + " " +  r6);

        veryAdvCalc obj2 = new veryAdvCalc();
        int r7 = obj2.add(12, 7);
        int r8 = obj2.sub(10, 7);
        int r9 = obj2.mult(4, 7);
        int r10 = obj2.div(10, 5);
        int r11 = obj2.mod(10, 5);
        double r12 = obj2.pow(4, 2);
        System.out.println(r7 + " " + r8 + " " +  r9 + " " +  r10 + " " + r11 + " " + r12);
    }
}