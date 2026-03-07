public class jump {
    public static void main(String args[]){
        int a[]={1,2,5,7,3};
        int n=a.length,k=12;
        int s=(int)Math.sqrt(n),prev=0;
        while(a[Math.min(s,n)-1]<k){
            prev=s;
            s=s+(int)Math.sqrt(n);
            if(prev>=n){
                System.out.println("ele not found");
                return;
            }
        }
        for(int i=0;i<Math.min(s,n);i++){
            if(a[i]==k){
                System.out.println("ele found at "+i);
            }
        }
    }
    
}
