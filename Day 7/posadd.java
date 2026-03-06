public class posadd {
    public static void main(String args[]){
        int t=12,s=0,end=0,start=0;
        int a[]={1,2,3,7,5};
        int n=a.length;
        while(end<n){
            s=s+a[end];
            while(s>t){
            s=s-a[start];
            start++;
            }
            if(s==t){
                System.out.println((start+1)+" "+(end+1));
                break;
            }
                end++;
            } 
        } 
             

    }
    
