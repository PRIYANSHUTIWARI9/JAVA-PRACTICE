public class Pattern3 {
    public static void main(String[] args) {
        int row = 9;
        for(int i=1; i<=row; i++)
        {
            for(int j=i; j<=row; j++)
            {
                System.out.print(j+" ");
            }
            for(int k=1;k<=i; k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    
}
