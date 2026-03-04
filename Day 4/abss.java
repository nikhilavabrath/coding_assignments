//package Day 4;

abstract class parent {
    int a;
    String n;
    parent(String n,int a){
        this.n=n;
        this.a=a;
    }
    abstract void disp();
}
class man extends parent{
    int r;
    man(String n,int a,int r){ 
        super(n,a);
        this.r=r;   
    }
    void disp(){
        System.out.println(n+" "+a+" "+r);
    }
}



public class abss {
     public static void main(String args[]){
    man m=new man("ABC",20,533);
    m.disp();
}
}
