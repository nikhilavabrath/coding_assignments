final class person{
    final int a=10;

    final void show(){
        System.out.println("value "+a);
    }
}

public class finaldemo{
    public static void main(String args[]){
        person p=new person();
        p.show();
    }
}