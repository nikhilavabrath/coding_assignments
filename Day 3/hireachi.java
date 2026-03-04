class parent {
    int a;
    String n;
    parent(String n,int a){
        this.n=n;
        this.a=a;
    }
    void disp(){
        System.out.println(n+" "+a);
    }
}
class man extends parent{
    int r;
    man(String n,int a,int r){ 
        super(n,a);
        this.r=r;   
    }
    void show(){
        System.out.println(n+" "+a+" "+r);
    }
}

class man1 extends parent{
    int c;
    man1(String n,int a,int c){ 
        super(n,a);
        this.c=c;   
    }
    void show1(){
        System.out.println(n+" "+a+" "+c);
    }
}

public class hireachi {
    public static void main(String args[]){
    man m=new man("ABC",20,533);
    m.show();

    man1 m1=new man1("ABC",21,7854);
    m1.show1();
}
}
