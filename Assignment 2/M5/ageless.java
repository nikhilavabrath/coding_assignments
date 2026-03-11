public class ageless{

    static void check(int age){
        if(age<18){
            throw new ArithmeticException("age less than 18");
        }
        else{
            System.out.println("allowed");
        }
    }

    public static void main(String args[]){

        try{
            check(16);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}