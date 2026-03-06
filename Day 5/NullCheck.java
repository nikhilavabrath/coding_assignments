class NullCheck {
    public static void main(String[] args) {

        String s = null;

        try {
            if (s.equals("test"))
                System.out.println("Same");
            else
                System.out.println("Not Same");
        } 
        catch (NullPointerException e) {
            System.out.println("NullPointerException Caught");
        }
    }
}