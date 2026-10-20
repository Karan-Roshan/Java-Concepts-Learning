class Phone {
    String brand;   // Instance variable
    int price;      // Instance variable
    static String name;    // static variable

    void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    static void display(Phone obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class staticMethod {
    public static void main(String[] args) {
        Phone obj1 = new Phone();
        obj1.brand = "Apple";
        obj1.price = 15000;
        Phone.name = "SmartPhone";

        Phone obj2 = new Phone();
        obj2.brand = "Sumsung";
        obj2.price = 17000;
        Phone.name = "Phone";

        // obj1.show();
        // obj2.show();

        Phone.display(obj1);
        Phone.display(obj2);
    }
}