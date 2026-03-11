class animal {
    int a;
    String n;
    animal(String n,int a){
        this.n=n;
        this.a=a;
    }
    void disp(){
        System.out.println(n+" "+a);
    }
}
class dog extends animal{
    int r;
    dog(String n,int a,int r){ 
        super(n,a);
        this.r=r;   
    }
    void show(){
        System.out.println(n+" "+a+" "+r);
    }
}
public class inheritance{
public static void main(String args[]){
    dog m=new dog("ABC",20,533);
    m.show();
}
}