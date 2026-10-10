import java.util.*;

class Q6
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);

        System.out.println("1. Pattern (a)");
        System.out.println("2. Pattern (b)");
        System.out.print("Enter your choice: ");
        int ch=in.nextInt();

        switch(ch)
        {
            case 1:
            for(int i=1;i<=5;i++)
            {
                for(int j=1;j<=5;j++)
                {
                    if(j<=i)
                        System.out.print(i);
                    else
                        System.out.print("#");
                }
                System.out.println();
            }
            break;

            case 2:
            for(int i=1;i<=5;i++)
            {
                char ch1=(char)(64+i);

                for(int j=5;j>=i;j--)
                {
                    if(j%2==0)
                        System.out.print(Character.toLowerCase(ch1));
                    else
                        System.out.print(ch1);
                }

                System.out.println();
            }
            break;

            default:
            System.out.println("Invalid Choice");
        }
    }
}