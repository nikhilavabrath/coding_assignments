class Overload {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

class OverrideBase {
    void display() {
        System.out.println("Base class ");
    }
}

class OverrideDerived extends OverrideBase {
    void display() {
        System.out.println("Derived class ");
    }
}

public class rideload {
    public static void main(String[] args) {
        Overload obj = new Overload();
        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(2.5, 3.5));

        OverrideBase base = new OverrideBase();
        OverrideBase derived = new OverrideDerived();
        base.display();
        derived.display();
    }
}