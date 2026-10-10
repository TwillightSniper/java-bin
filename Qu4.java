import java.util.*;

class Qu4
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int ch, i, j,num;
        double sum, fact;
        System.out.println("1. Sum of the series");
        System.out.println("2. Print the series");
        System.out.print("Enter your choice: ");
        ch = in.nextInt();
        switch(ch)
        {
            case 1:
                sum = 0;
                for(i = 3; i <= 11; i = i + 2)
                {
                    fact = 1;
                    for(j = 1; j <= i; j++)
                        fact = fact * j;
                    if(i == 3 || i == 7 || i == 11)
                        sum = sum + i / fact;
                    else
                        sum = sum - i / fact;
                }
                System.out.println("Sum = " + sum);
                break;
            case 2:
                num = 0;
                for(i = 1; i <= 5; i++)
                {
                    num = num * 10 + 1;
                    System.out.print(num + " ");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}