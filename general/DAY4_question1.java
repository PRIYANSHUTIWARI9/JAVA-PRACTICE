class Day4_question1{
    public static void main(String[] args) {
        int row=8;
        int alpha = 65;
        for(int i= row; i>=0; i--)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print((char)(alpha+j));
            }
            System.out.println();
        }
        for(int i= 1; i<=row-1; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print((char)(alpha+j));
            }
            System.out.println();
        }
    }
}