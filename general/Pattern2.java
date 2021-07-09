public class Pattern2 {
    public static void main(String[] args) {
        int row =9;
        for(int i=1; i<=row; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for(int k=i; k<=row; k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(int i=row-1; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for(int k=i; k<=row; k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
