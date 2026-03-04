import java.util.Scanner;

public class calci {
 static int add(int a,int b){
    return a+b;
 }   
 static int mul(int a,int b){
    return a*b;
 }
 static int sub(int a,int b){
    return a-b;
 }
 static int div(int a,int b){
    if(b==0) return 0;
    else 
    return a/b;
 }
 public static void main(String[] args){
    int a=10,b=5,res=0;
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int v=sc.nextInt();
    switch(v){
        case 1:res=add(a,b);
                break;
        case 2:res=mul(a,b);
        break;
        case 3:res=sub(a,b);
        break;
        case 4:res=div(a,b);
        break;
        default : System.out.println("Errror");
        break;
    }

    sc.close();
    System.out.println(res);
 }
 //System.out.println(res); 
}
