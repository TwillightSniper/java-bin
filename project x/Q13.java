import java.util.*;

class Q13
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("1. Triangle");
        System.out.println("2. Inverted Triangle");

        int ch = in.nextInt();
        System.out.print("Enter terms: ");
        int n = in.nextInt();

        switch(ch)
        {
            case 1:
                int p=n-1,k;
            for(int i=n;i>=1;i--)
            {
                for(k=i;k<=p;k++)
                    System.out.print(" ");
                for(int j=i;j>=1;j--)
                    System.out.print("*");
                System.out.println();
            }
            break;

            case 2:
            for(int i=n;i>=1;i--)
            {
                for(int j=1;j<=i;j++)
                    System.out.print((char)(j+64));
                System.out.println();
            }
            break;

            default:
            System.out.println("Invalid choice");
        }
    }
}