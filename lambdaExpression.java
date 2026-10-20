@FunctionalInterface 
interface A {
    void add(int a, int b);
}

class lambdaExpression {
    public static void main(String[] args) {
        
        A obj = (a, b) -> System.out.println(a + b);

        obj.add(10, 20);
    }
}