class deadlock{

    public static void main(String args[]){

        String a="mahesh";
        String b="suresh";

        Thread t1=new Thread(()->{
            synchronized(a){
                System.out.println("thread1 locked a");

                synchronized(b){
                    System.out.println("thread1 locked b");
                }
            }
        });

        Thread t2=new Thread(()->{
            synchronized(b){
                System.out.println("thread2 locked b");

                synchronized(a){
                    System.out.println("thread2 locked a");
                }
            }
        });

        t1.start();
        t2.start();
    }
}