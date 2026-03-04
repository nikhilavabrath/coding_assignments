interface A{
    void show();
}

class C implements A{
    String n;
    int age;
    C(String n,int age){
        this.n=n;
        this.age=age;
    }
    public void show(){
       System.out.println(n +" "+age  ); 
    }
}


public class inter {
    public static void main(String args[]){
        C c=new C("Ganesh",25);
        c.show();
    }
    
}
