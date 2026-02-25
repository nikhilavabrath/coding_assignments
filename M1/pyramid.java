public class pyramid {
    public static void main(String args[]){
        int n=5;
        for(int i=0;i<n;i++){
            System.out.println("");
            for(int j=0;j<n-1;j++){
                System.out.print("");
            }
            for(int k=1;k<=2*i+1;k++){
                System.out.print("*");
            }
        }
    }
    
}
