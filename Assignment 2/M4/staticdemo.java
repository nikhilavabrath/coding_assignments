class stud{
    String n;
    static String clg="abc college";

    stud(String n){
        this.n=n;
    }

    static void info(){
        System.out.println("welcome");
    }

    void show(){
        System.out.println(n+" "+clg);
    }
}

public class staticdemo{
    public static void main(String args[]){
        stud.info();

        stud s1=new stud("mahesh");
        stud s2=new stud("suresh");

        s1.show();
        s2.show();
    }
}