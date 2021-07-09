public class stringTOint {
    public static void main(String[] args) {
        String str = "359";
        //USING Integer.parseInt()
        int n= Integer.parseInt(str);
        // USING Integer.valueOf()
        int num= Integer.valueOf(str);
        System.out.println(n);
        System.out.println(num);
    }
    
}
