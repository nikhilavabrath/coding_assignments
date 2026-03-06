public class area {
    int a,p,l,b;
    area(int l,int b){
        this.l=l;
        this.b=b;
    }
    void disp(){
        int a=l*b;
        int p=l+b;
        System.out.println("Area : "+a);
        System.out.println("Perimeter : "+p);
    }
    public static void main(String args[]){
        area abc=new area(10,5);
        abc.disp();
    }
    
}
      