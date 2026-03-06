public class slidingwindow {
    public static void main(String args[]){
        int a[]={3,8,2,5,7,6,12};
        int n=a.length;
        int w=4,cursum=0;
        for(int i=0;i<w;i++){
            cursum=cursum+a[i];
        }
        int maxsum=cursum;
        for(int i=1;i<=n-w;i++){
            cursum=cursum-a[i-1]+a[i+w-1];
            if(cursum>maxsum){
                maxsum=cursum;
            }
        }
        System.out.println(maxsum);
    }
    
}
