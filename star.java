 class star {
    public static void main(String args[]) {
    int n=5;

    for(int i=0;i<n;i++){
        System.out.print("* ");
    }
    System.out.println();


    for(int i=0;i<n;i++){
        System.out.print("* ");
        for(int j=0;j<=n-1;j++){
            System.out.print(" ");
        }
        System.out.println(" *");
    }

    
    for(int k=1;k<=n;k++){
        System.out.print("* ");
    }
}
}