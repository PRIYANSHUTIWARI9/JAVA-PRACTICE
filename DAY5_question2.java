public class DAY5_question2 {
   public static void main(String[] args) {
    int row = 8;
    for(int i=1; i<=row; i++)
    {
        for(int j=i; j<=row; j++)
        {
            System.out.print(" ");
        }
        for(int k=i;k<=i;k++)
        {
            System.out.print("*");
        }
        System.out.println();     
    }
   }
    
}
