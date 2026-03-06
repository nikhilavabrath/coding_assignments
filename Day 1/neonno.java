public class neonno {
    public static void main(String args[]){
        int n=9;
        int s=n*n;
        int a=s%10;
        int b=s/10;
        int d=a+b;
        if (d==n)
            System.out.println("Neon number");
        else
            System.out.println("Not");
    }
}
