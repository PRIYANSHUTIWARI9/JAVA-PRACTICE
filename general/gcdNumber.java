import java.util.Scanner;

public class gcdNumber {

    public static int check(int a, int b)
    {
        while(a !=b)
        {
            if(a>b)
            {
                a = a-b;
            }
            else
            {
                b = b-a;
            }
        }
        return a;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(check(num1 , num2) +" is the GCD number");

        // USING FOR LOOP :-
        /*int gcd =1;
        for(int i=1; i<= num1 && i<=num2; i++)
        {
            if(num1%i==0 && num2%i== 0)
            {
                gcd = i;
            }
        
        }
        System.out.println(gcd + " is a GCD");*/
        sc.close();

    }
    
}
