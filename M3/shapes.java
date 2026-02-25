class parent{
    int l,b,h,r;
    parent(int l,int b,int h,int r){
        this.l=l;
        this.b=b;
        this.h=h;
        this.r=r;
    }
}
class tri extends parent{
    tri(int b,int h){
        super(0,b,h,0);
        //int a=(b*h)/2;
    }
    void disp(){
        int a=(b*h)/2;
        System.out.println("Triangle : "+a);

    }
}

class rect extends parent{
    rect(int l,int b){
        super(l,b,0,0);
    }
    void disp(){
        int p=l*b;
        System.out.println("Rectangle : "+p);
    }
}

class cir extends parent{
    cir(int r){
        super(0,0,0,r);
    }
    void disp(){
        double n=Math.PI*r*r;
        System.out.println("Circle : "+n);
    }
}

public class shapes {
    public static void main(String args[]){
        tri t=new tri(2,5);
        rect r=new rect(2,5);
        cir c=new cir(5);
        t.disp();
        r.disp();
        c.disp();
    }
    
}
