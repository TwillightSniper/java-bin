import java.util.*;

class ts4
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("1. Sum of the series");
        System.out.println("2. Print the series");
        System.out.print("Enter your choice: ");
        int ch = in.nextInt();

        switch(ch)
        {
            case 1:
                double sum = 0;
                int fact = 1;

                for(int i = 1; i <= 11; i++)
                {
                    if(i % 2 == 1)
                    {
                        fact = 1;

                        for(int j = 1; j <= i; j++)
                            fact = fact * j;

                        if(i % 4 == 3)
                            sum = sum - i / fact;
                        else
                            sum = sum + i / fact;
                    }
                }

                System.out.println("Sum = " + sum);
                break;

            case 2:
                int n = 0;

                for(int i = 1; i <= 5; i++)
                {
                    n = n * 10 + 1;
                    System.out.print(n + " ");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}