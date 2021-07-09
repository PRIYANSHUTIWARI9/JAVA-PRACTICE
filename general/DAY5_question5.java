public class DAY5_question5 {
    public static void main(String[] args) {
        int row=8;
    for(int i=1; i<=row; i++)
    {
        for(int j =1;j<=row; j++ )
        {
            if(i==1 || j==1 || i==row || j==row || i==j  )
            {
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
            
        }
        System.out.println();

    }
    
    }
}
