enum Laptop {
    Mackbook(2000),
    Surface(2500),
    Dell(1500);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
public class enumClass {
    public static void main(String[] args) {
        
        // Laptop lap = Laptop.Dell;
        // System.out.println(lap + " : " + lap.getPrice());

        // lap.setPrice(1000);
        // System.out.println(lap + " : " + lap.getPrice());

        for(Laptop lap: Laptop.values()) {
            System.out.println(lap + ": " + lap.getPrice());
        }
    }
}
