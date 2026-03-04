class St {
    String name;
    int age;
    St() {
        name = "Default : ";
        age = 0;
    }
    St(String n, int a) {
        name = n;
        age = a;
    }
    void disp() {
        System.out.println(name + " " + age);
    }
}
public class defaultc {
    public static void main(String[] args) {
        St s1 = new St();
        St s2 = new St("King : ", 21);
        s1.disp();
        s2.disp();
    }
}