public class strdemo{
    public static void main(String args[]){

        String s="mahesh";
        s=s+" suresh";
        System.out.println(s);

        StringBuilder sb=new StringBuilder("ganesh");
        sb.append(" suresh");
        System.out.println(sb);

        StringBuffer sf=new StringBuffer("mahesh");
        sf.append(" ganesh");
        System.out.println(sf);
    }
}