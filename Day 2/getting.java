class st{
    private String name;
    private int a;
    st(String name,int a){
        this.name=name;
        this.a=a;
    }
    String Name(){
        return name;
    }
    int age(){
        return a; 
    }
    void Name(String name){
        this.name=name;    
    }
    void age(int a){
        this.a=a;
    }
}

public class getting {
    public static void main(String args[]){
        st s=new st("ABC",25);
        System.out.println(s.Name());
        System.out.println(s.age());
        s.Name("XYZ");
        s.age(35);
        System.out.println(s.Name());
        System.out.println(s.age());


        
    }
    
}
