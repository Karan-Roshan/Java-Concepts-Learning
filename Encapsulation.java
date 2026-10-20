class Human {
    private 
        String name;
        int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
       
    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        
        Human obj = new Human();

        // obj.name = 25;
        // System.out.println(obj.name);

        obj.setName("Karan Roshan");
        obj.setAge(21);

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
