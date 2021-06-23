public class DAY5_question4 {
    public static void main(String[] args) {
        int row=4;
        for(int i=1; i<=row; i++)
        {
            for(int k=row-1; k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=1;i<=row-1;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=row-1 ; j>=i;j--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}
