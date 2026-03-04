public class happyno {
    public static void main(String args[]){
        int n=29,t=n;
        while(t!=1 && t!=4){
            int s=0;
            while(t>0){
            int a=t%10;
            s=s+a*a;
            t=t/10;
            }
            t=s;
            //System.out.println(t);
        }
        if(t==1)
            System.out.println("Happy number");
        else
            System.out.println("not Happy number");
            
    }
}
