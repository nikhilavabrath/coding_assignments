class life extends Thread{

    public void run(){
        System.out.println("thread running");
    }

    public static void main(String args[]){

        life t=new life();

        System.out.println(t.getState());

        t.start();

        System.out.println(t.getState());
    }
}