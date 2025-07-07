class constructor {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Pallavi", 21);
        Student s2 = new Student("Raj", 22);

        s1.display();
        s2.display();
    }
}
