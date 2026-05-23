import java.util.*;

class Q14
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("1. Calculate c");
        System.out.println("2. Pattern");

        int ch = in.nextInt();

        switch(ch)
        {
            case 1:
            double b = 3.0;

            for(double a=1.0; a<=20.0; a+=2.0)
            {
                double c = a*a + 2*a*b;
            System.out.println("a="+ a +" c = " + c);
            }
            break;

            case 2:
            for(int i=1;i<=5;i++)
            {
                for(char c='A'; c<'A'+i; c++)
                    System.out.print(c);
                System.out.println();
            }
            break;

            default:
            System.out.println("Invalid choice");
        }
    }
}