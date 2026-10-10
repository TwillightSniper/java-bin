import java.util.*;

class Q3
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("1. Print the series");
        System.out.println("2. Find the sum of the series");
        System.out.print("Enter your choice: ");
        int ch = in.nextInt();

        switch(ch)
        {
            case 1:
            for(int i=1;i<=5;i++)
            {
                for(int j=i;j>=1;j--)
                    System.out.print(j);

                if(i<5)
                    System.out.print(", ");
            }
            break;

            case 2:
            int sum=0;

            for(int i=1;i<=5;i++)
            {
                int n=0;

                for(int j=i;j>=1;j--)
                    n=n*10+j;

                sum=sum+n;
            }

            System.out.println("Sum = "+sum);
            break;

            default:
            System.out.println("Invalid Choice");
        }
    }
}