interface B{
    void show();
}
class C {
    String name;
    C(String name){
       this.name=name;
    }
}
class ISE extends C implements B{
    int r;
    ISE(String name,int r){
        super(name);
        this.r=r;
    }
    public void show(){
        System.out.println("Hello");
    }
        public void show1(){
        System.out.println(name+" "+r);
    }
}

public class hybrid {
    public static void main(String[] args){
        ISE s=new ISE("ABC",10);
        s.show();
        s.show1();
    }
    
}
