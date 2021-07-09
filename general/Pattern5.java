public class Pattern5 {
    public static void main(String[] args) {
        int alpha = 65;
        int row =8;
        for(int i=0; i<=row; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print((char)(alpha + i));
            }
            System.out.println();
        }
    }
    
}
