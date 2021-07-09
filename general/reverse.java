public class reverse {
    public static void main(String[] args) {
        String str = "I Love My India";

        int len = str.length();
        String revstr="";

        for(int i= len-1; i>=0; i--)
        {
            revstr = revstr + str.charAt(i);
        }
        System.out.println("Original String " + str);

        System.out.println("Reverse String " + revstr);
    }
    
}
