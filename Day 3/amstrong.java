//import java.math.*;
public class amstrong {
    public static void main(String args[]){
        int n=159;
        int co=0,temp=n;
        double s=0;
        while(temp>0){
            co++;
            temp=temp/10;
        }
        temp=n;
        while(temp>0){
            int d=temp%10;
            s=s+Math.pow(d,co);
            temp=temp/10;
        }
        if(s==n)
        System.out.println("Armstrong");
        else 
            System.out.println("Not Armstrong");
    }
    
}
