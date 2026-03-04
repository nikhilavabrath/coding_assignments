interface payment{
    void pay(double a);
}

class credit implements payment{
    public void pay(double a){
        System.out.println("credit payment "+a);
    }
}

class upi implements payment{
    public void pay(double a){
        System.out.println("upi payment "+a);
    }
}

public class paydemo{
    public static void main(String args[]){
        payment p1=new credit();
        payment p2=new upi();

        p1.pay(500);
        p2.pay(700);
    }
}