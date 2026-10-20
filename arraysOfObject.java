class Student {
    int rollno;
    String name;
    int marks;
}

public class arraysOfObject {
    public static void main (String a[]) {

        Student s1 = new Student();
        s1.rollno = 01;
        s1.name = "Karan";
        s1.marks = 97;

        Student s2 = new Student();
        s2.rollno = 02;
        s2.name = "Roshan";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollno = 03;
        s3.name = "Anmol";
        s3.marks = 87;

        
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i=0; i<students.length; i++) {
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }

        for(Student n : students) {
            System.out.println(n.name + " : " + n.marks);
        }

    }
}