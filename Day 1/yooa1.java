public class yooa1 {
    static int catlan(int n){
    if(n<=1) return 1;
    int res=0;
    for (int i=0;i<n;i++){
        res=res+catlan(i)*catlan(n-i-1);
    }
    return res;
}   
public static void main(String args[]){
    int n=10;
    for(int i=0;i<n;i++){
        System.out.println(catlan(i)+" ");
    }
}
}
