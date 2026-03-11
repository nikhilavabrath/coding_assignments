class t1 extends Thread{
    public void run(){
        System.out.println("thread class running");
    }
}

class t2 implements Runnable{
    public void run(){
        System.out.println("runnable running");
    }
}

public class threadrun{
    public static void main(String args[]){

        t1 a=new t1();
        a.start();

        t2 b=new t2();
        Thread t=new Thread(b);
        t.start();
    }
}