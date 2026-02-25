public class prime {
    public static void main(String args[]){
        int n=15;
        boolean p=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                p=false;
                break;
            }
        }
        if(p) System.out.println("Prime number");
        else System.out.println("Not a prime number");
    }
    
}
