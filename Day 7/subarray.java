public class subarray {
    public static void main(String args[]){
    int a[]={-1,-2,-3,-2,5};
    int cursum=a[0],maxsum=a[0];
    for(int i=0;i<a.length;i++){
        cursum=Math.max(a[i],cursum+a[i]);
        maxsum=Math.max(cursum,maxsum);
    }
    System.out.println(maxsum);
    } 
}
