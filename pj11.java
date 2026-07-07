import java.util.*;

class pj11
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("1. Display Pattern 1 (ABCDE...)");
        System.out.println("2. Display Pattern 2 (B, LL...)");
        System.out.print("Enter your choice: ");
        int ch = in.nextInt();

        switch(ch)
        {
            case 1:
                for(int i = 5; i >= 1; i--)
                {
                    char c = 'A';
                    for(int j = 1; j <= i; j++)
                    {
                        System.out.print(c);
                        c++;
                    }
                    System.out.println();
                }
                break;

            case 2:
                String str = "BLUE";
                int l = str.length();

                for(int i = 0; i < l; i++)
                {
                    char c = str.charAt(i);
                    for(int j = 0; j <= i; j++)
                    {
                        System.out.print(c);
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}