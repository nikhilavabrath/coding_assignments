public class selection {
    public static void main(String args[]){
        int a[]={29,30,10,47,18};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min])
                    min=j;
                }
                    int temp=a[min];
                    a[min]=a[i];
                    a[i]=temp;
                }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}

    

