class myex extends Exception{
    myex(String s){
        super(s);
    }
}

public class excep{

    static void check(int a) throws myex{
        if(a<0){
            throw new myex("negative number");
        }
        else{
            System.out.println("number ok");
        }
    }

    public static void main(String args[]){
        try{
            check(-5);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}