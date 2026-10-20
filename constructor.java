class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class constructor {
    public static void main(String[] args) {
        Student s = new Student("Karan roshan", 21);

        System.out.println(s.name + " : " + s.age);
    }
}
