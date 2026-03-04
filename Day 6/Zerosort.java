import java.util.Arrays;

class Zerosort {
    public static void main(String[] args) {

        int a[] = {0,1,1,0,1,0};

        Arrays.sort(a);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}