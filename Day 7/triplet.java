public class triplet {
    public static void main(String args[]){
        int a[]={1,5,3,2};
        int c=0; 
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=0;k<a.length;k++){
                if(a[i]+a[j]==a[k]){
                    c++;
                }
            }
        }
            
        }
        System.out.println(c);
    }
    
}
