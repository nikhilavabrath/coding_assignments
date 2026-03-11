import java.io.*;

public class check{
    public static void main(String args[]){

        try{
            int a=10/0;
        }
        catch(Exception e){
            System.out.println("unchecked exception");
        }

        try{
            FileReader f=new FileReader("abc.txt");
        }
        catch(IOException e){
            System.out.println("checked exception");
        }
    }
}