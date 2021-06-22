public class DAY4_question3 {
    public static void main(String[] args) {
        int row =8 ;
        for(int i =1;i<=row;i++)
        {
            for(int j=i;j<=row-1;j++)
            {
                System.out.print("1 ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
