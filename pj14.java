import java.util.*;

class pj14
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("1. Print Floyd's Triangle");
        System.out.println("2. Display 'ICSE' Pattern");
        System.out.print("Enter your choice: ");
        int ch = in.nextInt();

        switch(ch)
        {
            case 1:
                int number = 1;

                for(int i = 1; i <= 5; i++)
                {
                    for(int j = 1; j <= i; j++)
                    {
                        System.out.print(number + " ");
                        number++;
                    }
                    System.out.println();
                }
                break;

            case 2:
                String word = "ICSE";
                for (int i = 0;i <word.length();i++)
                {
                    for (int j = 0;j <= i;j++)
                    {
                        System.out.print(word.charAt(j));
                    }
                    System.out.println();
                }
            break;
            default:
                System.out.println("Error: Invalid choice");
                break;
        }
    }
}