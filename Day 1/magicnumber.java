public class magicnumber {
    public static void main(String args[]){
    int n=19 ;
    if(n>9){
        int a=n%10;
        int b=n/10;
        int s=a+b;
        //System.out.println(s);
        int c=s%10;
        int d=s/10;
        int v=c+d;
        if(v==1)
            System.out.println( "Magic");
        else
            System.out.println("Not magic");
   
     } }
}

