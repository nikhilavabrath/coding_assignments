class Teacher {
    String n;

    Teacher(String n) {
        this.n = n;
    }

    void show() {
        System.out.println(n);
    }
}

class Student {
    String n;

    Student(String n) {
        this.n = n;
    }

    void learn(Teacher t) {
        System.out.println(n + " learns from " + t.n);
    }
}

public class Association {
    public static void main(String args[]) {

        Teacher t = new Teacher("mahesh");
        Student s = new Student("ganesh");

        s.learn(t);
    }
}