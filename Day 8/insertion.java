public class insertion {
    public static void main(String args[]){
        int a[]={29,8,7,68,95};
        int n=a.length;
        for(int i=0;i<n;i++){
            int k=a[i];
            int j=i-1;
            while(j>=0&&a[j]>k){
                a[j+1]=a[j];
                j--;
            }

        a[j+1]=k;
    }
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
}
}
