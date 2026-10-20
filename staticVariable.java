class Mobile {
    String brand;   // Instance variable
    int price;      // Instance variable
    static String name;    // Instance variable

    void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class staticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 15000;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Sumsung";
        obj2.price = 17000;
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
    }
}