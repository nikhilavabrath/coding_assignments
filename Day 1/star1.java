 class star1 {
    public static void main(String args[]) {
    int r=6,c=7;
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if((i==0 && j%3 !=0) || (i==4 && j%3 == 0) || (i-j==2) || (i+j==8)){
                System.out.print("* ");
            }
            //else{
              //  System.out.print("  ");
            //}


    }
    System.out.println();
}
}
 }