class gc{
    public void finalize(){
        System.out.println("object removed");
    }
}

public class gcdemo{
    public static void main(String args[]){

        gc g1=new gc();
        gc g2=new gc();

        g1=null;
        g2=null;

        System.gc();
    }
}