class OddEven {
    public static void main(String[] args) {

        int a[] = {10,12,14,7,8};
        int c = 1;

        for(int i=1;i<a.length;i++){
            if(a[i]%2==0 && a[i-1]%2!=0 || a[i]%2!=0 && a[i-1]%2==0){
                c++;
            }
        }

        System.out.println(c);
    }
}