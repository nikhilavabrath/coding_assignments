class Stud {
    String n;

    Stud(String n) {
        this.n = n;
    }
}

class Department {
    String depn;
    Stud s;

    Department(String depn, Stud s) {
        this.depn = depn;
        this.s = s;
    }

    void show() {
        System.out.println(s.n + " belongs to " + depn);
    }
}

public class Aggregation {
    public static void main(String args[]) {

        Stud s = new Stud("mahesh");
        Department d = new Department("CSE", s);

        d.show();
    }
}