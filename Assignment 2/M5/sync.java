class counter{
    int c=0;

    synchronized void inc(){
        c++;
    }
}

class sync{
    public static void main(String args[]) throws Exception{

        counter ob=new counter();

        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                ob.inc();
            }
        });

        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++){
                ob.inc();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(ob.c);
    }
}