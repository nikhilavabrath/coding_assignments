

class user{
void showu(String name){
    System.out.println("User name : "+name);
}
    }


class customer extends user{
    void pay(double price){
        System.out.println("Amount paid : "+price);  
    }
}
  
class premium extends customer{
    void pay(double price){
        double dis=price*10/100;
        double fin=price-dis;
        System.out.println("Premiun pay : ");
        System.out.println("Original amt: "+price);
        System.out.println("Discount : "+dis);
        System.out.println("Final price "+fin);
    }
}
class deli extends user{
    void rec(double in){
        System.out.println("Deliveray part rate : "+in);
    }
}


public class swiggy { 
    public static void main(String args[]){
        System.out.println("\n ======Normal User=====");
        customer c=new customer();
        //c.name="Ganesh";
        c.showu("Ganesh");
        c.pay(1000);
        System.out.println("\n\n =====preimum=====");
        customer c2=new premium();
        //c2.name="ganiii";
        c2.showu("ganiii");
        c2.pay(1000);


        System.out.println("\n\n =======Delivery partner=====");
        deli c1=new deli();
        c1.showu("bosss");
        c1.rec(100);

    } 
    
}
