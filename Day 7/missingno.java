public class missingno {
    public static void main(String args[]){
    int[] arr={1,2,4,5,6};
    int n=arr.length;
    int cursum=0;
    for(int ele:arr){
         cursum+=ele;
    }
    int realsum=n*(n+1)/2;
    int miss=cursum-realsum;
    System.out.println(miss);
}
}

