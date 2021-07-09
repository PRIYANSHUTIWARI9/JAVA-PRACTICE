public class DAY4_question2 {
    public static void main(String[] args) {
        int row=8;
        int alpha=65;
        for(int i=0; i<=row;i++)
        {
            for(int k=i;k<=row;k++)
            {
                System.out.print(" ");
            }
            for(int j =0; j<=i;j++)
            {
                System.out.print((char)(alpha+j)+" ");
            }
            System.out.println();
        }
    }
    
}
