import java.util.ArrayList;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }

    System.out.println("New Feature Added");
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Amit"));
        students.add(new Student(2, "Neha"));

        for (Student s : students) {
            System.out.println(s);
        }
    }
}